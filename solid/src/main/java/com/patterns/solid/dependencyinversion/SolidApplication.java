package com.patterns.solid.dependencyinversion;

import com.patterns.solid.dependencyinversion.models.Person;
import com.patterns.solid.dependencyinversion.models.Relationships;
import com.patterns.solid.dependencyinversion.models.Search;

public class SolidApplication {

    public static void main(String[] args) throws Exception{

        Person parent = new Person("John");
        Person child = new Person("Chris");
        Person child2 = new Person("Matt");

        Relationships relationships = new Relationships();

        relationships.addParentAndChild(parent, child);
        relationships.addParentAndChild(parent, child2);

        new Search(relationships);
    }

    /*
        A -> High level modules should not depend on low level modules.
             Both should depend on abstractions.
        B -> Abstractions should not depend on details.
             Details should depend on abstractions.

        Relations class is low level module
        Search class is high level module

        Search is taking relations in constructor. That's not ok for A rule.

        We create RelationshipBrowser interface. Because we want to share just functionality with high level.
        High level module can't modify data.
        And I don't change any other code. Because RelationshipBrowser is base class.
     */
}
