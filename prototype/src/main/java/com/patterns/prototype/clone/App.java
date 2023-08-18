package com.patterns.prototype.clone;

import com.patterns.prototype.clone.model.Address;
import com.patterns.prototype.clone.model.Person;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws CloneNotSupportedException {
        Person person = new Person(new String[]{"John", "Smith"}, new Address("Nerd", "Ist", "34678"));

        // This is shallow copy. It's looking same reference.
        Person person1 = person;

        person1.getAddress().setCity("Ankara");

        System.out.println(person);
        System.out.println(person1);

        Person person2 = (Person) person.clone();

        person2.getAddress().setCity("Konya");

        System.out.println(person);
        System.out.println(person2);

    }

    /*
        The prototype pattern is a creational design pattern in software development.
        It is used when the type of objects to create is determined by a prototypical instance, which is cloned to produce new objects.

        More: https://refactoring.guru/design-patterns/prototype
     */
}
