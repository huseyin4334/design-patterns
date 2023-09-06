package com.patterns.memento.models;

import lombok.Getter;

public class Memento {

    @Getter
    private int balance;

    public Memento(int balance) {
        this.balance = balance;
    }
}
