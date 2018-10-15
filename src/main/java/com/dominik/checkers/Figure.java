package com.dominik.checkers;

abstract class Figure {
    private String color;
    public Figure(String color) {
        this.color = color;
    }
    public Figure() {
    }
    public String getColor() {
        return color;
    }
}