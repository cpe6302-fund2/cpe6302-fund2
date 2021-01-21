// Student ID:
// First Name:
// Last Name:
//
// Team Members:
// 1. <student id> <first name> <last name>
// 2.
// 3.

import java.util.Scanner;

public class Problem3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int max = -1;

        while (N > 0) {
            int num = scanner.nextInt();
            if (num % 4 == 0 && num > max) {
                max = num;
            }
            N--;
        }
        System.out.println();
        System.out.println(max);

    }
}
