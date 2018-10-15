package com.dominik.checkers;

class Queen extends Figure {
    public Queen(String color) {
        super(color);
    }
    @Override
    public String toString() {
        if(getColor()=="white") {
            return "B";
        } else {
            return "C";
        }
    }
}