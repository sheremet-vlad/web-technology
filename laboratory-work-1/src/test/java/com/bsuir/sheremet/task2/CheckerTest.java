package com.bsuir.sheremet.task2;

import com.bsuir.sheremet.task2.entity.Point;
import com.bsuir.sheremet.task2.entity.Polygon;
import com.bsuir.sheremet.task2.logic.Checker;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CheckerTest {

    private final static Checker checker = new Checker();

    @Test
    public void shouldReturnTrueWhenPointInPolygon() {

        Polygon polygon = createPolygon();

        Point point = new Point(1, 2);

        boolean result = checker.isPointInPolygon(point, polygon);
        Assert.assertTrue(result);
    }

    @Test
    public void shouldReturnFalseWhenPointNotInPolygon() {

        Polygon polygon = createPolygon();

        Point point = new Point(7, 2);

        boolean result = checker.isPointInPolygon(point, polygon);
        Assert.assertFalse(result);
    }

    private Polygon createPolygon() {

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
