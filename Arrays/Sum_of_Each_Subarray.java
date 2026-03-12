import java.util.Scanner;
public class Sum_of_Each_Subarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        for(int i=0;i<n;i++){
            int sum = 0; 
            for(int j=i;j<n;j++){
                sum+=arr[j];
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println("-> "+sum);
            }
        }
        sc.close();
    }
}
