package LogicalProgram3;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int[]arr={1,2,3,3,2,4,5};
        int n=arr.length;
        int[]temp=new int[n];
        int j=0;
     for(int i=0;i<n;i++){
         boolean isDuplicate=false;
         for(int k=0;k<j;k++){
             if(arr[i]==temp[k]) {
                 isDuplicate = true;
                 break;
             }
         }
         if(!isDuplicate){
             temp[j++]=arr[i];
         }
     }
     for(int i=0;i<j;i++){
         System.out.println(temp[i]);
     }

    }
}
