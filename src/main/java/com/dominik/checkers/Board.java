package com.dominik.checkers;

import java.util.ArrayList;
import java.util.Random;

class Board {
    private ArrayList<BoardRow> board;
    public Board(int size) {
        board = new ArrayList<BoardRow>();
        for(int i=0; i<size; i++) {
            this.board.add(new BoardRow(size/2));
        }
    }
    public Figure getFigure(int row, int col) {
        return board.get(row).getFigure(col);
    }
    public void setFigure(int row, int col, Figure figure) {
        board.get(row).setFigure(col, figure);
    }
    public void setBoard() {
        String color;
        Random generator = new Random();
        boolean whoPlaysWhite = generator.nextBoolean();
        int numberOfLines = (board.size()-2)/2;
        if(whoPlaysWhite) {
            color="white";
        } else {
            color="black";
        }
        for(int i=board.size()-1; i>=board.size()-numberOfLines; i--) {
            for(int j=0; j<board.size()/2; j++) {
                setFigure(i, j, new Pawn(color));
            }
        }
        if(color=="white") {
            color="black";
        } else {
            color="white";
        }
        for(int i=0; i<numberOfLines; i++) {
            for(int j=0; j<board.size()/2; j++) {
                setFigure(i, j, new Pawn(color));
            }
        }
    }
    public void help() {
        System.out.println("\n\nMałe litery to pionki,\nduże litery to damki");
        System.out.println("C,c to czarne\nB,b to białe");
        System.out.println("= to czarne pola");
    }
    @Override
    public String toString() {
        //String letters = new String("_a b c d e f g h i j");
        String letters = new String(" a b c d e f g h i j");
        String numbers = new String("1234567890");
        String line = new String(new char[board.size()*2+1]).replace("\0", "_");
        String lineb = new String(new char[board.size()*2+1]).replace("\0", "-");
        //String boardString = new String("  " + line + "\n");
        String boardString = new String(line + "\n");
        for(int i=board.size()-1; i>=0; i--) {
            String rowString = new String("|");
            for(int j=0; j<board.size()/2; j++) {
                if(i%2 == 0) {
                    rowString = rowString + board.get(i).getFigure(j) + "| |";
                } else {
                    rowString = rowString + " |" + board.get(i).getFigure(j) + "|";
                }
            }
            boardString = boardString + rowString + numbers.charAt(i) + "\n"; // + line + "\n";
//			boardString = boardString + board.get(i) + "\n";
        }
        boardString = boardString + lineb + "\n" + letters.substring(0, board.size()*2);
        return boardString;
    }
}