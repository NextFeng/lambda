package com.study.lambda.service;

/**
 * @author LinFeng
 * @date 2019/12/2 21:55
 */

@FunctionalInterface
public interface UserLogin {

    /**
     * 通过用户获取用户权限
     * @param userName
     * @return
     */
    String verifyUser(String userName);


    default String getUser(String userName){
        if("admin".equals(userName)){
            return "admin + 系统管理员用户";
        }else{
            return "manager + 用户管理员用户";
        }

    }

}
