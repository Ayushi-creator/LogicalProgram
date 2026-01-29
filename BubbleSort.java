package LogicalProgram3;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int[]arr={10,50,40,30,20};
        int n= arr.length;
        for(int i=0;i<n-1;i++){
            boolean swapped=false;
            for(int j=0;j<n-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }

            }
            if (!swapped) {
                break;
            }
        }
        System.out.println("Sorted Array:");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
