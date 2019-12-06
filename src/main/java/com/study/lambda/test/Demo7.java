package com.study.lambda.test;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author LinFeng
 * @date 2019/12/6 21:59
 */

@Slf4j
public class Demo7 {

    public static void main(String[] args){

        List<String> list = new ArrayList<>();

        list.add("zhangsan");
        list.add("lisi");
        list.add("wangwu");
        list.add("zhaoliu");
        list.add("xiaoqi");
        list.add("zaba");
        //list = list.stream().limit(3).collect(Collectors.toList());
        //list.forEach(System.out ::println);

        //map() 中间操作 map 方法接收一个functinal接口
        /*
        list = list.stream().map(x -> "测试用户：" + x).collect(Collectors.toList());
        list.forEach(log :: info);


        //filter() 添加过滤条件。过滤符合条件的用户
        list = list.stream().filter(x -> !x.equals("zaba")).collect(Collectors.toList());
        list.forEach(log :: info);

        //forEach 增强型循环
        list.forEach(x -> log.info("【数据是】" + x));


        //peek 中间操作，迭代数据完成数据的依次处理
        list.stream().peek(x -> log.info("【数据是】" + x)).peek(x -> log.info("【2是】" + x)).forEach(log :: info);

        */

        List<Integer> intlist = new ArrayList<>();

        intlist.add(20);
        intlist.add(201);
        intlist.add(220);
        intlist.add(290);
        intlist.add(33220);
        intlist.add(220);
        intlist.add(520);


        //skip 中间操作。有状态，跳过部分数据
        //intlist.stream().skip(5).forEach(System.out ::println);

        //limit 中间操作。 有状态，限制输出数量
        //intlist.stream().skip(5).limit(1).forEach(System.out ::println);

        //distinct 中间操作。 有状态，删除重复数据
        //intlist.stream().distinct().forEach(System.out ::println);

        //sorted 排序
        //intlist.stream().distinct().sorted().forEach(System.out ::println);
        //max 获取最大值
        //min 获取最小值
        Optional optional =  intlist.stream().min((x, y ) -> x-y);
        log.info("【获取的】" + optional.get());


        Optional optional2 = intlist.stream().reduce((sum,x) -> sum + x);
        log.info("【获取的集合】" + optional2.get());


    }
}
