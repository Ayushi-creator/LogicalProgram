package LogicalProgram3;

import java.util.Scanner;

public class FrequencyOfElements {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int count = 0;
        int n = scn.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scn.nextInt();
        }
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                continue;
            }
            count = 1;
            for (int j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
                    count++;
                    visited[j] = true;
                }
            }
            System.out.println(a[i] + " ocurs " + count + " times ");

        }
    }
}