package com.patterns.solid.dependencyinversion.models;

import com.patterns.solid.dependencyinversion.enums.Relationship;
import lombok.Getter;
import org.javatuples.Triplet;

import java.util.ArrayList;
import java.util.List;

public class Relationships {

    @Getter
    private List<Triplet<Person, Relationship, Person>> relations = new ArrayList<>();

    public void addParentAndChild(Person parent, Person child) {
        relations.add(new Triplet<>(parent, Relationship.PARENT, child));
        relations.add(new Triplet<>(child, Relationship.CHILD, parent));
    }
}
