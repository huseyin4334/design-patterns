package com.patterns.nullobject.example.interfaces;

public interface Logger {
    // max # of elements in the log
    int getRecordLimit();

    // number of elements already in the log
    int getRecordCount();

    // expected to increment record count
    void logInfo(String message);
}
