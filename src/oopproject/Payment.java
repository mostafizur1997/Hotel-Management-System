
package oopproject;
import java.util.ArrayList;
import java.util.Scanner;

public class Payment {
    String payment_id;
    String card_number;
    String card_password;
    Booking booking;//aggregation
    Customer customer; //aggregation
    //Room room;
    

    public Payment(String payment_id, String card_number, String card_password, Booking booking,Customer customer) {
        this.payment_id = payment_id;
        this.card_number = card_number;
        this.card_password = card_password;
        this.booking =booking;
        this.customer=customer;
        //this.room=room;
    }
    
    public void inputForpayment() {
		Scanner b=new Scanner(System.in);
		System.out.println("Enter Payment id: ");
		payment_id=b.nextLine();
		System.out.println("Enter card Number: ");
		card_number=b.nextLine();
                System.out.println("Enter password 0123 : ");
		card_password=b.nextLine();
                
    }

    public String getPayment_id() {
        return payment_id;
    }

    public void setPayment_id(String payment_id) {
        this.payment_id = payment_id;
    }

    public String getCard_number() {
        return card_number;
    }

    public void setCard_number(String card_number) {
        this.card_number = card_number;
    }

    public String getCard_password() {
        return card_password;
    }

    public void setCard_password(String card_password) {
        this.card_password = card_password;
    }
    
    
    
    public void billGenerate(){
    if(card_password.equals("0123")){
        System.out.println("Your rent is: "+booking.room.rent);
        
    }
    else{
    System.out.println("Sorry, Wrong password. Please Enter your bank details again: ");
    inputForpayment();
    }
    }
    
    


    
}