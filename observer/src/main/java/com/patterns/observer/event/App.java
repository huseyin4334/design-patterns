package com.patterns.observer.event;

import com.patterns.observer.event.models.Person;
import com.patterns.observer.event.models.Subscription;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        Person person = new Person();
        Subscription subscription  = person.propertyChanged
                .addHandler(x -> {
            System.out.println("Person's " + x.getPropertyName() + " has changed");
        });
        person.setAge(17);
        person.setAge(18);
        subscription.close();
        person.setAge(19);

    }

    /*
        An observer is an object that wishes to be informed about events happening in the system. The entity generating the events is an observable.
     */
}
