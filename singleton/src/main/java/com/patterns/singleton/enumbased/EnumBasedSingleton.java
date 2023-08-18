package com.patterns.singleton.enumbased;

import lombok.Getter;
import lombok.Setter;

public enum EnumBasedSingleton {

    INSTANCE;

    @Getter
    @Setter
    private int value;

    EnumBasedSingleton() {
        value = 455;
    }
}
