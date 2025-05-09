package FactoryPattern;

public class Main {
    public static void main(String[] args) {
        NotificationFactory factory = new NotificationFactory();

        Notification sms = factory.createNotification("sms");
        sms.notifyUser();

        Notification email = factory.createNotification("email");
        email.notifyUser();

        Notification push = factory.createNotification("push");
        push.notifyUser();
    }
}