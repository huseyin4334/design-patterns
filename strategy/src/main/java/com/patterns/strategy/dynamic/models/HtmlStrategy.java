package com.patterns.strategy.dynamic.models;

import com.patterns.strategy.dynamic.interfaces.ListStrategy;

public class HtmlStrategy implements ListStrategy {
    @Override
    public void addListItem(StringBuilder sb, String item) {
        sb.append("  <li>")
            .append(item)
            .append("</li>")
            .append(System.lineSeparator());
    }

    @Override
    public void start(StringBuilder sb) {
        sb.append("<ul>")
            .append(System.lineSeparator());
    }

    @Override
    public void end(StringBuilder sb) {
        sb.append("</ul>")
            .append(System.lineSeparator());
    }
}
