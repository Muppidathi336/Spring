package com.mb.Ex08_DIThroughJava;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("orangeOval")
public class OrangeOval extends ColoredShape {

    public OrangeOval() {

        super("orange", "oval");
    }
}