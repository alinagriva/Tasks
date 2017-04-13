package tasks;

import java.util.Random;
import java.util.Scanner;

public class Zagadajka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int number = rand.nextInt(100);
        System.out.println("  " + number);
        int user = 0;
        do {
            System.out.println("Please enter number between 1 and 100 > ");
            user = sc.nextInt();

            if (user < number) {
                System.out.println("Number is Bigger");
            }
            if (user > number)
                System.out.println("Number is Lower");
        }
        while (user != number);
        System.out.println("Correct number!" + user);
    }
}

