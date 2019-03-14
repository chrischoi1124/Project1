import java.util.Scanner;

/**
 * Simple Pin number generator that takes user imput for the amount of pins generated.
 *
 * @author (Chris Choi)
 * @version (0.9)
 */
public class pinNumberGenerator
{   
    public static void main(String args [])
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to Pin Number Generator");
        
        boolean runLoop = true;
        
        while (runLoop == true)
        {
            System.out.println("Would you like to generate pin numbers?");
            
            String option = scanner.nextLine();
            option = option.toUpperCase();
            
            switch (option)
            {
                case "YES":
                
                    System.out.println("How many Pins would you like to generate?");
                    int pinNumbers = scanner.nextInt(); 
                    
                    String randomNumber = "";
                    String pin = "";
                    
                    for (int i = 0; i < pinNumbers; i++)
                    {
                        for (int j = 0; j < 4; j++)
                        {
                            randomNumber = (int) Math.floor(Math.random() * 9 + 1) + "";
                            
                            pin += randomNumber;
                        }
                        
                        System.out.println(pin);
                        pin = "";
                    }
                    
                case "NO":
                
                    System.out.println("Thank you for using Pin Generator");
                    
                    runLoop = false;
                    
                    break;
                    
                default:
                
                    System.out.println(option + " is not a vaild option.");
                    
                    break;
    
            }
        }
    }

}
