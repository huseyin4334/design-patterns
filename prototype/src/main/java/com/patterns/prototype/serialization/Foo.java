package com.patterns.prototype.serialization;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@AllArgsConstructor
@Getter
@Setter
public class Foo implements Serializable {

    private int num;
    private String whatEver;
}
