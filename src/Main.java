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
        int cost = 0;
        double dish = 0;
            while(cost != -1 ){

                System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (-1) to end: ");
                double num = scan.nextDouble();
                DecimalFormat formatter = new DecimalFormat("#.##");
                String formattedNum = formatter.format(num);
                System.out.println(formattedNum);
                dish += num; // add dish cost to find total as the loop runs
                if (num == -1){
                    cost--;
            }
        }
        dish++; // retreive price subtracted by -1

        DecimalFormat formatter = new DecimalFormat("#.##");

        //calculation variables:
        double totalTip = dish* (percentage * 0.01); // turn percent into decimal

        double totalBill = totalTip + dish;
        //per person cost:
        double withoutTip = dish / numCustomer;
        double withTip = (dish * (percentage *0.01) / 6);
        double totalPerPerson = totalBill / numCustomer;

        // print bill info:
        System.out.println("-----------------------");
        System.out.println("Total Bill Before Tip:$" + dish);
        System.out.println("Tip Percentage: " +percentage + "%");
        System.out.print("Total Tip:$");
        String formattedNum = formatter.format(totalTip);
        System.out.println(formattedNum);
        System.out.print("Total Bill With TIp:$");
        String formattedNum1 = formatter.format(totalBill);
        System.out.println(formattedNum1);
        System.out.print("Per Person Cost Before Tip:$");
        String formattedNum2 = formatter.format(withoutTip);
        System.out.println(formattedNum2);
        System.out.print("Tip Per Person:$" );
        String formattedNum3 = formatter.format(withTip);
        System.out.println(formattedNum3);
        System.out.print("Total Cost Per Person:$");
        String formattedNum4 = formatter.format(totalPerPerson);
        System.out.println(formattedNum4);

        scan.close();

    }
}
