package com.mb.SpringDataJPA;


public interface ColoredShapeService {

    ColoredShape getColoredShape(Long id);
    
    ColoredShape getColoredShapeByShape(String shape);
    
    ColoredShape getColoredShapeByColor(String color);
}