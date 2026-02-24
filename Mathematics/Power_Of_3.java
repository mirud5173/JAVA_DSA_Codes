import java.util.Scanner;
public class Power_Of_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPow3 = true;
        if (n <= 0) {
            System.out.println("Not a power of 3");
        } else {
            while(n>1){
                if(n%3!=0){
                    isPow3 = false;
                    break;
                }
                n/=3;
            }
            if(isPow3)
                System.out.println("Power of 3");
            else
                System.out.println("Not a power of 3");
        }
        sc.close();
    }
}
