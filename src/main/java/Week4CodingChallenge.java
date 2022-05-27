import java.util.Arrays;

public class Week4CodingChallenge {
    public static void main(String[] args) {
//        String concat = "";
//        int[] arr = new int[]{90 ,46, 16, 91, 62, 20};
//        for (int i = 0 ; i < arr.length ; i++){
//            concat = concat + Integer.toString(arr[i]);
//        }
//        long total = Long.valueOf(concat);
//        System.out.println(total+1);
        int K = 3;
        int[] A = new int[]{2,13,8};
        Arrays.sort(A);
        for(int i = 0 ; i < A.length ; i++){
            System.out.println(A[i]);
        }
        System.out.println(A[A.length-1]);
    }
}
