package com.patterns.mediator.chatroom.models;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom {

    private final List<Person> people = new ArrayList<>();

    public void broadcast(String source, String message) {
        for (Person person : people) {
            if (!person.getName().equals(source)) {
                person.receive(source, message);
            }
        }
    }

    public void join(Person person) {
        String joinMsg = person.getName() + " joins the chat";
        broadcast("room", joinMsg);

        person.setRoom(this);
        people.add(person);
    }

    public void message(String source, String destination, String message) {
        people.stream()
                .filter(p -> p.getName().equals(destination))
                .findFirst()
                .ifPresent(person -> person.receive(source, message));
    }
}
