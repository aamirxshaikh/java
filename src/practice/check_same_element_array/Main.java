package practice.check_same_element_array;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt();

        int[] arr = new int[length];

        int number;

        boolean isSame = false;

        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }

        number = arr[0];

        for (int i = 0; i < length; i++) {
            if (number == arr[i]) {
                isSame = true;
            } else {
                isSame = false;
            }
        }

        if (isSame) {
            System.out.println("All elements are same");
        } else {
            System.out.println("Not same");
        }
    }
}
