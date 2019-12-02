package com.study.lambda.test;

import lombok.extern.slf4j.Slf4j;

/**
 * @author LinFeng
 * @date 2019/12/2 21:42
 */
@Slf4j
public class Demo1 {


    public static void main(String[] args){

        //1.传统模式下，新线程的创建
        new Thread(new Runnable() {
            @Override
            public void run() {
                log.info("【创建的线程是】" + Thread.currentThread().getId());
            }
        }).start();



        //2.Lambda 优化线程模式

        new Thread(() -> {
            log.info("【Lambda创建的线程是】" + Thread.currentThread().getId());
        }).start();
    }

}
