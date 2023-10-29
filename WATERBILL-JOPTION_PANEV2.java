import javax.swing.JOptionPane;
public class WaterbillV2Joption {
    // Ask if Residential or Commercial
    // Ask for pipe size
    // Ask for consumption rate
    public static void main(String[] args) {
        String[] classification = {"Residential", "Commercial"};
        String[] pipesize = {"1/2''", "3/4''", "1''", "1 1/2''", "2''", "3''", "4''"};
        String classi, pipe, consump;
        int consumption;
        double total = 0.0, commodity = 0.0, mincharge1 = 0.0, mincharge2 = 0.0;
        JOptionPane.showMessageDialog(null, "Hello, this program will calculate your water bill based on consumption and pipe size.");
        classi = (String) JOptionPane.showInputDialog(null, "Please pick your classification:","Classification", 
                                                    JOptionPane.QUESTION_MESSAGE, null, classification,classification[0]);
        pipe = (String) JOptionPane.showInputDialog(null, "Please pick what pipe size:","Pipe Size", 
                                                    JOptionPane.QUESTION_MESSAGE, null, pipesize, pipesize[0]);
        consump = JOptionPane.showInputDialog("Enter your consumption: ");
        consumption = Integer.parseInt(consump);
        if (pipe == pipesize[0])
        {
            mincharge1 = 172.5;
            mincharge2 = 345;
        }
        else if (pipe == pipesize[1])
        {
            mincharge1 = 276.0;
            mincharge2 = 552; 
        }
        else if (pipe == pipesize[2])
        {
            mincharge1 = 552.0;
            mincharge2 = 1104; 
        }
        else if (pipe == pipesize[3])
        {
            mincharge1 = 1380.0;      
            mincharge2 = 2760; 
        }
        else if (pipe == pipesize[4])
        {
            mincharge1 = 3450.0;  
            mincharge2 = 6900;
        }
        else if (pipe == pipesize[5])
        {
            mincharge1 = 6210.0;      
            mincharge2 = 12420; 
        }
        else if (pipe == pipesize[6])
        {
            mincharge1 = 12420.0;      
            mincharge2 = 24840;
        }
        if (classi == "Residential")
        {
            calclue1(consumption, commodity, mincharge1, total, classi);
        }
        else if (classi == "Commercial")
        {
            calclue2(consumption, total, commodity, mincharge2, classi);
        }
    }
    public static void printOut(double charge, double commod, double total, String msg)
    {
        JOptionPane.showMessageDialog(null, "You are in " +msg+"\nYour Minimum Charge is: "+charge+
                                    "\nYour Commodity Charge is: "+commod+"\nYour Total Bill is: "+total);
    }
    public static void calclue1(int consumption,double commodity, double mincharge1, double total, String msg)
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
    public static void calclue2(int consumption, double total, double commodity, double mincharge2, String msg)
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
