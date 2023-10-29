import java.util.Scanner;
public class WaterbillScanner
//get consumption as input and display total bill as output
//make an option for either Residential or Commercial classification
//use while loop for validation
{
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int classif, consumption, mincharge2 = 345;
        double total, commodity = 0.0, mincharge1 = 172.5;
        System.out.println("\n\tHello, this program will calculate your water bill based on consumption.");
        System.out.println("\t\t1. Residential\n\t\t2. Commercial");
        while (true)
        {
            System.out.print("\tPlease pick your classification: ");
            classif = scan.nextInt();
            if (classif == 1 || classif == 2)
            {
                break;
            }
            System.out.println("\tPlease pick a number from the choices\n");
        }
        while (true)
        {
            System.out.print("\tPlease enter your consumption: ");
            consumption = scan.nextInt();
            if (consumption > 0)
            {
                break;
            }
            System.out.println("\tPlease enter a number bigger than 0\n");
        }
        switch (classif)
        {
            case 1:
                if (consumption <= 10)
                {
                    total = commodity + mincharge1;
                    System.out.println("\n\tYou are in Residential");
                    System.out.println("\tYour Minimum Charge is: "+mincharge1);
                    System.out.println("\tYour Commodity Charge is: "+commodity);
                    System.out.println("\tYour Total Bill is: "+total+"\n\n");
                }
                else if (consumption > 10 && consumption <= 20)
                {
                    commodity = (18.90 * (consumption - 10)) + mincharge1;
                    total = commodity + mincharge1;
                    System.out.println("\n\tYou are in Residential");
                    System.out.println("\tYour Minimum Charge is: "+mincharge1);
                    System.out.println("\tYour Commodity Charge is: "+commodity);
                    System.out.println("\tYour Total Bill is: "+total+"\n\n");
                }
                else if (consumption > 20 && consumption <= 30)
                {
                    double tmp = (18.90 * 10);
                    commodity = (21.40 * (consumption - 20)) + mincharge1 + tmp;
                    total = commodity + mincharge1;
                    System.out.println("\n\tYou are in Residential");
                    System.out.println("\tYour Minimum Charge is: "+mincharge1);
                    System.out.println("\tYour Commodity Charge is: "+commodity);
                    System.out.println("\tYour Total Bill is: "+total+"\n\n");
                }
                else if (consumption > 30 && consumption <= 40)
                {
                    double tmp = (18.90 * 10) + (21.40 * 10);
                    commodity = (24.65 * (consumption - 30)) + mincharge1 + tmp;
                    total = commodity + mincharge1;
                    System.out.println("\n\tYou are in Residential");
                    System.out.println("\tYour Minimum Charge is: "+mincharge1);
                    System.out.println("\tYour Commodity Charge is: "+commodity);
                    System.out.println("\tYour Total Bill is: "+total+"\n\n");
                }
                else
                {
                    double tmp = (18.90 * 10) + (21.40 * 10) + (24.65 * 10);
                    commodity = (28.80 * (consumption - 40)) + mincharge1 + tmp;
                    total = commodity + mincharge1;
                    System.out.println("\n\tYou are in Residential");
                    System.out.println("\tYour Minimum Charge is: "+mincharge1);
                    System.out.println("\tYour Commodity Charge is: "+commodity);
                    System.out.println("\tYour Total Bill is: "+total+"\n\n");
                }
                break;
            case 2:
                if (consumption <= 10)
                {
                    total = commodity + mincharge2;
                    System.out.println("\n\tYou are in Commercial");
                    System.out.println("\tYour Minimum Charge is: "+mincharge2);
                    System.out.println("\tYour Commodity Charge is: "+commodity);
                    System.out.println("\tYour Total Bill is: "+total+"\n\n");
                }
                else if (consumption > 10 && consumption <= 20)
                {
                    commodity = (37.80 * (consumption - 10)) + mincharge2;
                    total = commodity + mincharge2;
                    System.out.println("\n\tYou are in Commercial");
                    System.out.println("\tYour Minimum Charge is: "+mincharge2);
                    System.out.println("\tYour Commodity Charge is: "+commodity);
                    System.out.println("\tYour Total Bill is: "+total+"\n\n");
                }
                else if (consumption > 20 && consumption <= 30)
                {
                    double tmp = (37.80 * 10);
                    commodity = (42.80 * (consumption - 20)) + mincharge2 + tmp;
                    total = commodity + mincharge2;
                    System.out.println("\n\tYou are in Commercial");
                    System.out.println("\tYour Minimum Charge is: "+mincharge2);
                    System.out.println("\tYour Commodity Charge is: "+commodity);
                    System.out.println("\tYour Total Bill is: "+total+"\n\n");
                }
                else if (consumption > 30 && consumption <= 40)
                {
                    double tmp = (37.80 * 10) + (42.80 * 10);
                    commodity = (49.30 * (consumption - 30)) + mincharge2 + tmp;
                    total = commodity + mincharge2;
                    System.out.println("\n\tYou are in Commercial");
                    System.out.println("\tYour Minimum Charge is: "+mincharge2);
                    System.out.println("\tYour Commodity Charge is: "+commodity);
                    System.out.println("\tYour Total Bill is: "+total+"\n\n");
                }
                else
                {
                    double tmp = (37.80 * 10) + (42.80 * 10) + (49.30 * 10);
                    commodity = (57.60 * (consumption - 40)) + mincharge2 + tmp;
                    total = commodity + mincharge2;
                    System.out.println("\n\tYou are in Commercial");
                    System.out.println("\tYour Minimum Charge is: "+mincharge2);
                    System.out.println("\tYour Commodity Charge is: "+commodity);
                    System.out.println("\tYour Total Bill is: "+total+"\n\n");
                }
                break;
        }
    }
}
