
package oopproject;
import java.util.ArrayList;
import java.util.Scanner;
public class TestMain {

    public static void main(String[] args){
        String i = null,n=null,u=null,p=null;
        Customer customer= new Customer(i,n,u,p);
            customer.input();
            customer.customerInfo();
      
        
        //This is for Room
        String rn=null;
        int pr=0;
        Room room= new Room(rn, pr,customer);
        
        
        //this for hotel
        Hotel hotel=new Hotel("127","Hotel Pan Pacific","Dhaka",room,customer);
        hotel.hotelDetails();
         
        
        //This is for Booking 
        String b_id=null,b_title=null;
        Booking booking= new Booking(b_id,b_title,customer,room);
        booking.editbooking();
        
        
        // This is for payment
        String p_id=null,c_no=null,c_p=null;
        Payment payment=new Payment(p_id,c_no,c_p,booking,customer);
        payment.inputForpayment();
        payment.billGenerate();
        
        
        System.out.println("if you want to pay by online,plz choice 1 or if you want to pay Cash, you can choice anything");
        int choice;
        Scanner b=new Scanner(System.in);
        int select=0,rNumber=0;//, rent=0;
        System.out.println("Select your choice: ");
        choice= Integer.parseInt(b.nextLine());
        if(choice==1){
        //This is for cashpayment
        int amount=0;
        CredidebitPayment cashpayment =new CredidebitPayment(amount,p_id,c_no,c_p,booking,customer);
        cashpayment.payStatus();//overriding
        }
        
        
        else{
        //This is for cashpayment
        int amount=0;
        CashPayment creditdebitpayment =new CashPayment(amount,p_id,c_no,c_p,booking,customer);
        creditdebitpayment.payStatus();//overriding
        }
        
    }
    
}
