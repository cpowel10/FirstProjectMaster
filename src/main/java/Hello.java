import hr.*;
import finance.*;

public class Hello {
    public void checkDetails(){
        System.out.println("3.Checking details of attendees");
    }
    public void displayDetails(){
        System.out.println("2.Thanks for attending the session");
        Hello hello = new Hello();
        hello.checkDetails();
    }

    public static void main(String args[]){
        Hello hello = new Hello();
        System.out.println("1.Our first program");
        hello.displayDetails();
        System.out.println("4.Hello and welcome to Revature");
        Customer customer = new Customer();
        customer.displayCustomerDetails();
        Salary s = new Salary();
        s.calculateSalary();
        Tax t = new Tax();
        t.calculateTax();
        Company c = new Company();
        c.totalIncome();
        Investors i = new Investors();
        i.totalInvestors();
    }
}

class Demo1{
    int age = 90;
    public void display(){
        age=99;
    }
}

class Demo2{
    public void display(){
        Demo1 d1= new Demo1();
        d1.age=887;
    }
}

class Demo3 extends Demo1{
    public void display(){
        age=22;
    }
}