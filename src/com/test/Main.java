package com.test;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();

            String inputString = String.valueOf(x);

            if (inputString.length() == 2) {
                System.out.println(s1 + " " + "0" + x);
            } else {
                System.out.println(s1 + " " + x);
            }
        }
        System.out.println("================================");

    }
}



