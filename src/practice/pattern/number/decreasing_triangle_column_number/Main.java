package practice.pattern.number.decreasing_triangle_column_number;

public class Main {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n; i++) {
            int p = 0;

            for (int j = 0; j <= i; j ++) {
                System.out.print("  ");
            }

            for (int k = i; k < n; k ++) {
                p ++;

                System.out.print(p + " ");
            }

            System.out.println();
        }
    }
}
