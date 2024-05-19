package com.accessor_and_mutator;

public class Main {
    public static void main(String[] args) {
        Test t = new Test("Aamir");

        t.setName("ABC");
        System.out.println(t.getName());
    }

    static class Test {
        private String name;

        public void setName (String name) {
            this.name = name;
        }

        public String getName () {
            return  this.name;
        }

        Test (String name) {
            this.name = name;
        }
    }
}
