
package oopproject;
import java.util.Scanner;

public class Booking {
    String booking_id;
    String booking_title;
    Customer customer;//aggregation
    Room room;//aggregation
    
    public Booking(String booking_id, String booking_title,Customer customer, Room room) {
        this.booking_id = booking_id;
        this.booking_title = booking_title;
        this.customer=customer;
        this.room=room;
    }
    
    public String getBooking_id() {
        return booking_id;
    }

    public void setBooking_id(String booking_id) {
        this.booking_id = booking_id;
    }

    public String getBooking_title() {
        return booking_title;
    }

    public void setBooking_title(String booking_title) {
        this.booking_title = booking_title;
    }
  
    public void editbooking()
    {
        String answer=null;
        Scanner b=new Scanner(System.in);
        System.out.println("Do you want to edit booing, then write down Yes, if you donot want to editing, for skip the page,write No.otherwise you can write anything ");
        
        answer=b.nextLine();
        if(answer.equals("Yes")){
        
            room.roomdetails();
            System.out.println("rent the room: ");
            room.roomrent();
            
        }
        else if(answer.equals("No"))
        {
            System.out.println("Thank you, But you have to reserve at least to go on the next step"); 
        }
        
        else
        {
            System.out.println("Thank you, But you have to reserve at least to go on the next step");
            room.roomdetails();
            room.roomrent();
        }
        
        
        
    }
    
    
    
}
