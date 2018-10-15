package com.dominik.checkers;

class Pawn extends Figure {
    public Pawn(String color) {
        super(color);
    }
    @Override
    public String toString() {
        if(getColor()=="white") {
            return "b";
        } else {
            return "c";
        }
    }
}