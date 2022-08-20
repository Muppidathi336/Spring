package com.mb.ColoredShapeApplication;

import java.util.List;



public interface ColoredShapeDao {

    ColoredShape findById(final Long id);

    void save(ColoredShape coloredShape);
}