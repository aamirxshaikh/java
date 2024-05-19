package com.files.file_reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("//home//shoaib//IdeaProjects//java//src//com//files//file_reader//read.txt");

            int read = fr.read();

            while (read != -1) {
//                System.out.print(read);
                System.out.print((char) read);

                read = fr.read();
            }

            fr.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
