import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the tip calculator!");
        System.out.print("How many people are in your group? ");
        int numCustomer = scan.nextInt();
        System.out.print("What's the tip percentage? (0-100): ");
        int percentage = scan.nextInt();
        //use while loop to get each cost
        int dish = 0;
        while(dish != numCustomer ) {
            System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (-1) to end: ")
            dish++;
        }
        scan.nextLine();

    }
}
