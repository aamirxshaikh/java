package practice.pattern.star.diamond;

public class Main {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i; j < n; j ++) {
                System.out.print("  ");
            }

            for (int k = 0; k <= i; k ++) {
                System.out.print("* ");
            }

            for (int l = 1; l <= i; l ++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j ++) {
                System.out.print("  ");
            }

            for (int k = i; k < n; k ++) {
                System.out.print("* ");
            }

            for (int l = i; l < n - 1; l ++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
