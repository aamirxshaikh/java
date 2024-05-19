package practice.fibonacci_recursion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter max series value");

        int max = sc.nextInt();

        for (int i = 0; i < max; i ++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    static int fibonacci (int i) {
        if (i == 0) {
            return 0;
        }

        if (i == 1 || i == 2) {
            return 1;
        }

        return fibonacci(i - 2) + fibonacci(i - 1);
    }
}
