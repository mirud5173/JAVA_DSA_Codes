import java.util.Scanner;
public class Subarray_Sum_Equals_K_PrefixSum_Mtd {
    public static int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int count = 0;
        int[] prefixSum = new int[n];
        prefixSum[0] = nums[0];
        for(int i=1;i<n;i++){
            prefixSum[i] = prefixSum[i-1] + nums[i];
        }
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int subarr_i_to_j_sum = 0;
                if(i==0)
                subarr_i_to_j_sum = prefixSum[j];
                else
                subarr_i_to_j_sum = prefixSum[j] - prefixSum[i-1];
                if(subarr_i_to_j_sum==k)
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
