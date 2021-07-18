package com.get_set;

public class Main {
    public static void main(String[] args) {
        Test t1 = new Test();

        System.out.println("Before");

        t1.set();
        t1.get();

        System.out.println("After");

        t1.title = "new";
        t1.value = 100;

        t1.get();
    }

    static class Test {
        String title;
        int value;

        public void get () {
            System.out.println(this.title);
            System.out.println(this.value);
        }

        public void set () {
            this.title = "A title";
            this.value = 10;
        }
    }
}
