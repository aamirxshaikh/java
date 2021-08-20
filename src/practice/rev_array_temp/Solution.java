package practice.rev_array_temp;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length");

        int length = sc.nextInt();

        int[] arr = new int[length];

        for (int i = 0; i < length; i ++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        int[] revArr = reverse(arr, length);

        System.out.println("After reversal");

        System.out.println(Arrays.toString(revArr));
    }

    static int[] reverse (int[] arr, int length) {
        int temp;
        int start = 0;
        int end = length - 1;

        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start ++;
            end --;
        }

        return arr;
    }
}
