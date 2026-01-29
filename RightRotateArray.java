package LogicalProgram3;

import java.util.Scanner;

public class RightRotateArray {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int d=2;
        d=d%n;
        int[]temp=new int[d];
        for(int i=0;i<d;i++){
            temp[i]=arr[n-d+i];
        }

        for(int i=n-1;i>=d;i--){
            arr[i]=arr[i-d];
        }
        for(int i=0;i<d;i++){
            arr[i]=temp[i];
        }

        System.out.println("Right rotation");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
