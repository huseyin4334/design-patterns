package com.patterns.mediator.eventbroker.models;

import io.reactivex.Observable;
import io.reactivex.Observer;

import java.util.ArrayList;
import java.util.List;

public class EventBroker extends Observable<Integer> {

    private List<Observer<? super Integer>> observer = new ArrayList<>();


    @Override
    protected void subscribeActual(Observer<? super Integer> observer) {
        this.observer.add(observer);
    }

    public void publish(int n) {
        for (Observer<? super Integer> o : observer) {
            o.onNext(n);
        }
    }
}
