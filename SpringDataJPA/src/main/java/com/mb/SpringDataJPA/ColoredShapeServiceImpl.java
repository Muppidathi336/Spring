package com.mb.SpringDataJPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class ColoredShapeServiceImpl implements ColoredShapeService {

    @Autowired
    ColoredShapeDao coloredShapeDao;

   
    public ColoredShape getColoredShape(final Long id) {

        return coloredShapeDao.findByID(id);
    }


    @Transactional(readOnly = false)
    public void saveColoredShape(final ColoredShape coloredShape) {

        coloredShapeDao.save(coloredShape);
    }


    public ColoredShape getColoredShapeByShape(final String shape) {

        return coloredShapeDao.findByShape(shape);
    }


    public ColoredShape getColoredShapeByColor(final String color) {

        return coloredShapeDao.findByColor(color);
    }
}