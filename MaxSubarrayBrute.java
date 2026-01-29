package LogicalProgram3;

public class MaxSubarrayBrute {
    public static void main(String[] args) {
        int[] arr = {2, -1, 3, -2, 4};

        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i< arr.length;i++){
            int sum=0;
            for(int j=i;j< arr.length;j++){
                sum+=arr[j];
                maxSum=Math.max(sum,maxSum);
            }
        }
        System.out.println("Maximum Subarray Sum: " + maxSum);
    }
}
