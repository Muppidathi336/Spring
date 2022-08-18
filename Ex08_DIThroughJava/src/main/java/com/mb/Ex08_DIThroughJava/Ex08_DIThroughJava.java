package com.mb.Ex08_DIThroughJava;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan(basePackages = {"com.mb.Ex08_DIThroughJava"})
public class Ex08_DIThroughJava {

    @Autowired
    private AutowiredColoredShapeHolder autowiredColoredShapeHolder;

    public static void main(String[] args) {

        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
        annotationConfigApplicationContext.register(Ex08_DIThroughJava.class);
        annotationConfigApplicationContext.refresh();

        AutowiredColoredShapeHolder autowiredColoredShapeHolder = annotationConfigApplicationContext.getBean
                (AutowiredColoredShapeHolder.class);
        System.out.println(autowiredColoredShapeHolder);
    }

}