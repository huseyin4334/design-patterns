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

        Search s = new Search(relationships);
    }
}
