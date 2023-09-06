package com.patterns.nullobject.models;

import com.patterns.nullobject.interfaces.Log;

public class ConsoleLog implements Log {

        @Override
        public void info(String msg) {
            System.out.println("INFO: " + msg);
        }

        @Override
        public void warn(String msg) {
            System.out.println("WARN: " + msg);
        }


}
