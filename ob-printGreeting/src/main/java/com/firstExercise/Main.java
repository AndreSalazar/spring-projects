package com.firstExercise;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Greetings greetings = (Greetings) context.getBean("greetings");
        String message = greetings.printGreeting();
        System.out.println(message);
    }
}