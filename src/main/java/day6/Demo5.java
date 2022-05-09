package day6;

public class Demo5 {
    public void display1() throws InterruptedException {
        System.out.println("Hello Display1");
        Thread.sleep(1000); //pause for 1 second
        System.out.println("Bye Display1");
    }

    public void display2() throws InterruptedException {
        System.out.println("Hello Display2");
        Thread.sleep(1000);
        System.out.println("Bye Display2");
    }
    public static void main(String[] args){ //JVM
        Demo5 d = new Demo5();
        try {
            d.display1();
            d.display2();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
