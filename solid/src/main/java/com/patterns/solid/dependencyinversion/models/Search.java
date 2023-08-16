package com.patterns.solid.dependencyinversion.models;

import com.patterns.solid.dependencyinversion.enums.Relationship;
import com.patterns.solid.dependencyinversion.interfaces.RelationshipBrowser;

public class Search {
    /*public Search(Relationships relationships) { // problematic way
        relationships.getRelations()
                .stream()
                .filter(x -> x.getValue0().getName().equals("John") && x.getValue1().equals(Relationship.PARENT))
                .forEach(p -> System.out.println("John has a child called " + p.getValue2().getName()));
    }*/

    public Search(RelationshipBrowser relationshipBrowser) { // we abstracted low level from high level
        relationshipBrowser.findAllChildrenOf("John")
                .forEach(p -> System.out.println("John has a child called " + p.getName()));
    }
}
