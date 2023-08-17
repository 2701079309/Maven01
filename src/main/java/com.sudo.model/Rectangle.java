package com.sudo.model;

public class Rectangle extends Well{
    private int length;
    private int width;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return super.toString() +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
