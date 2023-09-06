package com.patterns.nullobject.example.models;

import com.patterns.nullobject.example.interfaces.Logger;

class Account {
    private Logger log;

    public Account(Logger log) {
        this.log = log;
    }

    public void someOperation() throws Exception {
        int c = log.getRecordCount();
        log.logInfo("Performing an operation");
        if (c + 1 != log.getRecordCount())
            throw new Exception();
        if (log.getRecordCount() >= log.getRecordLimit())
            throw new Exception();
    }
}
