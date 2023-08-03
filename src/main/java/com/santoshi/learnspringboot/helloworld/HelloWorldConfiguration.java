package com.santoshi.learnspringboot.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age) {
};

record Address(String firstLine, String city) {
};

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name() {
        return "Santoshi";
    }

    @Bean
    public int age() {
        return 24;
    }

    @Bean
    public Person person() {
        var person = new Person("Harsha", 26);
        return person;
    }

    @Bean
    public Address address() {
        var address = new Address("SW 34th ST", "Gainesville");
        return address;
    }

}
