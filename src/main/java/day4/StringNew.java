package day4;

public class StringNew {
    public static void main(String[] args) {
        //equals - will check whether the 2 String values are the same or not
        //== - will check the reference of the two Strings
        String name1 = "Daniel";
        String name2 = new String("Daniel");
        String name3 = "Richard";
        String name4 = "Daniel";

        System.out.println(name1 == name4); //T
        System.out.println(name1.equals(name2)); //T
        System.out.println(name4 == name1); //T
        System.out.println(name3.equals(name2)); //F
        System.out.println(name4.equals(name3)); //F
        System.out.println(name4.equals(name1)); //T
        System.out.println(name4 == name3); //F

    }
}
