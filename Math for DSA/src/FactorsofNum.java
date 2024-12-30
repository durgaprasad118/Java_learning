import java.util.ArrayList;
import java.util.Scanner;

public class FactorsofNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        printFactorss(n);
    }
    static void printFactors(int n){
        for (int i = 1; i <=Math.sqrt(n); i++) {
           if(n%i==0){
                System.out.println(i);
                if(n/i !=i){
                    System.out.println(n/i);
                }
            }

        }
    }

    static void printFactorss(int n) {
        ArrayList<Integer> factors = new ArrayList<>();

        // Loop from 1 to sqrt(n) to find factors
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                factors.add(i); // Add the smaller factor to the list
                if (n / i != i) {
                    // Print the larger factor later after the loop
                    factors.add(n / i);
                }
            }
        }

        // Print factors in ascending order
        for (int factor : factors) {
            System.out.println(factor);
        }
    }
}
