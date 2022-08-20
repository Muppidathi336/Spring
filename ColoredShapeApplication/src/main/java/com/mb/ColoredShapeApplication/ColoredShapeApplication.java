package com.mb.ColoredShapeApplication;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mb.ColoredShapeApplication.ColoredShapeConfig;
import com.mb.ColoredShapeApplication.ColoredShapeControllingBean;

public class ColoredShapeApplication {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ColoredShapeConfig.class);

        ColoredShapeControllingBean coloredShapeControllingBean =
                context.getBean(ColoredShapeControllingBean.class);

        coloredShapeControllingBean.persistAndRetrieveColoredShapes();
    }
}