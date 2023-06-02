package org.CodeForPizza.Uppgift5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotificationServiceTest {

    EmailSender email = new EmailSender();
    DmSender dm = new DmSender();


    @Test
    void testNotifyEmail() {
        NotificationService sup = new NotificationService(email);
        String value = "Hello World!";
        String expected = "Email sent: Hello World!";

        sup.notify(value);

        assertEquals(expected, sup.notify(value));
    }

    @Test
    void testNotifyDM() {
        NotificationService sup = new NotificationService(dm);
        String value = "Hello World!";
        String expected = "DM sent: Hello World!";

        sup.notify(value);

        assertEquals(expected, sup.notify(value));
    }



}