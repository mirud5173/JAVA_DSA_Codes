import java.util.Scanner;
public class Max_Sum_SubArray_Naive { //O(n^2) time complexity
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int max_sum = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        for(int i=0;i<n;i++){
            sum = 0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                if(sum>max_sum)
                    max_sum = sum;
            }
        }
        System.out.println(max_sum);
        sc.close();
    }
}

