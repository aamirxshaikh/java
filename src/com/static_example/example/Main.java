package com.static_example.example1;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();

        set(20);

        m.getStaticMember();
        m.setStaticMethod();
        m.getStaticMember();

        Solution s = new Solution();
        Solution s2 = new Solution();
        Solution s3 = new Solution();

        System.out.println(Solution.value);
        Solution.displayValue();
    }

    static int i = 10;

    static void set (int setValue) {
        i = setValue;
    }

    void getStaticMember () {
        System.out.println(i);
    }

    void setStaticMethod () {
        set(30);
    }

    static class Solution {
        static int value;

        Solution () {
            value ++;
        }

        static void displayValue () {
            System.out.println("Value is " + value);
        }
    }
}
