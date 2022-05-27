import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CodingQCHelp {
    public static void main(String[] args) {
        //System.out.println(str+str.getClass());
        int num = 321345;
        String nums = Integer.toString(num);
        System.out.println(nums);
        String[] numArr = new String[nums.length()];
        ArrayList<Integer> intArr = new ArrayList<Integer>();
        int[] ints = new int[numArr.length];
        for(int i = 0;i< nums.length();i++){
            numArr[i]= String.valueOf(nums.charAt(i));
            ints[i]=Integer.parseInt(numArr[i]);
        }
        for(int j=0;j< numArr.length;j++){
            //intArr[j]=Integer.parseInt(numArr[j]);

        }
        Arrays.sort(ints);
        intArr.size();
        intArr.get(1);
        intArr.remove(intArr.get(1));
        for(int i : ints){
            System.out.println(i);
        }
        System.out.println();
        //Collections.sort(intArr,Collections.reverseOrder());
//        System.out.println(intArr);
//        int result=0;
//        for(Integer i : intArr){
//            result = 10*result+i;
//        }
    }
}
