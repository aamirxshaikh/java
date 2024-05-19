package practice.first_repeated_character;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        char[] chs = str.toCharArray();

        char ch = getFirstRepeatingCharacter(chs);

        if (ch == 0) {
            System.out.println("No repeating character found");
        } else {
            System.out.println(ch);
        }
    }

    static char getFirstRepeatingCharacter (char[] chs) {
        HashSet<Character> hs = new HashSet<>();

        for (int i = 0; i < chs.length; i++) {
            char c = chs[i];

            if (hs.contains(c)) {
                return c;
            } else {
                hs.add(c);
            }
        }

        return 0;
    }
}
