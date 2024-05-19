package com.two_dimensional_array_list;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> twoDArrayList = new ArrayList();

        ArrayList<String> str = new ArrayList();
        ArrayList<String> str2 = new ArrayList();
        ArrayList<String> str3 = new ArrayList();

        str.add("A");
        str.add("B");
        str.add("C");

        str2.add("D");
        str2.add("E");
        str2.add("F");

        str3.add("G");
        str3.add("H");
        str3.add("I");

        twoDArrayList.add(str);
        twoDArrayList.add(str2);
        twoDArrayList.add(str3);

        for (int i = 0; i < twoDArrayList.size(); i++) {
            for (int j = 0; j < twoDArrayList.get(i).size(); j ++) {
                System.out.print(twoDArrayList.get(i).get(j) + " ");
            }

            System.out.println();
        }
    }
}
