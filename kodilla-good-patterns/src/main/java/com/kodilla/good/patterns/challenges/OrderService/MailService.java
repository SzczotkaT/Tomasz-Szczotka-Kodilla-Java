package com.kodilla.good.patterns.challenges.OrderService;

public class MailService implements InformationService {
    public void inform(User user) {
        System.out.println("Sending an Email to user");
    }
}
