import java.util.Scanner;
public class Hollow_Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n = sc.nextInt();
        for(int i=1;i<n;i++)
            System.out.print(" ");
        System.out.print("*");
        System.out.println();
        for(int i=2;i<=n;i++){
            for(int k=1;k<=n-i;k++)
                System.out.print(" ");
            System.out.print("*");
            for(int j=0;j<i-1;j++)
                System.out.print("  ");
            System.out.print("*");
            System.out.println();
        }
        for(int i=1;i<n;i++){
            for(int k=1;k<=i;k++)
                System.out.print(" ");
            for(int j=n-1;j>=i;j--)
                System.out.print("* ");
            System.out.println();
        }
        sc.close();
    }
}
