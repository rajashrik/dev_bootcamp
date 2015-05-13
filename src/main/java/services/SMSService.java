package services;

/**
 * Created by balajisivaraman on 13/05/15.
 */
public class SMSService implements MessagingService {

    @Override
    public void sendNotification() {
        System.out.println("SMS Sent");
    }
}
