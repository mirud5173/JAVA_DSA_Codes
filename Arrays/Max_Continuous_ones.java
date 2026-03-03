import java.util.Scanner;
public class Max_Continuous_ones {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count_max = 0;
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1)
            count++;
            else
            count=0;
            if(count>count_max)
            count_max = count;
        }
        return count_max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        System.out.println(findMaxConsecutiveOnes(arr));
        sc.close();
    }
}
