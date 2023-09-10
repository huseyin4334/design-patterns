package com.patterns.template.models;

public abstract class Game {

    protected int currentPlayer;
    protected final int numberOfPlayers;

    public Game(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    public void run() {
        start();
        while(!haveWinner()) {
            takeTurn();
            System.out.println("Player " + (currentPlayer + 1) + " wins!");
        }
    }

    protected abstract void start();
    protected abstract boolean haveWinner();
    protected abstract void takeTurn();
}
