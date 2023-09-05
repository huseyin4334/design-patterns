package com.patterns.mediator.example.models;

public class Participant
{
    public int value = 0;
    private Mediator mediator;
  
  public Participant(Mediator mediator) {
    this.mediator = mediator;
    mediator.p.add(this);
  }

  public void say(int n)
  {
    mediator.broadcast(this, n);
  }
}

