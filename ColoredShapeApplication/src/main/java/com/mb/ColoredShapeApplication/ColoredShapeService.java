package com.mb.ColoredShapeApplication;

public interface ColoredShapeService {

    ColoredShape getColoredShape(Long id);

    void addColoredShape(ColoredShape coloredShape);
}