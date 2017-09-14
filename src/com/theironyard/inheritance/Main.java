package com.theironyard.inheritance;

public class Main {

    public static void main(String[] args) {
        EmailNotification emailNotification = new EmailNotification("Hello", "This is me", "michelle", "verizon");
        TextNotification textNotification = new TextNotification("Hey", "Peekaboo", "mike", "att");

        emailNotification.transport();
        textNotification.transport();
        emailNotification.showStatus();
        textNotification.showStatus();

        Object emailNotificationClone = emailNotification.clone();
        System.out.println(emailNotificationClone);
        System.out.println(emailNotification.equals(emailNotificationClone));
    }

}
//Now in main check of the clone and the original instance are equal
//by calling the equals() method on one and passing the other as an argument.

