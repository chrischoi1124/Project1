import java.util.Scanner;

/**
 * A program that will encrypt and decrypt a imputed message.
 *
 * @author Chris Choi
 * @version 3/29/2019
 */
public class Encryptor
{
    //Scanner is defined here.
    Scanner scanner = new Scanner(System.in);
    
    //Global variables
    public static int num;
    
    //Main
    public static void main (String args []){
        //Generates a random number between 10 into int "num".
        num = (int)(Math.random() * 10) + 1;
        
        //Prints line with the randomly generated number from int "num".
        System.out.println(num);
    }
    
    //Encrypter
    public String encryptor (String msg){
        
        //Currently returns null because it is not complete.
        return null;
    }
}
