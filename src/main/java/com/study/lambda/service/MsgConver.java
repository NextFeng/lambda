package com.study.lambda.service;

import org.springframework.util.StringUtils;

/**
 * @author LinFeng
 * @date 2019/12/2 21:57
 */

@FunctionalInterface
public interface MsgConver {

    /**
     * 消息转换
     * @param msg
     * @param fromat
     * @return
     */
    String format(String msg, String fromat);


    /**
     * 消息合法检测
     * @param msg
     * @return
     */
    static boolean checkMsg(String msg){
        if(!StringUtils.isEmpty(msg)){
            return true;
        }else{
            return false;
        }

    }
}
