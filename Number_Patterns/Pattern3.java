/*
1  
0 1 
1 0 1 
0 1 0 1 
1 0 1 0 1 
*/
import java.util.Scanner;
public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n = sc.nextInt();
        int val;
        for(int i=0;i<n;i++){
            if(i%2==0)
                val=1;
            else
                val=0;
            for(int j=0;j<i+1;j++){
                System.out.print(val+" ");
                val = 1-val;
            }
            System.out.println();
        }
        sc.close();
    }
}
