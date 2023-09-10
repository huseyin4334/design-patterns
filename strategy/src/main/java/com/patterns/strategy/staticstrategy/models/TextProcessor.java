package com.patterns.strategy.staticstrategy.models;

import com.patterns.strategy.dynamic.interfaces.ListStrategy;
import com.patterns.strategy.dynamic.models.HtmlStrategy;
import com.patterns.strategy.dynamic.models.MarkdownStrategy;
import com.patterns.strategy.dynamic.models.OutputFormat;

import java.util.function.Supplier;

public class TextProcessor<LS extends ListStrategy> {

    private StringBuilder sb = new StringBuilder();

    private LS listStrategy;

    public TextProcessor(Supplier<? extends LS> ctor) {
        listStrategy = ctor.get();
    }

    public void appendList(String[] items) {
        listStrategy.start(sb);
        for (String item : items) {
            listStrategy.addListItem(sb, item);
        }
        listStrategy.end(sb);
    }

    public void clear() {
        sb.setLength(0);
    }

    @Override
    public String toString() {
        return listStrategy.getClass().getSimpleName() + "\n" + sb.toString();
    }
}
