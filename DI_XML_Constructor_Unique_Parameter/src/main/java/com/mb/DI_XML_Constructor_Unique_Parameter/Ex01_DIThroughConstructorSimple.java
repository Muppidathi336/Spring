package com.mb.DI_XML_Constructor_Unique_Parameter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Ex01_DIThroughConstructorSimple {

    public static void main(String args[]) {

        // XML based config loading
        ApplicationContext context =
                new ClassPathXmlApplicationContext(
                        "ex01-di-through-constructor-simple.xml");

        ColoredShapeHolder coloredShapeHolder =
                (ColoredShapeHolder) context.getBean("coloredShapeHolder");

        System.out.println(coloredShapeHolder.toString());
    }
}