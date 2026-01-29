package LogicalProgram3;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[]arr={3,2,7,3,6,5};
        int target=7;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i< arr.length;i++){
            int complement=target-arr[i];
            if(map.containsKey(complement)){
                System.out.println("pair found"+arr[i]+" "+complement);
            }
            map.put(arr[i],i );
        }
    }
}
