package day2;

public class ControlFlowDemo {
    int num=10;
    int age;

    public void display(){
        if(age<0){
            System.out.println("Age is negative");
        }
        else if (age > 120){
            System.out.println("You are over aged");
        }
    }
    public ControlFlowDemo(){
        age = 1000;
    }

    public static void main(String[] args) {
        ControlFlowDemo demo = new ControlFlowDemo();
        demo.display();
    }
}
