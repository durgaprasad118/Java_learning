import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int  n = in.nextInt();
        System.out.println(poww(2,-3));
    }
    static int DigiCount(int n){
        int digitCount =0;
        while(n>0){
            digitCount++;
            n/=10;
        }
        return digitCount;
    }
    static int DigitCountusingLog(int n){
       if(n<0){
           n= -n;
       }
       return (int) (Math.log10(n)+1);
    }
    static boolean isArmstrong(int N){
        int ans =0;
        int dup = N;
        while(N>0){
            int rem = N%10;
            ans += Math.pow(rem,3);
            N/=10;
        }
        return  dup == ans;
    }
    //printing all divisors
    static void printAll(int n){
        for (int i = 1; i <=Math.sqrt(n) ; i++) {
            if(n%i ==0){
                System.out.println(i);
                if(n/i !=i){
                    System.out.println(n/i);
                }
            }
        }
    }
    //prime number
    //brute force approach
static  void primeNumbers(int n){
        int count =0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count ==2){
            System.out.println("prime numebr");
        }else{
            System.out.println("Not a prime");
        }
}
static void betterPrime(int n){
    int count =1;
    for(int i=1;i<=Math.sqrt(n);i++){
        if(n%i==0){
            count++;
        }
    }
    if(count ==2){
        System.out.println("prime numebr");
    }else{
        System.out.println("Not a prime");
    }
}
//gcd
    static int GCD(int a,int b){
        int ans =1;
        for (int i = 1; i <= Math.min(a,b) ; i++) {
           if(a%i==0 && b%i==0){
               ans=i;
           }
        }
        return ans;
    }
    //optiimized
    static int gcdd(int a,int b){
        int gcd =1;
        for (int i = Math.min(a,b); i >=1 ; i--) {
            if(a%i==0 && b%i==0){
                gcd =i;
                break;
            }
        }
        return gcd;
    }
    //power exponentiation
    static int Exponent(int x, int n){
        return (int)Math.pow(x,n);
    }
    //power
    static int poww(int x,int n){
        int m = n;
        if(n<0) {
            n= n*(-1);
        }
        int answer =1;
        while (n>0){
            if(n%2==1){
                answer*=x;
                n--;
            }else{
                n= n/2;
                x= x*x;
            }
        }
        if(m<0){
            return 1/answer;
        }
        return answer;
    }
    //range of primes from L-R range
}