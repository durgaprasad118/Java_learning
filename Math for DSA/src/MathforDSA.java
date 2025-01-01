import java.util.Scanner;

public class MathforDSA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
      boolean primes[] = new boolean[n+1];
      sieve(n,primes);
    }
    //check given number is prime number?
    static boolean isPrimes(int n){
       if(n<=1){
           return false;
       }
       int count =2;
       //take the counter as 2 the number and itself
        // strart from 2 to the sqr root of the number and if any factor is availble return false;
       while(count<=Math.sqrt(n)){
           if(n%count ==0){
               return false;
           }
           count++;
       }
       return true;
    }
    //print prime numbers less than n
    static void printPrimes(int n){
        for (int i = 2; i <n ; i++) {
           if(isPrimes(i)){
               System.out.println(i);
           }
        }
    }
    //printing primes less than a given number n.
    //SIeve of Erathosthenes
    //initially the primes[] is false
    // so initially all are primes
    // start from 2 and then make the multiples as true
    // the numbers with false in the array are primes
    static void sieve(int n,boolean [] primes){
        for (int i = 2; i<= Math.sqrt(n); i++) {
            if(!primes[i]){
                //removing from 2nd multiples
                for (int j = i*2; j <=n ; j+=i) {
                   primes[j]= true;
                }
            }
        }
        for (int i = 2; i < n; i++) {
           if(!primes[i]) {
               System.out.println(i);
           }
        }
    }
}
