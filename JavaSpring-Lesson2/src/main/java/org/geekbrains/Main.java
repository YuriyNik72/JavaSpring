package org.geekbrains;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("/spring-context.xml");
        Clinik clinik = context.getBean("clinik",Clinik.class);
        clinik.Priem();
    }
}
