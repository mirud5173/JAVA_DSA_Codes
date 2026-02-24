import java.util.*;
public class Reverse_A_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int rev = 0;
        int digits = 0;
        while(temp>0){
            temp/=10;
            digits++;
        }
        for(int i=digits-1;i>=0;i--){
            temp = n%10;
            rev+=temp*Math.pow(10,i);
            n/=10;
        }
        System.out.println(rev);
        sc.close();
    }
}
