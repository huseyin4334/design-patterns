package com.patterns.command;

import com.patterns.command.models.BankAccount;
import com.patterns.command.models.BankAccountCommand;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        BankAccount account = new BankAccount();

        List<BankAccountCommand> commands = new ArrayList<>(List.of(
                new BankAccountCommand(account, BankAccountCommand.Action.DEPOSIT, 100),
                new BankAccountCommand(account, BankAccountCommand.Action.WITHDRAW, 1000)
        ));

        for (BankAccountCommand command : commands) {
            command.call();
            System.out.println(account);
        }

        System.out.println("Undoing commands-----------------------------------");
        Collections.reverse(commands);

        for (BankAccountCommand command : commands) {
            command.undo();
            System.out.println(account);
        }

    }

    /*
        * Command Pattern
        * An object which represents an instruction to perform a particular action. Contains all the information necessary for the action to be taken.
        *
        * More: https://refactoring.guru/design-patterns/command
     */
}
