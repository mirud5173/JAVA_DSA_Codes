/*
5        
4 4      
3 3 3    
2 2 2 2  
1 1 1 1 1 
*/
import java.util.Scanner;
public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n = sc.nextInt();
        for(int i=5;i>=1;i--){
            for(int j=0;j<n-i+1;j++)
                System.out.print(i+" ");
            System.out.println();
        }
        sc.close();
    }
}
