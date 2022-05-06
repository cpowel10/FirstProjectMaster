package day3;

public class ArrayDemo {
    public static void main(String[] args) {
        String names[] = {"Jay","Chris","Greg","Leon","Moe"};

        System.out.println("Printing using for loop and arrays.length");
        for (int i = 0 ; i < names.length ; i++){
            System.out.println(names[i]);
        }

        System.out.println("Printing using enhanced for loop");
        for (String name : names){
            System.out.println(name);
        }
    }
}
