package com.patterns.state.spring;

import com.patterns.state.spring.models.Events;
import com.patterns.state.spring.models.StateMachineConfigurer;
import com.patterns.state.spring.models.States;
import org.springframework.statemachine.StateMachine;
import org.springframework.statemachine.transition.Transition;

import java.io.BufferedReader;
import java.io.Console;
import java.io.InputStreamReader;
import java.util.List;


public class App {

    static StateMachineConfigurer smc = new StateMachineConfigurer();
    public static void main(String[] args) throws Exception {

        BufferedReader console = new BufferedReader(
                new InputStreamReader(System.in)
        );

        StateMachine<States, Events> machine = smc.buildMachine();

        machine.start();

        States exitState = States.ON_HOOK;

        do {
            States state = machine.getState().getId();
            System.out.println("The phone is currently " + state);
            System.out.println("Select a trigger:");

            List<Transition<States, Events>> transitions = machine.getTransitions()
                    .stream()
                    .filter(t -> t.getSource().getId() == state)
                    .toList();

            for (int i = 0; i < transitions.size(); ++i) {
                Events trigger = transitions.get(i).getTrigger().getEvent();
                System.out.println(i + ". " + trigger);
            }

            boolean parseOK;
            int choice = 0;

            do {
                try {
                    System.out.println("Please enter your choice:");
                    choice = Integer.parseInt(console.readLine());
                    parseOK = choice >= 0 && choice < transitions.size();
                } catch (Exception e) {
                    parseOK = false;
                }
            } while (!parseOK);

            // perform the transition
            machine.sendEvent(transitions.get(choice).getTrigger().getEvent());

        } while (machine.getState().getId() != exitState);
    }

    /*
        More: https://www.baeldung.com/spring-state-machine - https://spring.io/projects/spring-statemachine
     */
}
