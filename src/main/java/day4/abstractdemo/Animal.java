package day4.abstractdemo;

public abstract class Animal {
    public abstract void makeNoise();
    public abstract void eat();
    public void sleep(){
        System.out.println("Animal must get sleep to recharge");
    }
    public abstract void roam();
}

abstract class Feline extends Animal{
    @Override
    public void roam(){
        System.out.println("All feline will roam by walking");
    }
}
class Lion extends Feline{

    @Override
    public void makeNoise() {
        System.out.println("");
    }

    @Override
    public void eat() {

    }
}

class Tiger extends Feline{

    @Override
    public void makeNoise() {

    }

    @Override
    public void eat() {

    }
}

class Cat extends Feline{

    @Override
    public void makeNoise() {

    }

    @Override
    public void eat() {

    }
}

abstract class Hippo extends Animal{
    public void makeNoise(){

    }
    public void eat(){

    }
}

abstract class Canine extends Animal{
    public void roam(){

    }
}

class Dog extends Canine{

    @Override
    public void makeNoise() {

    }

    @Override
    public void eat() {

    }
}

class Wolf extends Canine{

    @Override
    public void makeNoise() {

    }

    @Override
    public void eat() {

    }
}