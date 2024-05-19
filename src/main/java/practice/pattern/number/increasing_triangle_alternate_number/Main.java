package practice.pattern.number.increasing_triangle_alternate_number;

public class Main {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j ++) {
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
