package com.patterns.mediator.chatroom;

import com.patterns.mediator.chatroom.models.ChatRoom;
import com.patterns.mediator.chatroom.models.Person;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ChatRoom room = new ChatRoom();

        Person john = new Person("John");
        Person jane = new Person("Jane");

        room.join(john);
        room.join(jane);

        john.say("hi room");
        jane.say("oh, hey john");

        Person simon = new Person("Simon");
        room.join(simon);
        simon.say("hi everyone!");

        jane.privateMessage("Simon", "glad you could join us!");
    }

    /*
        A component which facilitates communication between other components
        without them necessarily being aware of each other or having direct (reference) access to each other.

        Example:
        Aircraft pilots don’t talk to each other directly when deciding who gets to land their plane next. All communication goes through the control tower.

        More: https://refactoring.guru/design-patterns/mediator
     */
}
