package com.catharine.user.feign;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.catharine.common.support.R;
import com.catharine.user.dto.UserInfoDTO;
import com.catharine.user.entity.CatStaff;
import com.catharine.user.mapper.CatStaffMapper;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author LZ
 * @date 2020/4/3 16:26
 **/
@RestController
@AllArgsConstructor
public class UserClient implements IUserClient {
    private CatStaffMapper staffMapper;

    /**
     * 获取用户信息
     *
     * @param userId 用户id
     * @return
     */
    @Override
    @GetMapping(API_PREFIX + "/user-info-by-id")
    public R<UserInfoDTO> userInfo(Long userId) {
        return null;
    }

    /**
     * 获取用户信息
     *
     * @param account 账号名
     * @return
     */
    @Override
    @GetMapping(API_PREFIX + "/user-info-by-account")
    public R<UserInfoDTO> userInfo(String account) {
        return userInfo(account, null);
    }

    /**
     * 获取用户信息
     *
     * @param account  账号
     * @param password 密码
     * @return
     */
    @Override
    @GetMapping(API_PREFIX + "/user-info")
    public R<UserInfoDTO> userInfo(String account, String password) {

        if (StringUtils.isEmpty(account)&& StringUtils.isEmpty(password)){
            return R.fail("请求参数不合法");
        }
        List<CatStaff> catStaffs;
        if (!StringUtils.isEmpty(password)) {
            catStaffs = staffMapper.selectList(Wrappers.<CatStaff>lambdaQuery().eq(CatStaff::getAccount, account).eq(CatStaff::getPassword, password));
        } else {
            catStaffs = staffMapper.selectList(Wrappers.<CatStaff>lambdaQuery().eq(CatStaff::getAccount, account));
        }
        if (CollectionUtils.isEmpty(catStaffs)) {
            //没有查询出数据
            return R.fail("用户不存在");
        } else {
            //至少有一条
            CatStaff catStaff = catStaffs.get(0);
            UserInfoDTO userInfo = new UserInfoDTO();
            BeanUtils.copyProperties(catStaff, userInfo);
            userInfo.setPermissions(catStaff.getRoleId());
            return R.data(userInfo);
        }
    }
}
