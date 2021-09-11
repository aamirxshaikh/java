package practice.get_random_element_array;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt();

        int[] arr = new int[length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int random = getRandom(arr);

        System.out.println(arr[random]);
    }

    static int getRandom (int[] arr) {
        Random r = new Random();

        return r.nextInt(arr.length + 1);
    }
}
