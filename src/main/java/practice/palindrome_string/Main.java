package practice.palindrome_string;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String");

        String str = sc.nextLine();
        String reverse = "";

        char[] chs = str.toCharArray();

        for (int i = chs.length - 1; i >= 0; i --) {
            reverse += chs[i];
        }

        if (str.equals(reverse)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}
