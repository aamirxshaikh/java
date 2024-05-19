package com.files.file_writer;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("//home//shoaib//IdeaProjects//java//src//com//files//file_writer//empty.txt");

            fw.write("Something");

            fw.append("\nAppended");

            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
