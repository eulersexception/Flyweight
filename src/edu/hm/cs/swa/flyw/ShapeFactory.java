package edu.hm.cs.swa.flyw;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {

    private static final HashMap<Color, Circle> circleMap = new HashMap<>();

    public ShapeFactory() {
    }

    public static Shape getCircle(java.awt.Color color) {
        if(!circleMap.containsKey(color))
            circleMap.put(color, new Circle(color));

        return circleMap.get(color);
    }
}
