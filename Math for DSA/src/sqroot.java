import java.util.Scanner;

public class sqroot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(SquareRoot(n));
    }
    //brute force
    static  double sqrt(int n, int p){
        int start = 0;
        int end =n;
        double answer = 0.0;
        while(start<=end){
            int mid = start + (end-start)/2;

            if(mid*mid == n){
                return mid;
            }else if(mid*mid>n){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        double incr = 0.1;
        for (int i = 0; i < p; i++) {
           while(answer*answer<=n){
               answer += incr;
           }
        }
        return answer;
    }
    static  double SquareRoot(int n){
        if(n<0) return 0.0;
        return Math.sqrt(n);
    }
}
