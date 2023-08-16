package com.patterns.solid.dependencyinversion.interfaces;

import com.patterns.solid.dependencyinversion.models.Person;

import java.util.List;

public interface RelationshipBrowser {

    List<Person> findAllChildrenOf(String name);
}
