package com.patterns.solid.dependencyinversion.models;

import com.patterns.solid.dependencyinversion.enums.Relationship;

public class Search {
    public Search(Relationships relationships) {
        relationships.getRelations()
                .stream()
                .filter(x -> x.getValue0().getName().equals("John") && x.getValue1().equals(Relationship.PARENT))
                .forEach(p -> System.out.println("John has a child called " + p.getValue2().getName()));

    }
}
