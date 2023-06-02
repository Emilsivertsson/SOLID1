package org.CodeForPizza.Uppgift5;

public class NotificationService {

    private MessageSender messageSender;

    public NotificationService(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public String notify(String message) {
        return messageSender.sendMessage(message);
    }
}
