package com.game.millerstar.matchitnow;

import java.util.ArrayList;

public class Board {

    // class members
    private int colNumber;
    private int rowNumber;
    private int pairNum;
    Level boardLevel;
    private boolean isSolved;
    private int numOfMatches;
    private double timeScore;
    private ArrayList<Card> cards;

    // constructor
    public Board(Level level) {
        this.boardLevel = level;
        this.cards = new ArrayList<>();
        generateBoard(this.boardLevel);
//        generatePairs(this.getPairNum());
    }

    // getters & Setters
    public int getColNumber() {
        return colNumber;
    }

    public int getRowNumber() {
        return rowNumber;
    }

    public Level getBoardLevel() {
        return boardLevel;
    }

    public boolean isSolved() {
        return isSolved;
    }

    public int getNumOfMatches() {
        return numOfMatches;
    }

    public double getTimeScore() {
        return timeScore;
    }

    public int getPairNum() {
        return pairNum;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    // methods
    public void generatePairs(int pairNumber) {
        for (int i = 0; i <pairNumber * 2 ; i++) {
            Card card = new Card("imageURL");
            cards.add(card);
        }
    }

    private void generateBoard(Level level) {
        this.timeScore = 0.0;
        this.numOfMatches = 0;
        this.isSolved = false;

        switch (level) {
            case EXPERT:
                this.colNumber = level.getColumnAsInt();
                this.rowNumber = level.getRowAsInt();
                break;
            case INTERMEDIATE:
                this.colNumber = level.getColumnAsInt();
                this.rowNumber = level.getRowAsInt();
                break;
            case BEGINNER:
                this.colNumber = level.getColumnAsInt();
                this.rowNumber = level.getRowAsInt();
                break;
            default:
                this.colNumber = level.getColumnAsInt();
                this.rowNumber = level.getRowAsInt();
                break;
        }
    }
}
