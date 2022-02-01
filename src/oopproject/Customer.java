
package oopproject;
import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Customer implements CustomerInfo{
    public String id;
    public String name;
    private String username;
    private String password;
    
    
    public Customer(String id, String name, String username, String password) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
    }

    
        // customer input their details
    public void input() {
		Scanner b=new Scanner(System.in);
		System.out.println("Enter customer id: ");
		id=b.nextLine();
		System.out.println("Enter customer name: ");
		name=b.nextLine();
                System.out.println("Enter customer username: ");
		username=b.nextLine();
                System.out.println("For password, Plz access the five keywords and every keyword must be number: ");
                
                try{
                    
                    int array[][]=new int[5][1];
                    System.out.println("Enter customer password: ");
                    for(int i=0;i<5;i++){
                        for (int j=0;j<1;j++){
                    array[i][j]=Integer.parseInt(b.nextLine());
                    }
                    }
                    System.out.println("Customer want to know 6th number digit of password :" + array[6]);
                   
                }
                catch(ArrayIndexOutOfBoundsException e){
                    System.out.println("Exception thrown" +e);
                    
                }
                catch(InputMismatchException e){
                   
                    System.out.println("Exception thrown" +e);
                    
                }
                
                finally{
                System.out.println("For password, number of 6th position is out of boundary");
                }
                
    }
    
    public void customerInfo(){
        String checkid;
        Scanner b=new Scanner(System.in);
        System.out.println("Please Enter the id to check the customer details: ");
        checkid= b.nextLine();
        if (checkid.equals(id)){
            
            System.out.println("Customer id is: "+id);
            System.out.println("Customer name is: "+name);
            System.out.println("Customer username is: "+username);
            
        }
        else{
            
            System.out.println("The input id is incorrect, could you please enter the id again");
            customerInfo();
        }
 
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    public void info()
    {
        System.out.println("Your id is: "+id);
        System.out.println("Your name is: "+name);

    }
}
