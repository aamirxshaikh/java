package hackerrank.series;

import java.util.Scanner;

public class Main {
    public static void main(String []argh) {
        Scanner in = new Scanner(System.in);

        System.out.println("Queries :");
        int t=in.nextInt();

        for(int i=0; i<t; i++){
            System.out.println("Enter a");
            int a = in.nextInt();
            System.out.println("Enter b");

            int b = in.nextInt();
            System.out.println("Enter c");

            int n = in.nextInt();

            // (a + 2 ^ 0 * b) + (a + 2 ^ 1 * b) + (a + 2 ^ 2 * b)

            int x = a;

            for (int j = 0; j < n; j ++) {
                x += (int) Math.pow(2, j) * b;

                System.out.print(" " + x);
            }

            System.out.println("");
        }

        System.out.println("Finished");

        in.close();
    }
}
