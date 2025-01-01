import javax.print.attribute.standard.MediaSize;
import java.util.Scanner;

public class ConversionNumberSystem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the base");
        int base = in.nextInt();
        System.out.println("Enter the number");
        int num = in.nextInt();
//        System.out.println(DecimalConversion(base,num));
        System.out.println(OtherBases(base,num));
    }

    static  int DecimalConversion(int b, int n){
        int c =0;
        int ans=0;
        while(n>0){
            int rem = n%10;
           ans = ans+ (rem * (int)Math.pow(b,c++));
           n/=10;
        }
        return ans;
    }

    //convert to other bases from the Decimal
    static int OtherBases(int b,int n){
        int ans =0;
        while(n>0){
            int rem = n%b;
            ans = ans*10 + rem;
            n/=b;
        }
        //we neeed to write in the reverse order
       int answer = 0;
        while(ans>0){
            answer= answer*10 + ans%10;
            ans/=10;
        }
        return answer;
    }
}
