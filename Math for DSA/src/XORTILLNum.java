public class XORTILLNum {
    public static void main(String[] args) {

        System.out.println(XOR(7));
        System.out.println(XORAandB(3,9));
    }
    static  int XOR(int n){
        int ans =0;
        if(n%4==0){
           ans =n;
        }else if(n %4 ==1){
            ans = 1;
        }
        else if(n%4 ==2){
            ans = n+1;
        }
        else {
            ans = 0;
        }
       return  ans;
    }

    // xor between a and b
    static  int XORAandB(int a,int b ){
        int xorTillA = XOR(a-1);
        int lastXOR = XOR(b);
        return lastXOR^xorTillA;
    }
}
