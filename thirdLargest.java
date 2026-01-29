package LogicalProgram3;

public class thirdLargest {
    public static void main(String[] args) {
        int[]arr={10,20,30,40,50};
        int first=Integer.MIN_VALUE;
        int sec=Integer.MIN_VALUE;
        int third=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>first){
                third=sec;
                sec=first;
                first=arr[i];
            }
            else if(arr[i]>sec && arr[i]!=first){
                sec=first;
                first=arr[i];
            }
            else if(arr[i]>third && arr[i]!=first && arr[i]!=sec){
                third=arr[i];
            }
        }
        if(third==Integer.MIN_VALUE){
            System.out.println("No distinct third element");
        }
        else{
            System.out.println("third element: "+third);
        }
    }
}
