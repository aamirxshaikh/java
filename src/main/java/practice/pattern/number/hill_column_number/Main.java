package practice.pattern.number.hill_column_number;

public class Main {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j ++) {
                System.out.print("  ");
            }

            int p = 0;

            for (int k = 0; k <= i; k ++) {
                p ++;

                System.out.print(p + " ");
            }

            for (int l = 1; l <= i; l ++) {
                p ++;

                System.out.print(p + " ");
            }

            System.out.println();
        }
    }
}
