package com.patterns.mediator.eventbroker.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FootballPlayer {

    private int goalsScored = 0;
    private EventBroker broker;
    public String name;

    public FootballPlayer(EventBroker broker, String name) {
        this.broker = broker;
        this.name = name;
    }

    public void score() {
        broker.publish(++goalsScored);
    }
}
