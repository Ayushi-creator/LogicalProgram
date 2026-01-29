package LogicalProgram3;

import java.util.Scanner;

public class Duplicates {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[]arr=new int[n];
        int count=0;
        boolean[]visited=new boolean[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }

        for(int i=0;i<n;i++){
            if(visited[i]){
                continue;
            }
            count=1;
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                    visited[j]=true;
                }
            }
            if(count>1){
                System.out.println(arr[i]);
            }
        }

    }
}
