package com.files.file_class;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File f = new File("//home//shoaib//IdeaProjects//java//src//com//files//file_class//file.txt");

        if (f.exists()) {
            System.out.println("Yes");
            System.out.println(f.getName());
            System.out.println(f.getPath());
            System.out.println(f.getAbsolutePath());
            System.out.println(f.getTotalSpace());
            System.out.println(f.length());
            System.out.println(f.isFile());
            f.delete();
        } else {
            System.out.println("Nope");
        }
    }
}
