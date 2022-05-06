package day3;

/**
 * Print the character at the 12th index.
 * Check whether the String contains the word “is”.
 * Add the string “and killed it” to the existing string.
 * Check whether the String ends with the word “dogs”.
 * Check whether the String is equal to “The quick brown Fox jumps over the lazy Dog”.
 * Check whether the String is equal to “THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG”.
 * Find the length of the String.
 * Check whether the String matches to “The quick brown Fox jumps over the lazy Dog”.
 * Replace the word “The” with the word “A”.
 * Split the above string into two such that two animal names do not come together.
 * Print the animal names alone separately from the above string.
 * Print the above string in completely lower case.
 * Print the above string in completely upper case.
 * Find the index position of the character “a”.
 * Find the last index position of the character “e”.
 */
public class Exercise1 {
    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog";
        //Print the character at the 12th index.
        System.out.println("Character at index 12: "+sentence.charAt(12)+"\n--------------------------------");

        //Check whether the String contains the word “is”.
        System.out.println("Does the String contain \'is\'? "+sentence.contains("is")+"\n--------------------------------");

        //Add the string “and killed it” to the existing string.
        sentence = sentence.concat(" and killed it");
        System.out.println("String concatenation: "+sentence+"\n--------------------------------");

        //Check whether the String ends with the word “dogs”.
        System.out.println("Does String end with \'dogs\'? "+sentence.endsWith("dogs")+"\n--------------------------------");

        //Check whether the String is equal to “The quick brown Fox jumps over the lazy Dog”.
        System.out.println("String equals \'The quick brown Fox jumps over the lazy Dog\'? "+sentence.equals("The quick brown Fox jumps over the lazy Dog")+"\n--------------------------------");

        //Check whether the String is equal to “THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG”.
        System.out.println("String equals \'THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG\'? "+sentence.equals("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG")+"\n--------------------------------");

        //Find the length of the String.
        System.out.println("String length: "+sentence.length()+"\n--------------------------------");

        //Check whether the String matches to “The quick brown Fox jumps over the lazy Dog”.
        System.out.println("String equals \'The quick brown Fox jumps over the lazy Dog\'? "+sentence.equals("The quick brown Fox jumps over the lazy Dog")+"\n--------------------------------");

        //Replace the word “The” with the word “A”.
        sentence = sentence.replace("The","A");
        System.out.println("Replace \'The\' with \'A\': "+sentence+"\n--------------------------------");

        //Split the above string into two such that two animal names do not come together.
        String[] stringArray = sentence.split("j");
        System.out.println("Split string:");
        int i=1;
        for(String str : stringArray){
            System.out.println("String "+i+": "+str);
        }
        System.out.println("\n--------------------------------");

        //Print the animal names alone separately from the above string.
        System.out.println("First animal: "+sentence.substring(14,17));
        System.out.println("Second animal: "+sentence.substring(38,41)+"\n--------------------------------");

        //Print the above string in completely lower case.
        System.out.println("all lower case string: "+sentence.toLowerCase()+"\n--------------------------------");

        //Print the above string in completely upper case.
        System.out.println("ALL UPPER CASE STRING: "+sentence.toUpperCase()+"\n--------------------------------");

        //Find the index position of the character “a”.
        System.out.println("Index of character \'a\': "+sentence.indexOf('a')+"\n--------------------------------");

        //Find the last index position of the character “e”.
        System.out.println("Last index of character \'e\': "+sentence.lastIndexOf('e')+"\n--------------------------------");

    }
}
