import java.util.Scanner;
public class WaterbillV2 {
    // Ask if Residential or Commercial
    // Ask for pipe size
    // Ask for consumption rate
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int classif, pipe, consumption;
        double total = 0.0, commodity = 0.0, mincharge1 = 0.0, mincharge2 = 0.0;
        String message = "";
        System.out.println("\n\tHello, this program will calculate your water bill based on consumption and pipe size.");
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
        System.out.println("\t\t1. 1/2''\n\t\t2. 3/4''\n\t\t3. 1''\n\t\t4. 1 1/2''\n\t\t" + "5. 2''\n\t\t6. 3''\n\t\t7. 4''");
        while (true)
        {
            System.out.print("\tPlease pick what pipe size: ");
            pipe = scan.nextInt();
            if (pipe > 0 && pipe < 8)
            {
                break;
            }
            System.out.println("\tPlease only enter a number from the choices above\n");
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
        switch (pipe)
                {
                    case 1:
                        mincharge1 = 172.5;
                        mincharge2 = 345;
                        break;
                    case 2:
                        mincharge1 = 276.0;
                        mincharge2 = 552;                    
                        break;
                    case 3:
                        mincharge1 = 552.0;
                        mincharge2 = 1104;                   
                        break;
                    case 4:
                        mincharge1 = 1380.0;      
                        mincharge2 = 2760;             
                        break;
                    case 5:
                        mincharge1 = 3450.0;  
                        mincharge2 = 6900;                   
                        break;
                    case 6:
                        mincharge1 = 6210.0;      
                        mincharge2 = 12420;              
                        break;
                     case 7:
                        mincharge1 = 12420.0;      
                        mincharge2 = 24840;                
                        break;
                }
        switch (classif)
        {
            case 1:
                message = "Residential";
                calcue1(consumption, commodity, mincharge1, total, message);
                break;
            case 2:
                message = "Commercial";
                calcue2(consumption, total, commodity, mincharge2, message);
                break;
        }
    }
    static void printOut(double charge, double commod, double total, String msg)
    {
        System.out.println("\n\tYou are in " + msg);
        System.out.println("\tYour Minimum Charge is: "+charge);
        System.out.println("\tYour Commodity Charge is: "+commod);
        System.out.println("\tYour Total Bill is: "+total+"\n\n");
    }
    static void calcue1(int consumption,double commodity, double mincharge1, double total, String msg)
    {
        if (consumption <= 10)
            {
                commodity = 0;
            }
        else if (consumption > 10 && consumption <= 20)
            {
                commodity = (18.90 * (consumption - 10));
            }
        else if (consumption > 20 && consumption <= 30)
            {
                double tmp = (18.90 * 10);
                commodity = (21.40 * (consumption - 20)) + tmp;
            }
        else if (consumption > 30 && consumption <= 40)
            {
                double tmp = (18.90 * 10) + (21.40 * 10);
                commodity = (24.65 * (consumption - 30)) + tmp;
            }
        else
            {
                double tmp = (18.90 * 10) + (21.40 * 10) + (24.65 * 10);
                commodity = (28.80 * (consumption - 40)) + tmp;
            }
        total = commodity + mincharge1;
        printOut(mincharge1,commodity,total,msg);
    }
    static void calcue2(int consumption, double total, double commodity, double mincharge2, String msg)
    {
        if (consumption <= 10)
            {
                commodity = 0;
            }
        else if (consumption > 10 && consumption <= 20)
            {
                commodity = (37.80 * (consumption - 10));
            }
        else if (consumption > 20 && consumption <= 30)
            {
                double tmp = (37.80 * 10);
                commodity = (42.80 * (consumption - 20)) + tmp;
            }
        else if (consumption > 30 && consumption <= 40)
            {
                double tmp = (37.80 * 10) + (42.80 * 10);
                commodity = (49.30 * (consumption - 30)) + tmp;
            }
        else
            {
                double tmp = (37.80 * 10) + (42.80 * 10) + (49.30 * 10);
                commodity = (57.60 * (consumption - 40)) + tmp;
            }
        total = commodity + mincharge2;
        printOut(mincharge2,commodity,total,msg);
    }
}
