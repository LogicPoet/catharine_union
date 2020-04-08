//package com.catharine.gateway.provider;
//
//import com.catharine.gateway.constant.SecureConstant;
//import lombok.AllArgsConstructor;
//import org.springframework.jdbc.core.BeanPropertyRowMapper;
//import org.springframework.jdbc.core.JdbcTemplate;
//
///**
// * <p>Title: ClientDetailsServiceImpl</p>
// * <p>description: 获取客户端详情</p>
// * <p>Company: </p>
// *
// * @author LZ
// * @date 2020/4/6 20:41
// **/
//@AllArgsConstructor
//public class ClientDetailsServiceImpl implements IClientDetailsService {
//
//    private final JdbcTemplate jdbcTemplate;
//
//    @Override
//    public IClientDetails loadClientByClientId(String clientId) {
//        try {
//            return jdbcTemplate.queryForObject(SecureConstant.DEFAULT_SELECT_STATEMENT, new String[]{clientId}, new BeanPropertyRowMapper<>(ClientDetails.class));
//        } catch (Exception ex) {
//            return null;
//        }
//    }
//
//}
//
