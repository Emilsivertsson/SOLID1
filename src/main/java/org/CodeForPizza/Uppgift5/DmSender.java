package org.CodeForPizza.Uppgift5;

public class DmSender implements MessageSender{
    @Override
    public String sendMessage(String message) {
        return ("DM sent: " + message);
    }
}
