package BrickBreaker;

import javax.swing.JFrame;

/**
 * A simple game where you use arrow keys to move the padle and prevent it from hitting the bottom.
 *
 * @author (Paul Choi)
 * @version (0.01)
 */
public class Main
{
   public static void main (String [] args)
   {
       JFrame obj = new JFrame();
       Gameplay gamePlay = new Gameplay();
       obj.setBounds(10, 10, 700, 600);
       obj.setTitle("Brick Breaker");
       obj.setResizable(false);
       obj.setVisible(true);
       obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       obj.add(gamePlay);
   }
}

