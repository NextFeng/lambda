package com.study.lambda.test;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LinFeng
 * @date 2019/12/2 23:37
 */

@Slf4j
public class Demo6 {


    public static void test(myinter<String,List> myinter){

        List<String> list = myinter.testing("hello" ,new ArrayList());
        log.info("【获取到的List是】" + list);

    }


    public static void main(String[] args){
        test(new myinter<String, List>() {
            @Override
            public List testing(String s, List list) {
                list.add(s);
                return list;
            }
        });

        test((x,y) -> {
            y.add(x);
            return y;
        });


    }






    @FunctionalInterface
    interface myinter< T, R>{

        R testing(T t, R r);
    }
}
