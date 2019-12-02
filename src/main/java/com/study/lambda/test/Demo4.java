package com.study.lambda.test;

import lombok.extern.slf4j.Slf4j;

/**
 * @author LinFeng
 * @date 2019/12/2 23:01
 */

@Slf4j
public class Demo4 {

    public static void main(String[] args){


        /*不带参数的Lambda表达式写法*/
        LamTest lam = () ->{
            log.info("【没有参数的Lambda表达式】");
        };
        lam.say();


        /** 带参数的Lambda表达式写法 */
        LamTest2 lam2_1 = (String n , int a) ->{
            log.info("【带参数的Lambda表达式】" + n + a);
        };
        lam2_1.speak("张三说",118);

        LamTest2 lam2_2 = (n , a) ->{
            log.info("【带参数的Lambda表达式】" + n + a);
        };
        lam2_2.speak("张三说",118);


        /*带有参数，带有返回值得Lambda表达式*/

        LamTest3 lam3 = (x,y) ->{
            int z = x + y;
            return z;
        };
        log.info("【带参数待返回的Lambda表达式】" + lam3.add(12,16));


        LamTest3 lam32 = (x,y) -> x + y;
        log.info("【带参数待返回的Lambda表达式】" + lam32.add(12,16));

    }
    interface LamTest{
        void say();
    }

    interface LamTest2{
        void speak(String name,int age);
    }

    interface LamTest3{
        int add(int max,int min);
    }
}

