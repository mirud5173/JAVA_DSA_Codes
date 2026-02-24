import java.util.Scanner;
public class Is_Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime = true;
        if(n<=1){
            System.out.println("Neither Prime nor Composite."); 
        }
        else{
            double sq_n = Math.sqrt(n);
            for(int i=2;i<=sq_n;i++){
                if(n%i==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime)
            System.out.println("Prime");
            else
            System.out.println("Not Prime");
        }
        sc.close();
    }
}
