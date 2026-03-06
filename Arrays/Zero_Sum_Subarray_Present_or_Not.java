import java.util.Scanner;
public class Zero_Sum_Subarray_Present_or_Not { //Returns true if atleast one subarray has sum equal to zero
    static boolean findsum(int arr[]) {
        int n = arr.length;
        for(int i=0;i<n;i++){
            int sum = 0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                if(sum==0)
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(findsum(arr));
        sc.close();
    }
}
