package com.mb.Ex01_DB_XMLConfigured;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;





public class Ex01_DB_XMLConfigured {

    public static void main(String[] args) {

        // XML based config loading
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        ColoredShapeDao coloredShapeDao = (ColoredShapeDao) context.getBean("coloredShapeDao");

        // Create a new shape.
        coloredShapeDao.create(4, "teal", "trapezium");

        // List the three original plus the new shape.
        List<ColoredShape> coloredShapes = coloredShapeDao.listColoredShapes();
        for (ColoredShape coloredShape : coloredShapes) {
            System.out.println(coloredShape.toString());
        }

        // Update a shape.
        coloredShapeDao.update(1, "red", "rectangle");

        // List the updated table content.
        coloredShapes = coloredShapeDao.listColoredShapes();
        for (ColoredShape coloredShape : coloredShapes) {
            System.out.println(coloredShape.toString());
        }

    }
}