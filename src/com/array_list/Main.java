package com.array_list;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<String>();
        ArrayList<Integer> nos = new ArrayList<Integer>();
        ArrayList<Character> chs = new ArrayList<Character>();
        ArrayList<Boolean> bool = new ArrayList<Boolean>();
        ArrayList<LocalDate> dates = new ArrayList<LocalDate>();

        items.add("item 1");
        items.add("item 2");
        items.add("item 3");

        nos.add(10);

        chs.add('A');
        chs.add('B');

        bool.add(true);

        dates.add(LocalDate.now());

        items.remove("item 3");

        System.out.println(items + "" + nos + "" + chs + "" + bool + "" + dates);
    }
}
