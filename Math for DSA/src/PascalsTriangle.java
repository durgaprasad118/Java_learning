public class PascalsTriangle {
    public static void main(String[] args) {

        System.out.println(sumNthRow(2));
    }
    //sum of the nth row in pascals triangle
    static  int sumNthRow(int n){
        //we can use this
//        return  (int)Math.pow(2,n-1);
        //since a<<b = a* 2^b
        return 1<<(n-1);
    }
}
