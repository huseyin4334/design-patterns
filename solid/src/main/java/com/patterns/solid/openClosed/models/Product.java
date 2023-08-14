package com.patterns.solid.openClosed.models;

import com.patterns.solid.openClosed.enums.Color;
import com.patterns.solid.openClosed.enums.Size;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Product {

    String name;
    Color color;
    Size size;
}
