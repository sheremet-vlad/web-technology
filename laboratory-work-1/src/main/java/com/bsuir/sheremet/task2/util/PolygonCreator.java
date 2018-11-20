package com.bsuir.sheremet.task2.util;

import com.bsuir.sheremet.task2.entity.Point;
import com.bsuir.sheremet.task2.entity.Polygon;

import java.util.ArrayList;
import java.util.List;

public class PolygonCreator {

    public Polygon createPolygon() {

        List<Point> points = new ArrayList<>();

        points.add(new Point(-4, 0));
        points.add(new Point(-4, 5));
        points.add(new Point(4, 5));
        points.add(new Point(4,0));
        points.add(new Point(6,0));
        points.add(new Point(6, -3));
        points.add(new Point(-6, -3));
        points.add(new Point(-6, 0));

        return new Polygon(points);
    }
}
