package com.patterns.observer.observerandobservable;

import com.patterns.observer.observerandobservable.models.Person;
import com.patterns.observer.observerandobservable.models.PersonObserver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        Person person = new Person();
        person.subscribe(new PersonObserver(0));
        person.subscribe(new PersonObserver(1));
        person.setAge(17);
        person.setAge(18);
        person.setAge(19);

    }

    /*
        An observer is an object that wishes to be informed about events happening in the system. The entity generating the events is an observable.

        More info: https://refactoring.guru/design-patterns/observer
     */
}
