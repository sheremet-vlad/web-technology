package com.bsuir.sheremet.task9.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Basket {
    private List<Ball> balls = new ArrayList<>();

    public Basket() {
    }

    public Basket(List<Ball> balls) {
        this.balls = balls;
    }

    public List<Ball> getBalls() {
        return balls;
    }

    public void setBalls(List<Ball> balls) {
        this.balls = balls;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Basket basket = (Basket) o;
        return Objects.equals(balls, basket.balls);
    }

    @Override
    public int hashCode() {
        return Objects.hash(balls);
    }

    @Override
    public String toString() {
        return "Basket{" +
                "balls=" + balls +
                '}';
    }
}
