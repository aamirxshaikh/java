package practice.basket_problem;

public class Solution {
    public static void main(String[] args) {
        int[] basket = {12, 1020, 101, 1, 1};
        int average = 0;
        int difference = 0;

        for (int i = 0; i < basket.length; i++) {
            average += basket[i] / basket.length;

            if (basket[i] > average) {
                difference += basket[i] - average;
            }
        }

        System.out.println(average);
        System.out.println(difference);
    }
}
