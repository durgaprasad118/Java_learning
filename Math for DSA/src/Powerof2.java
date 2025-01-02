import java.util.Scanner;

public class Powerof2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in) ;
        System.out.println("Enter the number: ");
        int n = in.nextInt();
        //checking if it is a power of 2
        System.out.println(isPower(n));
    }

    static boolean isPower(int n){
        return  ((n & (n-1)) ==0);
    }
    static  boolean isPowerof2(int n){
        int count =0;
        while (n>0){
            int last = n&1;
            if(last ==1) count++;
            n=n>>1;
        }
        return  count ==1;
    }

}
