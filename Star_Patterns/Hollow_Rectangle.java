import java.util.Scanner;
public class Hollow_Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)
            System.out.print("*");
        System.out.println();
        for(int i=1;i<=n-2;i++){
            System.out.print("*");
            for(int k=1;k<=n-2;k++)
                System.out.print(" ");
            System.out.print("*");
            System.out.println();
        }
        for(int i=1;i<=n;i++)
            System.out.print("*");
        System.out.println();
        sc.close();
    }
}
