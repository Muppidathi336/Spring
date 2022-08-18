package com.mb.Ex07_DIThroughAnnotationWithQualifiers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Ex07_DIThroughAnnotationWithQualifiers {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ex07-di-through-annotation-with-qualifiers.xml");

        ConstructorAnnotatedQualifiedColoredShapeHolder constructorAnnotatedQualifiedColoredShapeHolder = (ConstructorAnnotatedQualifiedColoredShapeHolder) context
                .getBean("constructorAnnotatedQualifiedColoredShapeHolder");

        System.out.println(constructorAnnotatedQualifiedColoredShapeHolder);
    }
}