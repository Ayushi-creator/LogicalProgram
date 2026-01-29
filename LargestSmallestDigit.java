package LogicalProgram3;

import java.util.Scanner;

public class LargestSmallestDigit {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        n=Math.abs(n);
        int largest = 0;
        int smallest = 9;
        while (n > 0) {
            int digit = n % 10;
            if (digit>largest) {
                largest=digit;
            }
            if(digit<smallest){
                smallest=digit;
            }
            n=n/10;

        }
        System.out.println("Largest element"+largest);
        System.out.println("Smallest element"+smallest);

    }
}
