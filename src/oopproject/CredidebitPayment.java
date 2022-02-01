
package oopproject;

import java.util.Scanner;

public class CredidebitPayment extends Payment{//inheritence this class from Payment class
    int amount;
    CredidebitPayment(int amount,String payment_id, String card_number, String card_password, Booking booking, Customer customer){
        super(payment_id, card_number,card_password,booking,customer);
        this.amount=amount;
    }
    public void payStatus(){
        int remainder=0,amount=0,test=0;
        Scanner b=new Scanner(System.in);
        System.out.println("Your rent is : "+booking.room.rent);
        System.out.println("Enter your amount: ");
        amount= Integer.parseInt(b.nextLine());
        remainder=booking.room.rent-amount;
        //System.out.println("Show the remainder: "+remainder);
        
        
        if(remainder==0){
        System.out.println("Thank you so much, Succesfully paid ");
        System.out.println("You have paid by online: "+amount);
        }
        
        else if(remainder>0){
        System.out.println("Sir you have to pay extra: $"+ remainder);
        System.out.println("You have paid by online: "+amount);
       
        }
        
        else if(remainder<0){
        System.out.println("You will get back some money sir, please give me sometime ");
        System.out.println("Take it sir: $"+ Math.abs(remainder));// convert negative remainder to positive
        System.out.println("You have paid by online: $"+Math.abs(remainder));
        }
        
        
        else{
            System.out.println("Sorry you cannot complete your payment, you have to try again for payment: ");
            
        }
    }
    
    
}
