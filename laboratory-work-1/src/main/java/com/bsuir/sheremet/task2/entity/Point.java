package com.bsuir.sheremet.task2.entity;

import java.util.Objects;

public class Point {

    private int axisX;
    private int axisY;

    public Point(int axisX, int axisY) {
        this.axisX = axisX;
        this.axisY = axisY;
    }

    public int getAxisX() {
        return axisX;
    }

    public int getAxisY() {
        return axisY;
    }

    public void setAxisX(int axisX) {
        this.axisX = axisX;
    }

    public void setAxisY(int axisY) {
        this.axisY = axisY;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Point point = (Point) o;

        return axisX == point.axisX
                && axisY == point.axisY;
    }

    @Override
    public int hashCode() {
        return Objects.hash(axisX, axisY);
    }

    @Override
    public String toString() {
        return this.getClass() +
                "axisX=" + axisX +
                ", axisY=" + axisY +
                '}';
    }
}
