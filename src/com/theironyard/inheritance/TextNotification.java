package com.theironyard.inheritance;

public class TextNotification extends Notification {
    private String recipient;
    private String smsProvider;

    public TextNotification(String subject, String body, String recipient, String smsProvider) {
        super(subject, body);
        this.recipient = recipient;
        this.smsProvider = smsProvider;
        this.status = printText("Text works. This is a test for protected subclass feature.");
    }

    public String getRecipient() { return recipient; }

    public String getSmsProvider() { return smsProvider; }

    @Override
    public void transport() throws NoTransportException {
        System.out.println(getSubject() + getBody() + getCreatedAt() + recipient + smsProvider);
    }
}
