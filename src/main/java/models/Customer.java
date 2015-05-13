package models;

/**
 * Created by balajisivaraman on 13/05/15.
 */
public class Customer {

    private String userName;
    private String emailId;

    public Customer(String userName, String emailId) {
        this.userName = userName;
        this.emailId = emailId;
    }

    public String getEmailId() {
        return emailId;
    }

    public String getUserName() {
        return userName;
    }

    public Order checkout(Cart cart) throws Exception {
        if(cart.getItemCount()<=0) {
            throw new Exception("Cart is empty!!");
        }
        return new Order(cart,this);
    }
}
