package practice.fibonacci;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of series");

        int max = sc.nextInt();

        int prev = 0;
        int next = 1;

        for (int i = 1; i <= max; ++ i) {
            System.out.print(prev + " ");

            int sum = prev + next;
            prev = next;
            next = sum;
        }
    }
}
