package day2;

public class DemoLocalVariables {
    int num1 = 0; //instance variable initialized to 0
    public void display(){
        int num2 = 0; //local variable does not automatically get initialized
        System.out.println(num1+num2);
    }
    public static void main(String[] args) {
        DemoLocalVariables d1= new DemoLocalVariables();
        d1.display();
    }
}
