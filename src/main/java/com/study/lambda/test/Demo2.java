package com.study.lambda.test;

import com.study.lambda.service.MsgConver;
import com.study.lambda.service.UserLogin;
import com.study.lambda.service.impl.MsgConverImpl;
import com.study.lambda.service.impl.UserLoginImpl;
import lombok.extern.slf4j.Slf4j;

/**
 * @author LinFeng
 * @date 2019/12/2 21:54
 */

@Slf4j
public class Demo2 {

    public static void main(String[] args){

        UserLogin u1 = new UserLoginImpl();
        log.info("【返回的是】"+u1.verifyUser("admins"));
        String msg = "Hello word!";

        if(MsgConver.checkMsg(msg)){
            MsgConver conver = new MsgConverImpl();
            conver.format("LinFeng","json");
        }



        //匿名内部类实现

        UserLogin u2 = new UserLogin() {
            @Override
            public String verifyUser(String userName) {
              return "admin".equals(userName)?"管理员":"会员";
            }
        };




        //通过Lambda针对函数式接口的简单实现


        UserLogin u3  = (String userName) -> "admin".equals(userName)?"管理员":"会员";


        log.info("【获取的是】" + u3.verifyUser("admin"));


    }
}
