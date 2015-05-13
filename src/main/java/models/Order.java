package models;

import services.MessagingService;

import java.util.List;

/**
 * Created by balajisivaraman on 13/05/15.
 */
public class Order {

    private List<OrderItem> orderItemList;
    private static List<MessagingService> messagingServices;

    public Order(Cart cart,Customer customer) throws Exception{
        if(customer==null){
            throw new  Exception("Please Login to Order !");
        }
        this.orderItemList = cart.getOrderItems();
        notifyObservers();
    }

    public static void subscribe(MessagingService messageService) {
        messagingServices.add(messageService);
    }

    public void notifyObservers() {
        for (MessagingService messagingService : getMessagingServices()) {
            messagingService.sendNotification();
        }
    }

    public List<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public List<MessagingService> getMessagingServices() {
        return messagingServices;
    }
}
