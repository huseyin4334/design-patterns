package com.patterns.strategy.dynamic.models;

import com.patterns.strategy.dynamic.interfaces.ListStrategy;

public class MarkdownStrategy implements ListStrategy {
    @Override
    public void addListItem(StringBuilder sb, String item) {
        sb.append(" * ").append(item)
            .append(System.lineSeparator());
    }
}
