package com.santoshi.learnspringboot.examples.h1;

import com.santoshi.learnspringboot.game.GameRunner;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.Array;
import java.util.Arrays;

public class XMLConfigurationContextLauncherApplication {

    public static void main(String args[]) {
        var context = new ClassPathXmlApplicationContext("contextConfiguration.xml");
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        context.getBean(GameRunner.class).run();
    }


}
