package tasks;
import java.util.Random;
import java.util.Scanner;
public class while_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Task Nr 1,Numbers from 0 to 100:");
        int i = 0;
        while (i<100){
            i++;
            System.out.print(" " + i );
        }
        System.out.println(" ");
        System.out.println("Task Nr 2,Numbers from A to B");
        System.out.print("Please enter number A > ");
        int a = sc.nextInt();
        System.out.print("Please enter number B > ");
        int b = sc.nextInt();
        if (a < b) {
            int j = (a-1);
            while(j<b){
            j++;
                System.out.print(" " + j);
            }
        } else
            System.out.print("A >B ");

                Random rand = new Random();
                int n = rand.nextInt(100);
                System.out.println("  " +n);
    }
}