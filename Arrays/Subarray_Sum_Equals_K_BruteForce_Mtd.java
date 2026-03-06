import java.util.Scanner;
public class Subarray_Sum_Equals_K_BruteForce_Mtd { //Returns number of subarrays whose sum equals K
    public static int subarraySum(int[] nums, int k) {
        int count = 0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            int sum = 0;
            for(int j=i;j<n;j++){
                sum+=nums[j];
                if(sum==k)
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int k = sc.nextInt();
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(subarraySum(arr,k));
        sc.close();
    }
}
