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
            for(int j=1;j<=1+(i-2)*2;j++)
                System.out.print(" ");
            System.out.print("*");
            System.out.println();
        }
        for(int i=n-1;i>1;i--){
            for(int k=1;k<=n-i;k++)
                System.out.print(" ");
            System.out.print("*");
            for(int j=1;j<=1+(i-2)*2;j++)
                System.out.print(" ");
            System.out.print("*");
            System.out.println();
        }
        for(int i=1;i<n;i++)
            System.out.print(" ");
        System.out.print("*");
        System.out.println();
        sc.close();
    }
}
