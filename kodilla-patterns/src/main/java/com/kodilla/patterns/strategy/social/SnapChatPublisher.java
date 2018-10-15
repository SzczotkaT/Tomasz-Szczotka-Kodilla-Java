package com.kodilla.patterns.strategy.social;

public class SnapChatPublisher implements SocialPublisher {
    @Override
    public String share(){
        return "Snapchat";
    }
}
