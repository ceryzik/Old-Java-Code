//======================================================
// Class: IT151             Student: Chad Rydzik
//
// Assignment: Phase 3      DUE: June 10th, 2013
// Program: Product Input Chair Class
// Purpose: Recieves  Chair Information then
//      displays it back to User.
//======================================================
import java.text.DecimalFormat;
import java.util.Scanner;

public class MainProject {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        DecimalFormat df1 = new DecimalFormat("$#0.00"); // Price Format
        //---------------Variable Declerations------------------
        boolean valid;
        String validIn;
        String styleString, fabricString, colorString, woodString;
        double compAvgSales, compShipCharg;

System.out.println("- - - Welcome to Product Input- - -");
        do {
            styleString = recieveChairStyle();
            fabricString = recieveFabric();
            colorString = recieveColor();
            woodString = recieveWood();
            //Create an instance of Chair Class,
            //Passing the daata that is entered as arguments 
            // to the constructor.
            Chair chair = new Chair(styleString, fabricString, colorString, woodString);

            //Recieves the data from chair and displays it
            System.out.println("Your current Choices are:\n"
                    + "Style:\t\t" + chair.getStyleOfChair() + "\n"
                    + "Fabric Type:\t" + chair.getFabricType() + "\n"
                    + "Fabric Color:\t" + chair.getFabricColor() + "\n"
                    + "Wood Type:\t" + chair.getWoodType());
            System.out.println();
            System.out.print("Would you like to enter another Product?(yes or no) ");
           
            validIn = stdIn.next();
          
            if ("yes".equals(validIn)) //Allows for Multiple inputs
                valid = true;
             else 
                valid = false;
            
        } while(valid);

        compAvgSales = computeAverageSales(); //calls Average Sales Method
        if (compAvgSales > 200) {
            System.out.println("The Average Sales of " + df1.format(compAvgSales)
                    + "\nthis exceeds $200.00 which is a signifacant amount of revenue");
        } else {
            System.out.println("The Average Sales are: " + df1.format(compAvgSales));
        }

