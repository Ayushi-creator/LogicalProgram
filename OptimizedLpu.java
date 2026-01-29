package LogicalProgram3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OptimizedLpu {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num:arr){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }
            else{
                map.put(num,1);
            }
        }
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey());
            }
        }

    }
}
