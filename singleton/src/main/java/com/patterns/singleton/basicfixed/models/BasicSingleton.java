package com.patterns.singleton.basicfixed.models;

import lombok.*;

import java.io.Serializable;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class BasicSingleton implements Serializable {

    protected static final BasicSingleton INSTANCE = new BasicSingleton();

    @Getter
    @Setter
    private int value;

    public static BasicSingleton getInstance() {
        return INSTANCE;
    }

    protected Object readResolve() {
        return INSTANCE;
    }

}
