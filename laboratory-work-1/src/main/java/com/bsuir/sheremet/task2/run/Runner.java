package com.bsuir.sheremet.task2.run;

import com.bsuir.sheremet.task2.entity.Point;
import com.bsuir.sheremet.task2.entity.Polygon;
import com.bsuir.sheremet.task2.logic.Checker;
import com.bsuir.sheremet.task2.util.PolygonCreator;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        PolygonCreator polygonCreator = new PolygonCreator();
        Polygon polygon = polygonCreator.createPolygon();

        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        Point point = new Point(x,y);

        Checker checker = new Checker();
        boolean isPointInPolygon = checker.isPointInPolygon(point, polygon);

        System.out.println(isPointInPolygon);
    }
}
