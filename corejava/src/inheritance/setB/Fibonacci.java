package inheritance.setB;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        int first = 0, second = 1;

        if (n <= 0) {
            System.out.println("Invalid input");
        } else if (n == 1) {
            System.out.println(first);
        } else {
            System.out.print(first + " " + second + " ");

            for (int i = 3; i <= n; i++) {
                int next = first + second;
                System.out.print(next + " ");
                first = second;
                second = next;
            }
        }

        sc.close();
    }
}
