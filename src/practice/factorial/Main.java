package practice.factorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number");

        int number = sc.nextInt();
        int fact = 1, i = 1;

        if (number <= 0) {
            System.out.println("Enter a valid number");
        } else {
            for (i = 1; i <= number; i ++) {
                fact *= i;
            }

            System.out.println("Factorial of " + number + " is " + fact);
        }
    }
}
