package com.patterns.state.example;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        CombinationLock cl = new CombinationLock(new int[]{1, 2, 3, 4});
        cl.enterDigit(1);
        cl.enterDigit(2);
        cl.enterDigit(3);
        cl.enterDigit(4);
        System.out.println(cl.status);

        cl.enterDigit(1);
        cl.enterDigit(2);
        cl.enterDigit(5);
        cl.enterDigit(4);
        System.out.println(cl.status);
    }
}

class CombinationLock
{
    private int [] combination;
    public String status = State.LOCKED.name();

    public CombinationLock(int[] combination)
    {
        this.combination = combination;
    }

    public void enterDigit(int digit)
    {
        System.out.println("Digit: " + digit + " Status: " + status);
        if (State.LOCKED.stateControl(status))
            status = "";

        if (digit == combination[status.length()]) {
            status = status + digit;
            if (status.length() == combination.length) {
                status = State.OPEN.name();
            }
        } else {
            status = State.ERROR.name();
        }
    }
}

enum State
{
    LOCKED,
    OPEN,
    ERROR;

    public boolean stateControl(String name) {
        return Arrays.stream(values()).anyMatch(s -> s.name().equals(name));
    }
}