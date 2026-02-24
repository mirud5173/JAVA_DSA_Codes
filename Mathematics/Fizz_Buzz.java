import java.util.Scanner;
public class Fizz_Buzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int n=1;n<=num;n++)
        {
            if(n%3==0 && n%5==0)
            System.out.println("FizzBuzz");
            else if(n%3==0)
                System.out.println("Fizz");
            else if(n%5==0)
                System.out.println("Buzz");
            else
                System.out.println(n);
        }
        sc.close();
    }
}
