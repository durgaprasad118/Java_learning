public class Practice {
    //left shift a<<b => a*2^b
    //reight shift a>>b => a/2^b
    //a &1 gives the last bit the least significant one
    // number of digits = (int)(Math.log10(num)+1)
    //for any base (int)((Math.log(num)/Math.log(base)) +1
    // the number is pwer of 2 this is absed on the most significant bit (left most bit)
    // n &(n-1)==0
    // findingg the ith bit => number>>i (moves all th bits b i places. so the required bit will be last so we do n>>i &1)
    // i th count start from 0
    //setting the ith bit => number | (1<<i)
    // 1<<i is the bit mask  which has 1  in the bit settting place since we are using or operator if we have 0 it will be 1 if it is one it will be 1
    // resetting is  number&  ~(1<<i)
    //  thise above creares a bit mask opposite to that of the above bitmask
    //it has 0 in the setting palce and so it will set it to 0 irrespetive of 0 and 1
    public static void main(String[] args) {
        System.out.println((int)((Math.log(10)/Math.log(2))+1));
    }
    //given a decimal number converting it to base b

//        System.out.println(Integer.parseInt("100",2));
    static int DecimalToBaseb(int n, int b){
        int ans=0;
        int power =1;
        while(n>0){
            int rem = n%b;
            ans += rem*power;
            n/=b;
            power*=10;
        }
        return ans;
    }

    //convertint binary to decimal
    static int BinaryToDec(int n){
        int ans =0;
        int p=0;
        while(n>0){
            int rem = n%10;
            ans = ans+ (int)Math.pow(2,p)*rem;
            p++;
            n/=10;
        }
        return  ans;
    }
}
