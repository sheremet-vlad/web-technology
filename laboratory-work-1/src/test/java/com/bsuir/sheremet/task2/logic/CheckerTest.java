package com.bsuir.sheremet.task2.logic;

import com.bsuir.sheremet.task2.entity.Point;
import com.bsuir.sheremet.task2.entity.Polygon;
import com.bsuir.sheremet.task2.util.PolygonCreator;
import org.junit.Assert;
import org.junit.Test;

public class CheckerTest {

    private final static Checker checker = new Checker();
    private final static PolygonCreator polygonCrator = new PolygonCreator();

    @Test
    public void shouldReturnTrueWhenPointInPolygon() {

        Polygon polygon = polygonCrator.createPolygon();

        Point point = new Point(1, 2);

        boolean result = checker.isPointInPolygon(point, polygon);
        Assert.assertTrue(result);
    }

    @Test
    public void shouldReturnFalseWhenPointNotInPolygon() {

        Polygon polygon = polygonCrator.createPolygon();

        Point point = new Point(7, 2);

        boolean result = checker.isPointInPolygon(point, polygon);
        Assert.assertFalse(result);
    }
}
