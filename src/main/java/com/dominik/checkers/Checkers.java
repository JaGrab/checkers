package com.dominik.checkers;

class Checkers {
    public static void main (String[] args) {
        // board size 8 or 10
        int size = 8;
        Board draughts = new Board(size);
        draughts.setBoard();
        System.out.println(draughts);
        draughts.help();
    }
}