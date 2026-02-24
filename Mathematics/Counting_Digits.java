import java.util.Scanner;
public class Counting_Digits{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int digits = 0;
        if(n==0)
            digits=1;
        else{
            while(n>0){
            n/=10;
            digits++;
            }
        }
        System.out.println("No.of digits: " + digits);
        sc.close();
    }
}
