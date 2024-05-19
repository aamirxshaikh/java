package practice.substring_present;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String subStr = sc.nextLine();

        boolean contains = str.contains(subStr);

        if (contains) {
            System.out.println(subStr + " is a present in " + str);
        } else {
            System.out.println(subStr + " is not present in " + str);
        }
    }
}
