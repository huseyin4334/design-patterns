package com.patterns.solid.dependencyinversion.models;

import com.patterns.solid.dependencyinversion.enums.Relationship;
import com.patterns.solid.dependencyinversion.interfaces.RelationshipBrowser;
import lombok.Getter;
import org.javatuples.Triplet;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Relationships implements RelationshipBrowser {

    @Getter
    private final List<Triplet<Person, Relationship, Person>> relations = new ArrayList<>();

    public void addParentAndChild(Person parent, Person child) {
        relations.add(new Triplet<>(parent, Relationship.PARENT, child));
        relations.add(new Triplet<>(child, Relationship.CHILD, parent));
    }

    @Override
    public List<Person> findAllChildrenOf(String name) {
        return relations.stream()
                .filter(x -> Objects.equals(x.getValue0().getName(), name) && x.getValue1().equals(Relationship.PARENT))
                .map(Triplet::getValue2)
                .collect(Collectors.toList());
    }
}
