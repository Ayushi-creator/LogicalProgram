package LogicalProgram3;

import java.util.Scanner;

public class PerfectNumberOptimized {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num <= 1) {
            System.out.println("Not a Perfect Number");
            return;
        }

        int sum = 1;


        for (int i = 2; i <= Math.sqrt(num); i++) {

            if (num % i == 0) {

                int pair = num / i;

                sum += i;


                if (pair != i) {
                    sum += pair;
                }
            }
        }

        if (sum == num)
            System.out.println(num + " is a Perfect Number");
        else
            System.out.println(num + " is NOT a Perfect Number");
    }
    }
