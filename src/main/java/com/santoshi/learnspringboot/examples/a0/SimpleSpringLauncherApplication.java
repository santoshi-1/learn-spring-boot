package com.santoshi.learnspringboot.examples.a0;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;


@Configuration
@ComponentScan
public class SimpleSpringLauncherApplication {
    public static void main(String args[]) {
        var context = new AnnotationConfigApplicationContext(SimpleSpringLauncherApplication.class);
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
    }
}
