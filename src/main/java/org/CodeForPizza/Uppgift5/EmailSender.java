package org.CodeForPizza.Uppgift5;

public class EmailSender implements MessageSender {

    @Override
    public String sendMessage(String message) {
        return ("Email sent: " + message);
    }
}
