package com.search_char;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char[] chs = {'a', 'b', 'c', 'd', 'a'};

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a letter you want to search");

        String str = sc.nextLine();
        char ch = str.charAt(0);

        int value = search(chs, ch);

        if (value == 1 || value == 0) {
            System.out.println("Found " + value + " time");
        } else {
            System.out.println("Found " + value + " times");
        }
    }

    public static int search (char[] chs, char ch) {
        int count = 0;

        for (char letter : chs) {
            if (letter == ch) {
                System.out.println(letter + " found");
                count ++;
            }
        }
        return count;
    }
}
