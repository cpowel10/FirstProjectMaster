package day2;
//QC : What is a static keyword in Java?
//Real Time Scenario: Count the number of objects created
public class StaticDemo {
    int num1=10; //instance scope
    static int num2=20; //class scope
    static int counter=0;
    public void changeValue(){
        num1--;
        num2++;
    }
    public static void changeValueAgain(){
        //num1--; Will not compile
        num2++;
    }

    public static void main(String[] args) {
        StaticDemo d1 = new StaticDemo();
        d1.counter++;
        d1.changeValue(); //d1 num1=9 num2=21
        StaticDemo d2 = new StaticDemo();
        d2.counter++;
        d2.changeValue(); //d2 num1=9 num2=22
        System.out.println(num2); //22
        changeValueAgain(); //num2=23
        System.out.println(d1.num1); //9
        System.out.println(num2); //23
        System.out.println(d1.num2); //23
        System.out.println(StaticDemo.num2);//23

        System.out.println("D1 num1 : " + d1.num1); //9
        System.out.println("D1 num2 : " + d1.num2); //23

        System.out.println("D2 num1 : " + d2.num1); //9
        System.out.println("D2 num2 : " + d2.num2); //23

        System.out.println("Number of objects created: " + counter);
    }
}
