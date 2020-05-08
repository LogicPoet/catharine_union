package com.catharine.gateway.util;

import com.catharine.common.constant.TokenConstant;
import com.catharine.common.tool.Charsets;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import javax.crypto.spec.SecretKeySpec;
import java.security.Key;
import java.util.Base64;
import java.util.Date;
import java.util.Map;

import static com.catharine.common.constant.TokenConstant.CLIENT_ID;

/**
 * @author LZ
 * @date 2020/4/9 9:43
 **/
public class JWTUtil {

    private static String BASE64_SECURITY = Base64.getEncoder().encodeToString(TokenConstant.SIGN_KEY.getBytes(Charsets.UTF_8));

    /**
     * 创建令牌
     *
     * @param user      user
     * @param audience  audience
     * @param issuer    issuer
     * @param tokenType tokenType
     * @return jwt
     */
    public static TokenInfo createJWT(Map<String, String> user, String audience, String issuer, String tokenType) {

        //String[] tokens = extractAndDecodeHeader();
        //assert tokens.length == 2;
        //String clientId = tokens[0];
        //String clientSecret = tokens[1];

        // 获取客户端信息
        //IClientDetails clientDetails = clientDetails(clientId);

        // 校验客户端信息
        //if (!validateClient(clientDetails, clientId, clientSecret)) {
        //    throw new SecureException("客户端认证失败!");
        //}

        SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256;

        long nowMillis = System.currentTimeMillis();
        Date now = new Date(nowMillis);

        //生成签名密钥
        byte[] apiKeySecretBytes = Base64.getDecoder().decode(BASE64_SECURITY);
        Key signingKey = new SecretKeySpec(apiKeySecretBytes, signatureAlgorithm.getJcaName());

        //添加构成JWT的类
        JwtBuilder builder = Jwts.builder().setHeaderParam("typ", "JsonWebToken")
                .setIssuer(issuer)
                .setAudience(audience)
                .signWith(signatureAlgorithm, signingKey);

        //设置JWT参数
        user.forEach(builder::claim);

        //设置应用id
        //builder.claim(CLIENT_ID, clientId);

        //添加Token过期时间
        long expireMillis=10000;
        //if (tokenType.equals(TokenConstant.ACCESS_TOKEN)) {
        //    expireMillis = clientDetails.getAccessTokenValidity() * 1000;
        //} else if (tokenType.equals(TokenConstant.REFRESH_TOKEN)) {
        //    expireMillis = clientDetails.getRefreshTokenValidity() * 1000;
        //} else {
        //    expireMillis = getExpire();
        //}
        long expMillis = nowMillis + expireMillis;
        Date exp = new Date(expMillis);
        builder.setExpiration(exp).setNotBefore(now);

        // 组装Token信息
        TokenInfo tokenInfo = new TokenInfo();
        tokenInfo.setToken(builder.compact());
        tokenInfo.setExpire((int) expireMillis / 1000);

        return tokenInfo;
    }

    /**
     * 解析jsonWebToken
     *
     * @param jsonWebToken jsonWebToken
     * @return Claims
     */
    public static Claims parseJWT(String jsonWebToken) {
        try {
            return Jwts.parser()
                    .setSigningKey(Base64.getDecoder().decode(BASE64_SECURITY))
                    .parseClaimsJws(jsonWebToken).getBody();
        } catch (Exception ex) {
            return null;
        }
    }
}
