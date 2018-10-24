package com.bsuir.sheremet.task2.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Polygon {

    private List<Point> vertices;

    public Polygon() {
        vertices = new ArrayList<>();
    }

    public Polygon(List<Point> vertices) {
        this.vertices = vertices;
    }

    public void addVertex(Point point) {
        vertices.add(point);
    }

    public void deleteVertex(int index) {
        vertices.remove(index);
    }

    public Point getVertex(int index) {
        return vertices.get(index);
    }

    public List<Point> getVertices() {
        return vertices;
    }

    public void setVertices(List<Point> vertices) {
        this.vertices = vertices;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Polygon polygon = (Polygon) o;

        return Objects.equals(vertices, polygon.vertices);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vertices);
    }

    @Override
    public String toString() {
        return this.getClass() +
                "vertices=" + vertices +
                '}';
    }
}
