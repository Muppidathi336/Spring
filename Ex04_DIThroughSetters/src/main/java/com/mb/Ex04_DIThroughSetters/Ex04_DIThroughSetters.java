package com.mb.Ex04_DIThroughSetters;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Ex04_DIThroughSetters {

    public static void main(String args[]) {

        // XML based config loading
        ApplicationContext context = new ClassPathXmlApplicationContext("ex04-di-through-setters.xml");

        ColoredShapeHolder coloredShapeHolder = (ColoredShapeHolder) context.getBean("coloredShapeHolder");

        System.out.println(coloredShapeHolder.toString());
    }

}