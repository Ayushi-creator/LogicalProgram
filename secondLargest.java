package LogicalProgram3;

import java.util.Scanner;

public class secondLargest {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n= scn.nextInt();
        int []arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        int max=Integer.MIN_VALUE;
        int secmax=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                secmax=max;
                max=arr[i];
            }
            else if(arr[i]>secmax && secmax!=max){
                secmax=arr[i];
            }

        }
        if (secmax == Integer.MIN_VALUE) {
            System.out.println("No distinct second largest element");
        } else {
            System.out.println("Second Largest Element: " + secmax);
        }

    }
}
