package practice.pattern.star.reverse_hill;

public class Main {
    public static void main(String[] args) {
        int n = 5;

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
