import java.util.*;
import java.io.*;
import java.lang.Math;

public class Main
{
    public static int countSubstring(String S)
    {

        //this is default OUTPUT. You can change it.
        int result = 0;
        int currCount=0;
        String lowerS = S.toLowerCase();

        //write your Logic here:
        for (int i = 0 ; i < S.length() ; i++){
            char c = lowerS.charAt(i);
            if(c == 'a' || c == 'e' ||c == 'i' ||c == 'o' ||c == 'u'){
                currCount++;
                if(currCount == 3){
                    currCount=0;
                    result++;
                }
            }
            else{
                if(currCount < 3 && currCount > 0){
                    if(i>2){
                        if(lowerS.charAt(i-1) == 'a' || lowerS.charAt(i-1) == 'e' ||lowerS.charAt(i-1) == 'i' ||lowerS.charAt(i-1) == 'o' ||lowerS.charAt(i-1) == 'u'){
                            if(lowerS.charAt(i-2) == 'a' || lowerS.charAt(i-2) == 'e' ||lowerS.charAt(i-2) == 'i' ||lowerS.charAt(i-2) == 'o' ||lowerS.charAt(i-2) == 'u'){
                                if(lowerS.charAt(i-3) == 'a' || lowerS.charAt(i-3) == 'e' ||lowerS.charAt(i-3) == 'i' ||lowerS.charAt(i-3) == 'o' ||lowerS.charAt(i-3) == 'u'){
                                    result++;
                                }
                            }
                        }
                    }
                }
                currCount=0;
                // result++;
            }
        }


        return result;
    }
    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);

        //INPUT [uncomment & modify if required]
        String S = sc.next();

        sc.close ();

        //OUTPUT [uncomment & modify if required]
        System.out.print(countSubstring(S));
    }
}
