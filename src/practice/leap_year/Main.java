package practice.leap_year;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter counter");

        int counter = sc.nextInt();

        for (int i = 0; i < counter; i ++) {
            System.out.println("Enter year");

            int year = sc.nextInt();

            if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
                System.out.println(year + " is a leap year");
            } else {
                System.out.println(year + " is not a leap year");
            }
        }
    }
}