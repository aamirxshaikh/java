package practice.prime_numbers_between;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter start");
        int start = sc.nextInt();

        System.out.println("Enter end");
        int end = sc.nextInt();

        boolean isPrime = false;

        String found = "";

        for (int i = start; i <= end; i ++) {
            isPrime = check(i);

            if (isPrime) {
                found += i + " ";
            }
        }

        if (found.equals("")) {
            System.out.println("No prime numbers found");
        } else {
            System.out.println(found);
        }

    }

    static boolean check (int number) {
        for (int j = 2; j <= number / 2; j ++) {
            if (number % j == 0) {
                return false;
            }
        }

        return true;
    }
}
