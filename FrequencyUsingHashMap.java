package LogicalProgram3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyUsingHashMap {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num:arr){
            if(map.containsKey(num)){
               map.put(num,map.get(num)+1);
            }
            else {
                map.put(num,1);
            }
        }
        System.out.println("frequency of element");
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            System.out.println(entry.getKey()+" occurs "+entry.getValue());
        }
    }
}
