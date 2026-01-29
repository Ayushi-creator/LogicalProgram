package LogicalProgram3;

public class MissingNumberSum {
    public static void main(String[] args) {
        int[]arr={1,2,3,5};
        int n= arr.length+1;
        int expected=n*(n+1)/2;
        int actual=0;
        for(int num:arr){
            actual+=num;
        }
        int missing=expected-actual;
        System.out.println(missing);
    }
}
