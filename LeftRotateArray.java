package LogicalProgram3;

import java.util.Scanner;

public class LeftRotateArray {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int d=2;
        int n=scn.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        d=d%n;
        int[]temp=new int[d];
        for(int i=0;i<d;i++){
            temp[i]=arr[i];
        }
        for(int i=d;i<n;i++){
            arr[i-d]=arr[i];
        }
        for(int i=0;i<d;i++){
            arr[n-d+i]=temp[i];
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
