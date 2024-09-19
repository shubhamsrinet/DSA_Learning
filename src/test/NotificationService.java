package test;

public class NotificationService {

    Notification notification;

    public NotificationService(Notification notification) {
        this.notification = notification;
    }

    public void notifying(){
        notification.send();
    }

    public static void main(String[] args){
        NotificationService notificationService = new NotificationService(new SMSNotification());
        notificationService.notifying();
    }
}