        compShipCharg = computeShippingCharges(); //calls Shipping Charges Method
        System.out.println("The Total Shipping Charges are: " + df1.format(compShipCharg));

    } //End Main Method

    /**
     *
     * @return User inputed Chair Style
     */
    public static String recieveChairStyle() {
        boolean inValid;
        String styleString = "";
        int inS;
        Scanner stdIn = new Scanner(System.in);

        do {
            inValid = false;
            System.out.print("These are our current Choices of Chairs:\n"
                    + "1) Rocker\n"
                    + "2) Recliner\n"
                    + "3) Anarondack\n"
                    + "4) Arm Chair\n"
                    + "Please Choose (1,2,3 or 4): ");
            inS = stdIn.nextInt();
            switch (inS) {
                case 1:
                    styleString = "Rocker";
                    break;
                case 2:
                    styleString = "Recliner";
                    break;
                case 3:
                    styleString = "Anarondack";
                    break;
                case 4:
                    styleString = "Arm Chair";
                    break;
                default:
                    System.out.println("Your Choice is Invalid!");
                    inValid = true;
                    break;
            }

        } while (inValid);
        return (styleString);
    }//end RecieveChairStyle

    /**
     *
     * @return User inputed Fabric Type
     */
    public static String recieveFabric() {
        boolean inValid;
        String fabricString = "";
        int inFT;
        Scanner stdIn = new Scanner(System.in);

        do {
            inValid = false;
            System.out.print("Here are the Fabrics we have Available:\n"
                    + "1) Suede\n"
                    + "2) Leather\n"
                    + "3) Micro Fiber\n"
                    + "4) Denim\n"
                    + "5) Felt\n"
                    + "6) None\n"
                    + "Please Choose a Number (1 through 6): ");
            inFT = stdIn.nextInt();
            switch (inFT) {
                case 1:
                    fabricString = "Suede";
                    break;
                case 2:
                    fabricString = "Leather";
                    break;
                case 3:
                    fabricString = "Micro Fiber";
                    break;
                case 4:
                    fabricString = "Denim";
                    break;
                case 5:
                    fabricString = "Felt";
                    break;
                case 6:
                    fabricString = "None";
                    break;
                default:
                    System.out.println("Your Choice is Invalid!");
                    inValid = true;
                    break;
            }

        } while (inValid);
        return (fabricString);
    }//end RecieveFabricType

    /**
     *
     * @return User inputed Color of Chair
     */
    public static String recieveColor() {
        boolean inValid;
        String colorString = "";
        int inC;
        Scanner stdIn = new Scanner(System.in);

        do {
            inValid = false;
            System.out.print("We Offer the Following Colors:\n"
                    + "1) Red\n"
                    + "2) Black\n"
                    + "3) Blue\n"
                    + "4) White\n"
                    + "5) Yellow\n"
                    + "6) None\n"
                    + "Please Choose a Number (1 through 6): ");
            inC = stdIn.nextInt();
            switch (inC) {
                case 1:
                    colorString = "Red";
                    break;
                case 2:
                    colorString = "Black";
                    break;
                case 3:
                    colorString = "Blue";
                    break;
                case 4:
                    colorString = "White";
                    break;
                case 5:
                    colorString = "Yellow";
                    break;
                case 6:
                    colorString = "None";
                    break;
                default:
                    System.out.println("Your Choice is Invalid!");
                    inValid = true;
                    break;
            }

        } while (inValid);
        return (colorString);
    }//end RecieveColor

    /**
     *
     * @return User inputed Wood Type
     */
    public static String recieveWood() {
        boolean inValid;
        String woodString = "";
        int inW;
        Scanner stdIn = new Scanner(System.in);

        do {
            inValid = false;
            System.out.print("Currently we have these Wood Types:\n"
                    + "1) Oak\n"
                    + "2) Ash\n"
                    + "3) Walnut\n"
                    + "4) Beech\n"
                    + "5) Cherry\n"
                    + "6) Pine\n"
                    + "7) Maple\n"
                    + "Please Choose a Number (1 through 7): ");
            inW = stdIn.nextInt();
            switch (inW) {
                case 1:
                    woodString = "Oak";
                    break;
                case 2:
                    woodString = "Ash";
                    break;
                case 3:
                    woodString = "Walnut";
                    break;
                case 4:
                    woodString = "Beech";
                    break;
                case 5:
                    woodString = "Cherry";
                    break;
                case 6:
                    woodString = "Pine";
                    break;
                case 7:
                    woodString = "Maple";
                    break;
                default:
                    System.out.println("Your Choice is Invalid!");
                    inValid = true;
                    break;
            }

        } while (inValid);
        return (woodString);
    }//end RecieveWood

    /**
     * Computes the Average Sales
     *
     * @return Average Sales
     */
    public static double computeAverageSales() {
        double avgSales;
        double salesIn;
        double total = 0;
        int cnt = 0;
        Scanner stdIn = new Scanner(System.in); //Variable stdIn

        System.out.println("===The Following will calculate your Average Sales===");
        System.out.println("\nPlease enter Your Sales. Only Positive"
                + "Sales will be counted\n"
                + "Enter -1 when you are finished.");// prompt
        do {
            System.out.print("Enter Sales: ");//Validation and input
            salesIn = stdIn.nextDouble();
            if (salesIn <= -1) {
            } else if (salesIn > -1) {
                total = total + salesIn;
                cnt++;
            }
        } while (salesIn != -1);
        //-----------------Output-----------------------
        System.out.println(); //Space seperator
        avgSales = total / cnt;
        return (avgSales);

    }//End Compute Average Sales

    /**
     * Computes Shipping Charges
     *
     * @return Total Shipping Charges
     */
    public static double computeShippingCharges() {
        double chargeOut;
        double chargeIn = 0;
        double total = 0;
        int cnt = 0;
        boolean inValid;

        Scanner stdIn = new Scanner(System.in); //Variable stdIn

        System.out.println("===The Following will calculate your Total Shipping Charges===");

        while (chargeIn != -1) {
            System.out.print("\nPlease enter the Shipping Charges(-1 to exit): ");
            chargeIn = stdIn.nextDouble();
            inValid = true;
            while (inValid) {//Validation and INput
                if (chargeIn > -1) {
                    total = total + chargeIn;
                    cnt++;
                    inValid = false;
                } else if (chargeIn < -1) {
                    System.out.print("Please Enter a Positive Number for Shipping Charges(-1 to Exit): ");
                    chargeIn = stdIn.nextDouble();
                    if (chargeIn > -1) {
                        total = total + chargeIn;
                        cnt++;
                        inValid = false;
                    } else {
                        inValid = true;
                    }
                } else {
                    inValid = false;
                }
            }
        }
        //-----------------Output-----------------------
        System.out.println(); //Space seperator
        chargeOut = total;
        return (chargeOut);

    }//End Compute Shipping Charges
}//End Class
