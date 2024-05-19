package hackerrank.date_and_time;

import java.time.LocalDate;

public class Solution {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2017, 8, 14);

        System.out.println(date.getDayOfWeek().name());
    }
}
