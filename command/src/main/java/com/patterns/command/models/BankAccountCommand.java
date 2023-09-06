package com.patterns.command.models;

import com.patterns.command.interfaces.Command;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(onConstructor = @__(@NonNull))
public class BankAccountCommand implements Command {

    @NonNull
    private BankAccount account;

    @NonNull
    private Action action;

    @NonNull
    private int amount;
    private boolean succeeded;

    public enum Action {
        DEPOSIT, WITHDRAW
    }
    @Override
    public void call() {
        switch (action) {
            case DEPOSIT -> succeeded = account.deposit(amount);
            case WITHDRAW -> succeeded = account.withdraw(amount);
        }
    }

    @Override
    public void undo() {
        if (!succeeded) return;
        switch (action) {
            case DEPOSIT -> succeeded = account.withdraw(amount);
            case WITHDRAW -> succeeded = account.deposit(amount);
        }
    }
}
