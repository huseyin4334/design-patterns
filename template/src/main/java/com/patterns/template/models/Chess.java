package com.patterns.template.models;

public class Chess extends Game {

    private int turn = 1;

    public Chess() {
        super(2);
    }

    @Override
    protected void start() {
        System.out.println("Starting a game of chess.");
    }

    @Override
    protected boolean haveWinner() {
        int maxTurns = 10;
        return turn == maxTurns;
    }

    @Override
    protected void takeTurn() {
        System.out.println("Turn " + (turn++) + " taken by player " + (currentPlayer + 1) + ".");
        currentPlayer = (currentPlayer + 1) % numberOfPlayers;
    }
}
