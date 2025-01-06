import java.util.Scanner;

public class apowerB {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the base: ");
        int base = in.nextInt();
        System.out.println("ENter the power: ");
        int power = in.nextInt();

        int ans =1;
        // take the power in the form of bits
        //if the bits is 1 multiply with the base
        // everytime multiply base with base
        while(power>0){
            if((power&1) ==1){
                ans*=base;
            }
            base*=base;
            power= power>>1;
        }
        System.out.println(ans);
    }
}
