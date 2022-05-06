package day4;

import java.util.StringTokenizer;

public class StringTokenizerPractice {
    public static void main(String[] args) {
        StringTokenizer tokens1 = new StringTokenizer("Hello World");
        StringTokenizer tokens2 = new StringTokenizer("Hello World"," ");
        StringTokenizer tokens3 = new StringTokenizer("Hello World"," ",true);

        System.out.println(tokens1.toString()); //java.util.StringTokenizer@1b6d3586
        System.out.println(tokens2.toString()); //java.util.StringTokenizer@4554617c
        System.out.println(tokens3.toString()); //java.util.StringTokenizer@74a14482

        System.out.println("Tokens1 Strings (1 parameter): ");
        while(tokens1.hasMoreTokens()){
            System.out.println("\'"+tokens1.nextToken()+"\'");
        }
        System.out.println("\n---------------------------------");

        System.out.println("Tokens2 Strings (2 parameters): ");
        while(tokens2.hasMoreTokens()){
            System.out.println("\'"+tokens2.nextToken()+"\'");
        }
        System.out.println("\n---------------------------------");

        System.out.println("Tokens3 Strings (3 parameters): ");
        while(tokens3.hasMoreTokens()){
            System.out.println("\'"+tokens3.nextToken()+"\'");
        }
        System.out.println("\n----------------------------------");
    }
}
