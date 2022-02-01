
package oopproject;
import java.util.Scanner;

public class Hotel {
    String hotel_id;
    String hotel_name;
    String hotel_address;
    Customer customer;
    private final Room room ;//composition
    //constructor
    public Hotel(String hotel_id, String hotel_name, String hotel_address,Room room,Customer customer) {
        this.hotel_id=hotel_id;
        this.hotel_name = hotel_name;
        this.hotel_address = hotel_address;
        this.room=room;
        this.customer=customer;
    }
    
    public String getHotel_id() {
        return hotel_id;
    }

    public void setHotel_id(String hotel_id) {
        this.hotel_id = hotel_id;
    }

    public String getHotel_name() {
        return hotel_name;
    }

    public void setHotel_name(String hotel_name) {
        this.hotel_name = hotel_name;
    }

    public String getHotel_address() {
        return hotel_address;
    }

    public void setHotel_address(String hotel_address) {
        this.hotel_address = hotel_address;
    }
    
    public void hotelDetails()
    {
        String answer=null;
        Scanner b=new Scanner(System.in);
        
        System.out.println("Thank you so much, "+customer.name+ " .For you, we will provide our hotel details:");
        System.out.println("1.Hotel id: "+getHotel_id());
        System.out.println("2.Hotel Name: "+getHotel_name());
        System.out.println("3.Hotel Address: "+getHotel_address());
        
        //call the room details
        System.out.println("Do you want to know about hotel room type and price?, if you want to continue write:Yes, If you donot want to continue Write:No");
        answer=b.nextLine();
        if(answer.equals("Yes")){
        
            room.roomdetails();
            System.out.println("rent the room: ");
            room.roomrent();
            
        }
        else if(answer.equals("No"))
        {
            System.out.println("Thank you");
        }
        else
        {
            System.out.println("May be You have wrongly put the wrong keybord, Plz put write corrcet keyword.");
            hotelDetails();
            
        }
        
        
    }

}
