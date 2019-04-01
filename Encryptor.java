import java.util.Scanner;

/**
 * 
 *
 * @author Chris Choi
 * @version 3/29/19
 */
public class Encryptor
{
    //Global Variables
    private static int preset = 0;
    private static String userMessage = "";
    private static String encryption = "";
    
    //Encryption
    public static void encryptMessage(String msg)
    {
        if (preset == 1)
        {
            preset1(msg);
        }
        
        System.out.println(encryption);
    }
    
    //Decryption
    public void decryptMessage(String msg)
    {
        
    }
    
    //Main
    public static void main (String [] args)
    {
        //Variables
        boolean presetValid = false;
        
        //Creates new scanner.
        Scanner scanner = new Scanner(System.in);
        
        //While loop to check validity
        while (presetValid == false)
        {
            //Lets user choose what preset they want to use.
            System.out.println("Select Preset");
            System.out.println("1 - Preset 1");
            preset = scanner.nextInt();

            //Switch statement
            switch(preset)
            {
                case 1:
                    //Sends message to "encryptMessage".
                    encryptMessage(userMessage);
                    presetValid = true;
                    break;
                
                default:
                    System.out.println("That is an invalid preset.");
                    break;
            }
        }
        
        //Lets user input the message they want to encrypt or decrypt.
        System.out.println("Input message:");
        userMessage = scanner.nextLine();
        userMessage = scanner.nextLine();
    }
    
    //Preset 1
    public static void preset1(String msg)
    {
        //Makes the parameter msg all uppercase.
        msg = msg.toUpperCase();
        
        //Creates variable message.
        String message;
        
        //For loop to go through the entire message
        for (int i = 0; i < msg.length(); i++)
        {          
            //Cuts the message to one letter.
            message = msg.substring(i, i + 1); 
            
            //Determines whether the letter is A, B, C... Z and replaces it with Q, W, E... M.
            if (message.compareTo("A") == 0)
            {
                encryption = encryption + "Q";
            }
            
            if (message.compareTo("B") == 0)
            {
                encryption = encryption + "W";
            }
            
            if (message.compareTo("C") == 0)
            {
                encryption = encryption + "E";
            }
            
            if (message.compareTo("D") == 0)
            {
                encryption = encryption + "R";
            }
            
            if (message.compareTo("E") == 0)
            {
                encryption = encryption + "T";
            }
            
            if (message.compareTo("F") == 0)
            {
                encryption = encryption + "Y";
            }
            
            if (message.compareTo("G") == 0)
            {
                encryption = encryption + "U";
            }
            
            if (message.compareTo("H") == 0)
            {
                encryption = encryption + "I";
            }
            
            if (message.compareTo("I") == 0)
            {
                encryption = encryption + "O";
            }
            
            if (message.compareTo("J") == 0)
            {
                encryption = encryption + "P";
            }
            
            if (message.compareTo("K") == 0)
            {
                encryption = encryption + "A";
            }
            
            if (message.compareTo("L") == 0)
            {
                encryption = encryption + "S";
            }
            
            if (message.compareTo("M") == 0)
            {
                encryption = encryption + "D";
            }
            
            if (message.compareTo("N") == 0)
            {
                encryption = encryption + "F";
            }
            
            if (message.compareTo("O") == 0)
            {
                encryption = encryption + "G";
            }
            
            if (message.compareTo("P") == 0)
            {
                encryption = encryption + "H";
            }
            
            if (message.compareTo("Q") == 0)
            {
                encryption = encryption + "J";
            }
            
            if (message.compareTo("R") == 0)
            {
                encryption = encryption + "K";
            }
            
            if (message.compareTo("S") == 0)
            {
                encryption = encryption + "L";
            }
            
            if (message.compareTo("T") == 0)
            {
                encryption = encryption + "Z";
            }
            
            if (message.compareTo("U") == 0)
            {
                encryption = encryption + "X";
            }
            
            if (message.compareTo("V") == 0)
            {
                encryption = encryption + "C";
            }
            
            if (message.compareTo("W") == 0)
            {
                encryption = encryption + "V";
            }
            
            if (message.compareTo("X") == 0)
            {
                encryption = encryption + "B";
            }
            
            if (message.compareTo("Y") == 0)
            {
                encryption = encryption + "N";
            }
            
            if (message.compareTo("Z") == 0)
            {
                encryption = encryption + "M";
            }
            
            if (message.compareTo(" ") == 0)
            {
                encryption = encryption + " ";
            }
            
            if (message.compareTo(",") == 0)
            {
                encryption = encryption + ",";
            }
            
            if (message.compareTo(".") == 0)
            {
                encryption = encryption + ".";
            }
            
            if (message.compareTo("!") == 0)
            {
                encryption = encryption + "!";
            }
            
            if (message.compareTo("?") == 0)
            {
                encryption = encryption + "?";
            }
            
            if (message.compareTo("(") == 0)
            {
                encryption = encryption + "(";
            }
            
            if (message.compareTo(")") == 0)
            {
                encryption = encryption + ")";
            }
            
            if (message.compareTo("$") == 0)
            {
                encryption = encryption + "$";
            }
            
            if (message.compareTo("%") == 0)
            {
                encryption = encryption + "%";
            }
            
            if (message.compareTo("@") == 0)
            {
                encryption = encryption + "@";
            }
            
            if (message.compareTo("+") == 0)
            {
                encryption = encryption + "+";
            }
            
            if (message.compareTo("-") == 0)
            {
                encryption = encryption + "-";
            }
            
            if (message.compareTo("=") == 0)
            {
                encryption = encryption + "=";
            }
            
            if (message.compareTo("#") == 0)
            {
                encryption = encryption + "#";
            }
            
            if (message.compareTo("1") == 0)
            {
                encryption = encryption + "3";
            }
            
            if (message.compareTo("2") == 0)
            {
                encryption = encryption + "1";
            }
            
            if (message.compareTo("3") == 0)
            {
                encryption = encryption + "0";
            }
            
            if (message.compareTo("4") == 0)
            {
                encryption = encryption + "2";
            }
            
            if (message.compareTo("5") == 0)
            {
                encryption = encryption + "7";
            }
            
            if (message.compareTo("6") == 0)
            {
                encryption = encryption + "9";
            }
            
            if (message.compareTo("7") == 0)
            {
                encryption = encryption + "8";
            }
            
            if (message.compareTo("8") == 0)
            {
                encryption = encryption + "5";
            }
            
            if (message.compareTo("9") == 0)
            {
                encryption = encryption + "6";
            }
            
            if (message.compareTo("0") == 0)
            {
                encryption = encryption + "4";
            }
        }
    }
}
