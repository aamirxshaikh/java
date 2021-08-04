package practice.factorial_recursion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        int factorial = factorial(number);

        System.out.println(factorial);
    }

    static int factorial (int number) {
        if (number == 1) {
            return 1;
        }

        return number * factorial(number - 1);
    }
}
