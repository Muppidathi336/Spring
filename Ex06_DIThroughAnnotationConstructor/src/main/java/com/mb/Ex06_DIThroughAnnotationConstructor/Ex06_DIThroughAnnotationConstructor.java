package com.mb.Ex06_DIThroughAnnotationConstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Ex06_DIThroughAnnotationConstructor {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ex06-di-through-annotation-constructor.xml");

        ConstructorAnnotatedColoredShapeHolder constructorAnnotatedColoredShapeHolder = (ConstructorAnnotatedColoredShapeHolder) context
                .getBean("constructorAnnotatedColoredShapeHolder");

        System.out.println(constructorAnnotatedColoredShapeHolder);
    }
}