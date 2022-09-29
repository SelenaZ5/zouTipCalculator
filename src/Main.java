import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the tip calculator!");
        System.out.print("How many people are in your group? ");
        int numCustomer = scan.nextInt();
        System.out.print("What's the tip percentage? (0-100): ");
        int percentage = scan.nextInt();

        //use while loop to get each cost
        //note: 1 customer can ask for more than one dish
        int cost = 0;
        while(cost != -1 ){
            System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (-1) to end: ");
            double num = scan.nextDouble();
            DecimalFormat formatter = new DecimalFormat("#.##");
            String formattedNum = formatter.format(num);

        }

        System.out.println("-----------------------");
        System.out.println("Tip Percentage ");
        scan.nextLine();

    }
}
