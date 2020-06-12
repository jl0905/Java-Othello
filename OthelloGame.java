// Jeffery Lin, Ethan Valentine
// Othello, Accel. CS Final Project

import java.io.*; 
import javax.swing.JFrame;
import java.awt.*;
//import java.awt.event.*;
  
public class OthelloGame 
{ 
   
   public static void gameInit()
   {
      JFrame window = new JFrame("Othello!");
      window.getContentPane().addMouseListener(new DiskClick());
      
      window.setSize(950, 840);
      window.setLocation(700, 150);
      window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      window.setVisible(true);
         
      OthelloBoard board = new OthelloBoard();
      window.add(board);
      
      }

   

   
   public static void main(String[] args)
   {
      gameInit();
   }
   
} 