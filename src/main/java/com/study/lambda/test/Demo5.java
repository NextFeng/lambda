package com.study.lambda.test;

import lombok.extern.slf4j.Slf4j;

/**
 * @author LinFeng
 * @date 2019/12/2 23:22
 */

@Slf4j
public class Demo5 {

    String s1 = "全部变量";


    public void testClass(){

        String s2 = "局部变量";

        new Thread(new Runnable() {
            String s3 = "内部变量";

            @Override
            public void run() {
                //log.info("【变量】" + this.s1); //this关键字下的s1报错，this是内部边
                log.info("【变量】" + s1);
                log.info("【变量】" + s2); //局部变量访问，默认final，不可修改
                /*s2 = "hello";   */

                log.info("【变量】" + s3);
                log.info("【变量】" + this.s3);

            }
        }).start();

    }


    /**
     *Lambda表达式this作用域
     */
    public void testLambda(){
        String s2 = "局部变量";

        new Thread(()->{
            String s3 = "内部变量";
            log.info("【变量】" + this.s1);
            log.info("【变量】" + s2);
            log.info("【变量】" + s3);
            s3 = "Lambda内可变";
            log.info("【变量】" + s2);
        });

    }


    public static void main(String[] args){
        Demo5 demo5 = new Demo5();
        demo5.testClass();

    }
}
