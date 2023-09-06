package com.patterns.memento;

import com.patterns.memento.models.BankAccount;
import com.patterns.memento.models.Memento;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        BankAccount bankAccount = new BankAccount(100);
        System.out.println(bankAccount);

        Memento memento = bankAccount.deposit(50);
        Memento memento2 = bankAccount.deposit(25);
        System.out.println(bankAccount);

        bankAccount.restore(memento);
        System.out.println(bankAccount);

        bankAccount.restore(memento2);
        System.out.println(bankAccount);
    }
}
