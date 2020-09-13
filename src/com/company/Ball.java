package com.company;

public class Ball {
    private int size;
    private String color;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "size=" + size +
                ", color='" + color + '\'' +
                '}';
    }
}
