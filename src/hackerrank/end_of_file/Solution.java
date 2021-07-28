package hackerrank.end_of_file;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 0;

        while (sc.hasNext()) {
            i ++;
            System.out.println(i + " " + sc.nextLine());
        }

//        for (int i = 1; sc.hasNext(); i++) {
//            System.out.println(i + " " + sc.nextLine());
//        }
    }
}
