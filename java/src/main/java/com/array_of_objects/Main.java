package com.array_of_objects;

public class Main {
    public static void main(String[] args) {
        Solution s1 = new Solution("abc", 1);
        Solution s2 = new Solution("def", 2);
        Solution s3 = new Solution("ghi", 3);

        Solution[] objs = {s1, s2, s3};

        for (Solution obj : objs) {
            System.out.println(obj);
            System.out.println(obj.name);
            System.out.println(obj.number);

            System.out.println();
        }
    }

    static class Solution {
        String name;
        int number;

        Solution (String name, int number) {
            this.name = name;
            this.number = number;
        }
    }
}
