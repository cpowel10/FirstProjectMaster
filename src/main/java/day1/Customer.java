package day1;

import java.util.ArrayList;
import java.util.List;
import java.lang.String; //already imported automatically
import java.lang.System; //already imported automatically


public class Customer {
    public void displayCustomerDetails(){
        System.out.println("5.Displaying customer details");
    }

    public static void main(String[] args) {
        System.out.println("day1.Customer main method called");
        Hello h = new Hello();
        h.displayDetails();
        List data = new ArrayList();
        //Scanner sc = new Scanner();
    }
}
