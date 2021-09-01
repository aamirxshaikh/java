package practice.pattern.number.increasing_triangle_number;

public class Main {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0, count = 1; i < n; i++, count ++) {
            for (int j = 0; j <= i; j ++) {
                System.out.print(count + " ");
            }

            System.out.println();
        }
    }
}
