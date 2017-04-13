package tasks;
import java.util.Scanner;
public class Ugodajka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose your number");
        System.out.println("use only  >, < and = symbols ");
        int lower = 0;
        int higher = 100;
        char answer = '0';
        int number = 0;
        do{
            number = (higher+lower)/2;
            System.out.println("Your number is " +number+"  ?");
        answer = sc.next().charAt(0);;
        if(answer == '>'){
            lower = number;
        }
        if(answer == '<')
            {
                higher = number;
            }
    } while (answer!= '=');
        System.out.println("WIN " +number);
    }
}