package com.patterns.state.handmade;

import com.patterns.state.handmade.models.State;
import com.patterns.state.handmade.models.Trigger;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {

    private static final Map<State, List<AbstractMap.SimpleEntry<Trigger, State>>> rules = new HashMap<>();

    private static void prepareRules() {
        rules.put( State.OFF_HOOK, List.of(
                new AbstractMap.SimpleEntry<>(Trigger.CALL_DIALED, State.CONNECTING),
                new AbstractMap.SimpleEntry<>(Trigger.STOP_USING_PHONE, State.ON_HOOK)
        ));

        rules.put( State.CONNECTING, List.of(
                new AbstractMap.SimpleEntry<>(Trigger.HUNG_UP, State.OFF_HOOK),
                new AbstractMap.SimpleEntry<>(Trigger.CALL_CONNECTED, State.CONNECTED)
        ));

        rules.put( State.CONNECTED, List.of(
                new AbstractMap.SimpleEntry<>(Trigger.LEFT_MESSAGE, State.OFF_HOOK),
                new AbstractMap.SimpleEntry<>(Trigger.HUNG_UP, State.OFF_HOOK),
                new AbstractMap.SimpleEntry<>(Trigger.PLACED_ON_HOLD, State.ON_HOLD)
        ));
    }

    private static State currentState = State.OFF_HOOK;

    private static State exitState = State.ON_HOOK;

    public static void main(String[] args) {

        prepareRules();

        BufferedReader console = new BufferedReader(
                new InputStreamReader(System.in)
        );

        do {
            System.out.println("The phone is currently " + currentState);
            System.out.println("Select a trigger:");

            for (int i = 0; i < rules.get(currentState).size(); i++) {
                Trigger trigger = rules.get(currentState).get(i).getKey();

                System.out.println(i + ". " + trigger);
            }

            boolean parseOK;
            int choice = 0;

            do {
                try {
                    System.out.println("Please enter your choice:");

                    choice = Integer.parseInt(console.readLine());
                    parseOK = choice >= 0 && choice < rules.get(currentState).size();
                } catch (Exception e) {
                    parseOK = false;
                }
            } while (!parseOK);

            currentState = rules.get(currentState).get(choice).getValue();

        } while (currentState != exitState);

        System.out.println("And we are done!");
    }
}
