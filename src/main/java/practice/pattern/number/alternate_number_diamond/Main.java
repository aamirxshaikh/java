package practice.pattern.number.alternate_number_diamond;

public class Main {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i; j < n; j ++) {
                System.out.print("  ");
            }

            for (int k = 0; k <= i; k ++) {
                if (i % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("2 ");
                }
            }

            for (int l = 1; l <= i; l ++) {
                if (i % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("2 ");
                }
            }

            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j ++) {
                System.out.print("  ");
            }

            for (int k = i; k < n; k ++) {
                if (i % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("2 ");
                }
            }

            for (int l = i; l < n - 1; l ++) {
                if (i % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("2 ");
                }
            }

            System.out.println();
        }
    }
}
