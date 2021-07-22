package com.two_dimensional_arrays;

public class Main {
    public static void main(String[] args) {
        int[][] twoDInt = {{1, 2, 3}, {4, 5, 6}};
        String[][] twoDString = {{"Hi"}, {"Hello"}};
        boolean[][] twoDBoolean = {{true, false, true}, {false, false}};

        System.out.println(twoDInt[0][2]);
        System.out.println(twoDString[1][0]);
        System.out.println(twoDBoolean[1][1]);

        for (int outer = 0; outer < 4; outer ++) {
            System.out.println("Outer index : " + outer);

            for (int inner = 0; inner < 5; inner ++) {
                System.out.println("Inner index : " + inner);
            }
        }
    }
}
