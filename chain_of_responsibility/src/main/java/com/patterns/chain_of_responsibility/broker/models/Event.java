package com.patterns.chain_of_responsibility.broker.models;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class Event<TArgs> {

    private int index = 0;
    private Map<Integer, Consumer<TArgs>> handlers = new HashMap<>();

    public int subscribe(Consumer<TArgs> handler)
    {
        //handlers.add(handler);
        int i = index;
        handlers.put(index++, handler);
        return i;
    }

    public void unsubscribe(int key)
    {
        handlers.remove(key);
    }

    public void fire(TArgs args)
    {
        for (Consumer<TArgs> handler : handlers.values())
            handler.accept(args);
    }
}

