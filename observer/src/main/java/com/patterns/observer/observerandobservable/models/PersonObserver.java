package com.patterns.observer.observerandobservable.models;

import com.patterns.observer.observerandobservable.interfaces.Observer;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor(access = lombok.AccessLevel.PRIVATE)
public class PersonObserver implements Observer<Person> {

    private int observerIDTracker = 0;

    @Override
    public void handle(PropertyChangeEventArgs<Person> args) {
        System.out.println("[Tracker-" + observerIDTracker + "]" + " Person's " + args.getPropertyName() + " has been changed to " + args.getNewValue());
    }
}
