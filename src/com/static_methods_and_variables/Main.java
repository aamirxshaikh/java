package com.static_methods_and_variables;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();

        set(20);

        m.getStaticMember();
        m.getStaticMethod();
        m.getStaticMember();
    }

    static int i = 10;

    static void set (int setValue) {
        i = setValue;
    }

    void getStaticMember () {
        System.out.println(i);
    }

    void getStaticMethod () {
        set(30);
    }
}
