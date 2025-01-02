public class MajicNumber {
    public static void main(String[] args) {
//        System.out.println(MajicNumber(6));
        System.out.println(NumberDigits(6,2));
    }
    //take the bits and make it power of 5 while adding like doing in

    static int MajicNumber(int n){
        int ans=0;
        int cnt =1;
        while(n>0){
            int lastBit = n&1; // this is getting the last bit
            System.out.println("last bit is: "+lastBit);
            ans += (int)Math.pow(5,cnt++)*lastBit;
            n=n>>1; // this is removing the last bit
        }
       return ans;
    }

    //Number of digits in base b

    static  int NumberDigits(int n, int b){
//        int ans=0;
//        if(b==10){
//            ans =  (int)(Math.log10(n)+1);
//        }
//        // one way
//        if(b==2){
//            int count=0;
//            while(n>0){
//               n=n>>1;// removing the last bit till it's 0
//               count++;
//            }
//            ans = count;
//        }
        //other way
        int base2 = (int)(Math.log(n)/Math.log(b)) +1;
        return base2;
    }
}

