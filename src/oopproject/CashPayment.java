
package oopproject;

import java.util.Scanner;

public class CashPayment extends Payment{ //inheritence this class from Payment class
    int amount;
    CashPayment(int ammount,String payment_id, String card_number, String card_password, Booking booking, Customer customer){
        super(payment_id,card_number,card_password,booking,customer);
        this.amount=amount;
    }
    
    public void payStatus(){ //overriding
        int remainder=0,amount=0,test=0;
        Scanner b=new Scanner(System.in);
        System.out.println("Asked the manager how much the rent is: ");
        System.out.println("Then Manager said, your rent is : "+booking.room.rent);
        System.out.println("Then customer said, Please Take my rent: ");
        amount= Integer.parseInt(b.nextLine());
        remainder=booking.room.rent-amount;
        //System.out.println("Show the remainder: "+remainder);
        
        
        if(remainder==0){
        System.out.println("Manager Said,Thank you so much sir, You have succesfully paid ");
        
        }
        
        else if(remainder>0){
            System.out.println("Manager said, wait a second sir you have to pay some extra money.");
            System.out.println("please take it: $"+remainder);
            System.out.println("Thank you sir your payment was successfully done, give him a reciept");
        }
        
        else if(remainder<0){
            
            
            System.out.println("You have get back some extra money: $"+Math.abs(remainder));//make remainder positive to negative
            System.out.println("Customer take it,please: $"+Math.abs(remainder));
            System.out.println("Thank you sir your payment was successfully done, give him a reciept");
            
        }
        
        else{
            System.out.println("Thank you sir your payment was successfully done, give him a reciept");
            
        }
    }
    
    
    
}
