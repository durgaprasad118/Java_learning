public class ThriceRepetaing {
    public static void main(String[] args) {
        //every number is repeating thrice only one number is repeating once return it.
        int [] arr = {1,2,3,3,3,2,2};
        System.out.println(SIngle(arr));
    }
    static int SIngle(int[] arr){
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            sum+=i;
        }
        return  sum%3;
    }
}
