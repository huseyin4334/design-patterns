package com.patterns.observer.example;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class App
{
    public static void main( String[] args ) throws IOException {
        Game game = new Game();
        Rat rat = new Rat(game);
        Rat rat2 = new Rat(game);
        System.out.println(rat.attack);
        System.out.println(rat2.attack);
        rat.close();
        System.out.println(rat2.attack);
    }
}

class Game
{
    public List<Rat> rats = new ArrayList<>();

    public void addRat(Rat rat) {
        rats.add(rat);
        int size = rats.size();
        for (Rat r : rats)
            r.attack = size;
    }

    public void dieRat(Rat rat) {
        rats.remove(rat);
        int size = rats.size();
        for (Rat r : rats)
            r.attack = size;
    }
}

class Rat implements Closeable
{
    private Game game;
    public int attack = 1;

    public Rat(Game game) {
        this.game = game;
        this.game.addRat(this);
    }

    @Override
    public void close() throws IOException {
        game.dieRat(this);
    }
}
