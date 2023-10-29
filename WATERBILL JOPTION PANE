import javax.swing.JOptionPane;
public class WaterbillJoption
//get consumption as input and display total bill as output
//make an option for either Residential or Commercial classification
//use while loop for validation
{
    public static void main(String[] args) {
        String classification, consumptionism, msg;
        int classif, consumption, mincharge2 = 345;
        double total, commodity = 0.0, mincharge1 = 172.5;
        JOptionPane.showMessageDialog(null,"Hello, this program will calculate your water bill based on consumption.");
        while (true)
        {
            classification = JOptionPane.showInputDialog(null, "1. Residential  2. Commercial\nPlease pick your classification: ");
            classif = Integer.parseInt(classification);
            if (classif == 1 || classif == 2)
            {
                break;
            }
            JOptionPane.showMessageDialog(null,"Please pick a number from the choices");
        }
        while (true)
        {
            consumptionism = JOptionPane.showInputDialog(null, "Please enter your consumption: ");
            consumption = Integer.parseInt(consumptionism);
            if (consumption > 0)
            {
                break;
            }
            JOptionPane.showMessageDialog(null,"Please enter a number bigger than 0");
        }
        switch (classif)
        {
            case 1:
                if (consumption <= 10)
                {
                    total = commodity + mincharge1;
                    msg = "You are in Residential\nYour Consumption is: "+consumption+"\nYour Minimum Charge is: "+mincharge1+ "\nYour Commodity Charge is: " +commodity+ "\nYour Total Bill is: "+total;
                    JOptionPane.showMessageDialog(null, msg);
                }
                else if (consumption > 10 && consumption <= 20)
                {
                    commodity = (18.90 * (consumption - 10)) + mincharge1;
                    total = commodity + mincharge1;
                    msg = "You are in Residential\nYour Consumption is: "+consumption+"\nYour Minimum Charge is: "+mincharge1+ "\nYour Commodity Charge is: " +commodity+ "\nYour Total Bill is: "+total;
                    JOptionPane.showMessageDialog(null, msg);
                }
                else if (consumption > 20 && consumption <= 30)
                {
                    double tmp = (18.90 * 10);
                    commodity = (21.40 * (consumption - 20)) + mincharge1 + tmp;
                    total = commodity + mincharge1;
                    msg = "You are in Residential\nYour Consumption is: "+consumption+"\nYour Minimum Charge is: "+mincharge1+ "\nYour Commodity Charge is: " +commodity+ "\nYour Total Bill is: "+total;
                    JOptionPane.showMessageDialog(null, msg);
                }
                else if (consumption > 30 && consumption <= 40)
                {
                    double tmp = (18.90 * 10) + (21.40 * 10);
                    commodity = (24.65 * (consumption - 30)) + mincharge1 + tmp;
                    total = commodity + mincharge1;
                    msg = "You are in Residential\nYour Consumption is: "+consumption+"\nYour Minimum Charge is: "+mincharge1+ "\nYour Commodity Charge is: " +commodity+ "\nYour Total Bill is: "+total;
                    JOptionPane.showMessageDialog(null, msg);
                }
                else
                {
                    double tmp = (18.90 * 10) + (21.40 * 10) + (24.65 * 10);
                    commodity = (28.80 * (consumption - 40)) + mincharge1 + tmp;
                    total = commodity + mincharge1;
                    msg = "You are in Residential\nYour Consumption is: "+consumption+"\nYour Minimum Charge is: "+mincharge1+ "\nYour Commodity Charge is: " +commodity+ "\nYour Total Bill is: "+total;
                    JOptionPane.showMessageDialog(null, msg);
                }
                break;
            case 2:
                if (consumption <= 10)
                {
                    total = commodity + mincharge2;
                    msg = "You are in Commercial\nYour Consumption is: "+consumption+"\nYour Minimum Charge is: "+mincharge2+ "\nYour Commodity Charge is: " +commodity+ "\nYour Total Bill is: "+total;
                    JOptionPane.showMessageDialog(null, msg);
                }
                else if (consumption > 10 && consumption <= 20)
                {
                    commodity = (37.80 * (consumption - 10)) + mincharge2;
                    total = commodity + mincharge2;
                    msg = "You are in Commercial\nYour Consumption is: "+consumption+"\nYour Minimum Charge is: "+mincharge2+ "\nYour Commodity Charge is: " +commodity+ "\nYour Total Bill is: "+total;
                    JOptionPane.showMessageDialog(null, msg);
                }
                else if (consumption > 20 && consumption <= 30)
                {
                    double tmp = (37.80 * 10);
                    commodity = (42.80 * (consumption - 20)) + mincharge2 + tmp;
                    total = commodity + mincharge2;
                    msg = "You are in Commercial\nYour Consumption is: "+consumption+"\nYour Minimum Charge is: "+mincharge2+ "\nYour Commodity Charge is: " +commodity+ "\nYour Total Bill is: "+total;
                    JOptionPane.showMessageDialog(null, msg);
                }
                else if (consumption > 30 && consumption <= 40)
                {
                    double tmp = (37.80 * 10) + (42.80 * 10);
                    commodity = (49.30 * (consumption - 30)) + mincharge2 + tmp;
                    total = commodity + mincharge2;
                    msg = "You are in Commercial\nYour Consumption is: "+consumption+"\nYour Minimum Charge is: "+mincharge2+ "\nYour Commodity Charge is: " +commodity+ "\nYour Total Bill is: "+total;
                    JOptionPane.showMessageDialog(null, msg);
                }
                else
                {
                    double tmp = (37.80 * 10) + (42.80 * 10) + (49.30 * 10);
                    commodity = (57.60 * (consumption - 40)) + mincharge2 + tmp;
                    total = commodity + mincharge2;
                    msg = "You are in Commercial\nYour Consumption is: "+consumption+"\nYour Minimum Charge is: "+mincharge2+ "\nYour Commodity Charge is: " +commodity+ "\nYour Total Bill is: "+total;
                    JOptionPane.showMessageDialog(null, msg);
                }
                break;
        }
    }
}
