package com.patterns.strategy.dynamic.models;

import com.patterns.strategy.dynamic.interfaces.ListStrategy;

public class TextProcessor {

    private StringBuilder sb = new StringBuilder();

    private ListStrategy listStrategy;

    public TextProcessor(OutputFormat format) {
        setOutputFormat(format);
    }

    public void setOutputFormat(OutputFormat format) {
        switch (format) {
            case MARKDOWN -> listStrategy = new MarkdownStrategy();
            case HTML -> listStrategy = new HtmlStrategy();
        }
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
