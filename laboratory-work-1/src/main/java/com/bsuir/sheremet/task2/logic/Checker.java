package com.bsuir.sheremet.task2.logic;

import com.bsuir.sheremet.task2.entity.Point;
import com.bsuir.sheremet.task2.entity.Polygon;

import java.util.List;

public class Checker {

    public boolean isPointInPolygon(Point testPoint, Polygon polygon) {

        boolean result = false;
        List<Point> vertices = polygon.getVertices();
        int countOfVertices = vertices.size();

        for (int i = 0, j = countOfVertices - 1; i < countOfVertices; j = i++) {
            Point pointI = vertices.get(i);
            Point pointJ = vertices.get(j);

            if ((pointI.getAxisY() > testPoint.getAxisY()) != (pointJ.getAxisY() > testPoint.getAxisY()) &&
                    (testPoint.getAxisX() < (pointJ.getAxisX() - pointI.getAxisX()) *
                            (testPoint.getAxisY() - pointI.getAxisY()) /
                            (pointJ.getAxisY() - pointI.getAxisY()) + pointI.getAxisY())) {
                result = true;
            }
        }
        
        return result;
    }
}
