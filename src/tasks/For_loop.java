package tasks;

import java.util.Scanner;

public class For_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Task Nr 1,Numbers from 0 to 100:");
        for (int i = 0; i <= 100; i++) {
            System.out.print(" " + i + " ");
        }
        System.out.println(" ");
        System.out.println("Task Nr 2,Numbers from A to B");
        System.out.print("Please enter number A > ");
        int a = sc.nextInt();
        System.out.print("Please enter number B > ");
        int b = sc.nextInt();
        if (a < b) {
            for (int i = a; i <= b; i++) {
                System.out.print(" " + i + " ");
            }
        } else
            System.out.print("A >B ");
        System.out.println("  ");
        System.out.println("Task Nr 3,Even numbers from A to B");
        System.out.print("Please enter number A > ");
        int c = sc.nextInt();
        System.out.print("Please enter number B > ");
        int d = sc.nextInt();
        if (c < d) {
            for (int i = c; i <= d; i++) {
                if ((i % 2) == 0) {
                    System.out.print(" " + i + " ");
                }
            }
        } else
            System.out.print("A>B");
        System.out.println("Task Nr 4,Sum");
        System.out.print("Please enter number A > ");
        int e = sc.nextInt();
        System.out.print("Please enter number B > ");
        int f = sc.nextInt();
        int sum = 0;
        if (e < f) {
            for (int i = e; i <= f; i++) {
                sum = sum + i;
            }
            System.out.print(" sum is: " + sum);
            int sum2 = ((e + f) / 2) * (f - (e - 1));
            System.out.print("sum other way: " + sum2 + " ");
        } else
            System.out.print("A>B");
    }
}

