import java.util.Scanner;

public class BitwiseQuestions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] arr = {1,2,2,4,4,6,6};
        System.out.println(singleElement(arr));
    }
    //even or odd using bitwise
    static boolean isEven(int n){
        return ((n&1)==0);
    }
    //all the elements in the array appear twice except one find it
    static int singleElement(int [] arr){
        int ans =0;
        for (int i = 0; i < arr.length; i++) {
           ans^=arr[i];
        }
        return ans;
    }
}
