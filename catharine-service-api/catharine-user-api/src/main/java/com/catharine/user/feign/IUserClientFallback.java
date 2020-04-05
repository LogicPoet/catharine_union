package com.catharine.user.feign;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.catharine.common.support.R;
import com.catharine.user.dto.UserInfoDTO;
import com.catharine.user.entity.CatStaff;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.List;


/**
 * @author LZ
 * @date 2020/4/3 16:23
 **/
@Component
public class IUserClientFallback implements IUserClient {
    @Override
    public R<UserInfoDTO> userInfo(Long userId) {
        return R.fail("未获取到账号信息");
    }

    @Override
    public R<UserInfoDTO> userInfo(String account) {
            //至少有一条
            UserInfoDTO userInfo = new UserInfoDTO();
            userInfo.setUsername("admin");
            userInfo.setPassword("10470c3b4b1fed12c3baac014be15fac67c6e815");
            userInfo.setPermissions("a1");
            return R.data(userInfo);
        //return R.fail("未获取到账号信息");
    }

    @Override
    public R<UserInfoDTO> userInfo(String account, String password) {
        return R.fail("未获取到账号信息");
    }
}
