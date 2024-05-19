package com.random;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();

        for (int i = 0; i < 20; i ++) {
            int x = r.nextInt(20);

            System.out.println(x);
        }
    }
}
