package com.patterns.memento.models;

public class BankAccount {

    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public Memento deposit(int amount) {
        this.balance += amount;
        return new Memento(this.balance);
    }

    public void restore(Memento memento) {
        this.balance = memento.getBalance();
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                '}';
    }
}
