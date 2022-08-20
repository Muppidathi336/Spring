package com.mb.ColoredShapeApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional(readOnly = true)
public class ColoredShapeServiceImpl implements ColoredShapeService {

    @Autowired
    ColoredShapeDao coloredShapeDao;


    public ColoredShape getColoredShape(final Long id) {

        return coloredShapeDao.findById(id);
    }


    @Transactional(readOnly = false)
    public void addColoredShape(final ColoredShape coloredShape) {

        coloredShapeDao.save(coloredShape);
    }
}