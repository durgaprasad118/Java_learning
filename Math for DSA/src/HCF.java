public class HCF {
    public static void main(String[] args) {
        int answer = Euclid(20,40);
        System.out.println(answer);
    }
    static int HCF(int a, int b){
        int answer = 1;
        for (int i = Math.min(a,b); i >=0; i--) {
           if(a%i==0 && b%i==0) {
               answer = i;
               break;
           }
        }
        return answer;
    }
    // gcd(a,b) = gcd(b%a,a)
    static int Euclid(int a,int b){
        if(a==0){
            return b;
        }
        return  Euclid(b%a,a);
    }
}
