package com.patterns.proxy.property.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Property<T> {

    private T value;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Property<?> property)) return false;
        return Objects.equals(value, property.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
