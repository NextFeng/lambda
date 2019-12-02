package com.study.lambda.test;

import lombok.extern.slf4j.Slf4j;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.function.*;

/**
 * @author LinFeng
 * @date 2019/12/2 22:24
 */

@Slf4j
public class Demo3 {


    public static void main(String[] args){

        /*接收对象参数T,返回一个boolean类型结果*/
        Predicate<String> pre = (String username) -> "admin".equals(username);
        log.info("【获取的是】" + pre.test("admin"));


        /*接收对象类型T,不返回结果*/
        Consumer<String> con = (String msg) ->{
            log.info("【消息发送成功】" + msg);
        };
        con.accept("小兄弟们，这是Lambda");


        /*接收对象T,返回对象R*/
        Function<String,Integer>  fun = (String sex) ->{
            return "M".equals(sex)?1:2;
        };
        log.info("【检验性别】" +  fun.apply("M"));
        log.info("【检验性别】" +  fun.apply("F"));


        /*不接收对象，提供T对象的创建工厂*/
        Supplier<String> sup = () -> {
            return UUID.randomUUID().toString();
        };
        log.info("【获取UUID】" +  sup.get());
        log.info("【获取UUID】" +  sup.get());
        log.info("【获取UUID】" +  sup.get());



        /*接收对象T，返回结果对象T*/
        UnaryOperator<List> una =  (List list) -> {
            list.add("9527");
            return list;
        };
        List list = new ArrayList();
        log.info("【获取List】" + una.apply(list));



        /*接收两个T对象，返回一个T对象*/
        BinaryOperator<Integer> bo = (Integer i ,Integer j) ->{
            return 1>j?i:j;
        };
        log.info("【数据Pk得到】" + bo.apply(15,18));


    }
}
