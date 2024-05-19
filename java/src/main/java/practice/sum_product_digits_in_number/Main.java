package practice.sum_product_digits_in_number;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");

        int number = sc.nextInt();

        int remainder = 0;
        int sum = 0;
        int product = 1;

        while (number != 0) {
            remainder = number % 10;

            number /= 10;

            sum += remainder;
            product *= remainder;
        }

        System.out.println(sum);
        System.out.println(product);
    }
}
