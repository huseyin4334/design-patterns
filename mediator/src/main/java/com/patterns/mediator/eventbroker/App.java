package com.patterns.mediator.eventbroker;

import com.patterns.mediator.eventbroker.models.EventBroker;
import com.patterns.mediator.eventbroker.models.FootballCoach;
import com.patterns.mediator.eventbroker.models.FootballPlayer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        EventBroker broker = new EventBroker();
        FootballPlayer player = new FootballPlayer(broker, "John");
        FootballCoach coach = new FootballCoach(broker);

        player.score();
        player.score();
        player.score();
    }

    /*
        A component which facilitates communication between other components
        without them necessarily being aware of each other or having direct (reference) access to each other.

        More: https://refactoring.guru/design-patterns/mediator
     */
}
