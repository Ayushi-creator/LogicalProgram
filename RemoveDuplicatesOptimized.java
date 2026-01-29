package LogicalProgram3;

import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicatesOptimized {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int[]arr={1,2,3,3,4,4,5};
        HashSet<Integer>set=new HashSet<>();
        for(int num:arr){
            set.add(num);
        }
        System.out.println(set);
    }
}
