package com.study.lambda.service.impl;

import com.study.lambda.service.MsgConver;
import lombok.extern.slf4j.Slf4j;

/**
 * @author LinFeng
 * @date 2019/12/2 22:07
 */
@Slf4j
public class MsgConverImpl implements MsgConver {


    @Override
    public String format(String msg, String fromat) {


        log.info("【消息转换】...");


        return msg;
    }
}
