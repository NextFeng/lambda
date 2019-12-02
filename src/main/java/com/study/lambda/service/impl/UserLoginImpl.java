package com.study.lambda.service.impl;

import com.study.lambda.service.UserLogin;

/**
 * @author LinFeng
 * @date 2019/12/2 21:59
 */
public class UserLoginImpl implements UserLogin {

    @Override
    public String verifyUser(String userName) {

        if("admin".equals(userName)){
            return "系统管理员";
        }else{
            return "用户管理员";
        }
    }
}
