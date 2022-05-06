package day4;

abstract class Vehicle{
    public abstract void start();
    public abstract void stop();

    public void musicPlayer(){
        System.out.println("Music is being played");
    }
}
//concrete class
class Car extends Vehicle{
    //public abstract void diskBrake();
    @Override
    public void start(){
        System.out.println("Car started");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped");
    }

    @Override
    public void musicPlayer() {
        System.out.println("Music is being played");
    }
}
//
//class Hyundai extends Car{
//
//    @Override
//    public void stop() {
//        System.out.println("Hyundai stopped");
//    }
//
//    @Override
//    public void diskBrake() {
//        System.out.println("Disk Brake on");
//    }
//}
class Bike extends Vehicle{

    @Override
    public void start() {
        System.out.println("Bike started");
    }

    @Override
    public void stop() {
        System.out.println("Bike stopped");
    }
}
public class AbstractClassDemo {
    public static void main(String[] args) {
        //Vehicle v = new Vehicle(); //Cannot create instance of abstract class
        Bike b = new Bike();
        b.start();
        b.stop();

        Car c = new Car();
        c.start();
        c.stop();
        c.musicPlayer();
        Vehicle v = new Bike();
        v.start();
        v.stop();

        v = new Car();
        v.start();
        v.stop();

        //Helping the GC
        b = null;
        c=null;
        v=null;
    }
}
