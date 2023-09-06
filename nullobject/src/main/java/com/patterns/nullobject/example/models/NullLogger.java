package com.patterns.nullobject.example.models;

import com.patterns.nullobject.example.interfaces.Logger;

public class NullLogger implements Logger {
    @Override
    public int getRecordLimit() {
        return 0;
    }

    @Override
    public int getRecordCount() {
        return 0;
    }

    @Override
    public void logInfo(String message) {

    }
}
