package practice.remove_white_spaces;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine().replaceAll("\\s", "");

        System.out.println(str);
    }
}
