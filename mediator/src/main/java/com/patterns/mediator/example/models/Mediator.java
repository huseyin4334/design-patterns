package com.patterns.mediator.example.models;

import java.util.ArrayList;
import java.util.List;

public class Mediator {
    public List<Participant> p = new ArrayList<>();


    public void broadcast(Participant pa, int n) {
        p.stream()
                .filter(par -> !par.equals(pa))
                .forEach(par -> par.value = n);
    }
}
