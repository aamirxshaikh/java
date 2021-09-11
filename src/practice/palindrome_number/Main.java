package practice.palindrome_number;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");

        int number = sc.nextInt();
        int x = number;
        int reverse = 0, remainder = 0;

        while (x != 0) {
            remainder = x % 10;

            reverse = reverse * 10 + remainder;

            x /= 10;
        }

        if (number == reverse) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}
