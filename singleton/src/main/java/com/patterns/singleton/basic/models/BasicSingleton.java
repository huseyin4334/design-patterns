package com.patterns.singleton.basic.models;

import lombok.*;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class BasicSingleton {

    private static final BasicSingleton INSTANCE = new BasicSingleton();

    @Getter
    @Setter
    private int value;

    public static BasicSingleton getInstance() {
        return INSTANCE;
    }


}
