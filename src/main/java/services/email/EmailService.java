package services.email;

import services.MessagingService;

/**
 * Created by balajisivaraman on 13/05/15.
 */
public class EmailService implements MessagingService {

    private String emailId;


    public EmailService() {

    }

    public EmailService(String emailId) {
        this.emailId = emailId;
    }

    @Override
    public void sendNotification() {
        System.out.println("Notification Received");
        //SEND EMAIL USING ONE OF TWO PROVIDERS
        //DECIDE WHICH PROVIDER TO USE
        //EmailProvider emailProvider = EmailProviderFactory.getEmailProvider(Config.get("EMAIL_PROVIDER_STRATEGY"));
    }
}
