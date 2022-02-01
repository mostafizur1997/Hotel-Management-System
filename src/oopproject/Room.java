
package oopproject;
import java.util.ArrayList;
import java.util.Scanner;

public class Room {
    String room_number;
    int price;
    private final Customer customer;// aggregation
    int rent;
   

    public Room(String room_number, int price, Customer customer) {
        this.room_number = room_number;
        this.price = price;
        this.customer=customer;
    }
    
    public String getRoom_number() {
        return room_number;
    }

    public void setRoom_number(String room_number) {
        this.room_number = room_number;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
   
    public void roomdetails(){
    System.out.println("1.For single room rent is $30");
    System.out.println("2.For twin room fair is $40");
    System.out.println("3.For double room rent is $50");
    System.out.println("4.For king room rent is $65");
    }
    
    public int roomrent(){
    Scanner b=new Scanner(System.in);
    int select=0,rNumber=0;//, rent=0;
    System.out.println("Select the room type: ");
    select= Integer.parseInt(b.nextLine());
    switch(select) {
	case 1:
                System.out.println("please Enter how many room you want: ");
                rNumber= Integer.parseInt(b.nextLine());
                rent=rent+(30*rNumber);
                System.out.println("Total rent: "+rent);
                break;
                
        case 2:
                System.out.println("please Enter how many room you want: ");
                rNumber= Integer.parseInt(b.nextLine());
                rent=rent+(40*rNumber);
                System.out.println("Total rent: "+rent);
                break;
                
                
        case 3:
                System.out.println("please Enter how many room you want: ");
                rNumber= Integer.parseInt(b.nextLine());
                rent=rent+(50*rNumber);
                System.out.println("Total rent: "+rent);
                break;
                
        case 4:
                System.out.println("please Enter how many room you want: ");
                rNumber= Integer.parseInt(b.nextLine());
                rent=rent+(65*rNumber);
                System.out.println("Total rent: "+rent);
                break;
                
               
        default:
                break;
            
        
    }
    return rent;
    }
}
    
   
    
    

    
    

