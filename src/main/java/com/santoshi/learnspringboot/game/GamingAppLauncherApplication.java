package com.santoshi.learnspringboot;


import com.santoshi.learnspringboot.game.GameRunner;
import com.santoshi.learnspringboot.game.GamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("com.santoshi.learnspringboot.game")
public class GamingAppLauncherApplication {
    public static void main(String args[]) {
        var context = new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class);
        context.getBean(GamingConsole.class).up();
        context.getBean(GameRunner.class).run();
    }
}
