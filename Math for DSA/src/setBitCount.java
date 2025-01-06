public class setBitCount {
    public static void main(String[] args) {
        int n =45 ;
//        System.out.println(counter(n));
        System.out.println(BStrring(n));
    }
    static int counter(int n){
        int ans =0;
        while(n>0){
            if((n&1) ==1) ans++;
            n= n>>1;
        }
        return ans;
    }
    static  int BStrring(int n){
        String str = Integer.toBinaryString(n);
int count =0;
        for (int i = 0; i <str.length() ; i++) {
           if(str.charAt(i)=='1'){
               count++;
           }
        }
        return  count;
    }
}
