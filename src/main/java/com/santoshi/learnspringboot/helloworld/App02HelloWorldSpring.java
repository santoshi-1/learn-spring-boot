package com.santoshi.learnspringboot.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class App02HelloWorldSpring {

    public static void main(String args[]) {
        /**
         * 1. Launch a spring context/application
         * 2. configure the things that the spring framework can manage
         */

        try (var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {
            System.out.println(context.getBean("name"));
            System.out.println(context.getBean("age"));
            System.out.println(context.getBean("person"));
            System.out.println(context.getBean("address"));

            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }


    }
}
