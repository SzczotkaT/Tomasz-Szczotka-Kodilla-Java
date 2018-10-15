package com.kodilla.patterns.strategy.social;

public class Milenials extends User {
    public Milenials(String userName){
        super(userName);
        this.socialPublisher = new FacebookPublisher();
    }
}
