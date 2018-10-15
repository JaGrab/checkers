package com.dominik.checkers;

import java.util.ArrayList;

class BoardRow {
    private ArrayList<Figure> row;
    public BoardRow(int size) {
        row = new ArrayList<Figure>();
        for(int i=0; i<size; i++) {
            this.row.add(new None());
        }
    }
    public Figure getFigure(int col) {
        return row.get(col);
    }
    public void setFigure(int col, Figure figure) {
        row.set(col, figure);
    }
//	@Override
//	public String toString() {
//		String rowString = new String();
//		for(int i=0; i<row.size(); i++) {
//			rowString = rowString + row.get(i) + "| |";
//		}
//		return rowString;
//	}
}