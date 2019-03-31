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
    private static int preset;
    private static String encryption = "";
    
    //Encryption
    public static void encryptMessage(String msg)
    {
        preset1(msg);
        System.out.println(encryption);
    }
    
    //Decryption
    public void decryptMessage(String msg)
    {
        
    }
    
    //Main
    public static void main (String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Input message:");
        String msg = scanner.nextLine();
        
        encryptMessage(msg);
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
            
            if (message.compareTo("C") == 0)
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
        }
      /*
        msg = msg.replace("N", "F");
        msg = msg.replace("O", "G");
        msg = msg.replace("P", "H");
        msg = msg.replace("Q", "J");
        msg = msg.replace("R", "K");
        msg = msg.replace("S", "L");
        msg = msg.replace("T", "Z");
        msg = msg.replace("U", "X");
        msg = msg.replace("V", "C");
        msg = msg.replace("W", "V");
        msg = msg.replace("X", "B");
        msg = msg.replace("Y", "N");
        msg = msg.replace("Z", "M");
        
        message = msg;
        */
    }
}
