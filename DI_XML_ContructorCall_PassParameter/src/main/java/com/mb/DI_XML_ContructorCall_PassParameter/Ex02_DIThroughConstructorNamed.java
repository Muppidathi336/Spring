package com.mb.DI_XML_ContructorCall_PassParameter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ex02_DIThroughConstructorNamed {

    public static void main(String args[]) {

        // XML based config loading
        ApplicationContext context =
                new ClassPathXmlApplicationContext(
                        "ex02-di-through-constructor-named.xml");

        ColoredShapeHolder coloredShapeHolder =
                (ColoredShapeHolder) context.getBean("coloredShapeHolder");

        System.out.println(coloredShapeHolder.toString());
    }
}