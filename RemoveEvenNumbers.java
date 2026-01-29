package LogicalProgram3;

public class RemoveEvenNumbers {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int count = 0;
        for(int num:arr){
            if(num%2!=0){
                count++;
            }
        }
        int[]temp=new int[count];
        int index = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                temp[index++]=arr[i];
            }
        }
        for(int i=0;i<count;i++){
            System.out.println(temp[i]);
        }
    }
}
