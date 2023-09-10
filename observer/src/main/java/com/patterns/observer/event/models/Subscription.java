package com.patterns.observer.event.models;

public class Subscription implements AutoCloseable {

        private Event<?> event;
        private int id;

        public Subscription(Event<?> event, int id) {
            this.event = event;
            this.id = id;
        }

        @Override
        public void close() {
            event.getHandlers().remove(id);
        }
}
