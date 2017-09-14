package com.theironyard.inheritance;

public class EmailNotification extends Notification {
    private String recipient;
    private String smtpProvider;

    public EmailNotification(String subject, String body, String recipient, String smtpProvider) {
        super(subject, body);
        this.recipient = recipient;
        this.smtpProvider = smtpProvider;
        this.status = printText("Email works. ");
    }

    public String getRecipient() { return recipient; }

    public String getSmtpProvider() { return smtpProvider; }

    @Override
    public String printText(String x) {
        return super.printText(x + "This is a sample of overriding the method from the subclass and making it public.");
    }

    @Override
    public void transport() throws NoTransportException {
        System.out.println(getSubject() + getBody() + getCreatedAt() + recipient + smtpProvider);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmailNotification that = (EmailNotification) o;

        if (!recipient.equals(that.recipient)) return false;
        return smtpProvider.equals(that.smtpProvider);
    }

    @Override
    public int hashCode() {
        int result = recipient.hashCode();
        result = 31 * result + smtpProvider.hashCode();
        return result;
    }

    @Override
    protected Object clone() {
        return new EmailNotification(this.getSubject(), this.getBody(), this.recipient, this.smtpProvider);
    }
}

