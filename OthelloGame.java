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
      
      boolean check1 = true;
      boolean check2 = true;
      boolean check3 = true;
      boolean check4 = true;
      boolean check5 = true;
      boolean check6 = true;
      boolean check7 = true;
      boolean check8 = true;
      
      while (DiskClick.turn < 60)
      {
         if (DiskClick.clickstat == 1)
         {
            OthelloDisk disk = new OthelloDisk();
            window.add(disk);
            
            DiskClick.clickstat = 0;
            
            Color color = getPixelColor(DiskClick.clickx+1, DiskClick.clicky+1);
            for (int i=0;i<8;i++)
            {
               if (check1 == true)
               {
                  Color color1 = getPixelColor(DiskClick.clickx+100*i+40, DiskClick.clicky+40);
                  check1 = false;
               }
               if (color != color1)
               {
                  for (int ii = i;ii<2*i;ii++)
                  {
                     DiskClick.color = color;
                     window.add(disk);
                  }
               }
               if (check5 == true)
               {
                  Color color5 = getPixelColor(DiskClick.clickx+40, DiskClick.clicky+100*i+40);
                  check5 = false;
               }
               if (color != color5)
               {
                  for (int ii = i;ii<2*i;ii++)
                  {
                     DiskClick.color = color;
                     window.add(disk);
                  }
               }
               if (check2 == true)
               {
                  Color color2 = getPixelColor(DiskClick.clickx+100*i+40, DiskClick.clicky+100*i+40);
                  check2 = false;
               }
               if (color != color2)
               {
                  for (int ii = i;ii<2*i;ii++)
                  {
                     DiskClick.color = color;
                     window.add(disk);
                  }
               }
               if (check3 == true)
               {
                  Color color3 = getPixelColor(DiskClick.clickx-100*i-40, DiskClick.clicky-100*i-40);
                  check3 = false;
               }
               if (color != color3)
               {
                  for (int ii = i;ii<2*i;ii++)
                  {
                     DiskClick.color = color;
                     window.add(disk);
                  }
               }
               if (check4 == true)
               {
                  Color color4 = getPixelColor(DiskClick.clickx+40, DiskClick.clicky-100*i-40);
                  check4 = false;
               }
               if (color != color4)
               {
                  for (int ii = i;ii<2*i;ii++)
                  {
                     DiskClick.color = color;
                     window.add(disk);
                  }
               }
               if (check6 == true)
               {
                  Color color6 = getPixelColor(DiskClick.clickx-100*i-40, DiskClick.clicky-40);
                  check6 = false;
               }
               if (color != color6)
               {
                  for (int ii = i;ii<2*i;ii++)
                  {
                     DiskClick.color = color;
                     window.add(disk);
                  }
               }
               if (check7 == true)
               {
                  Color color7 = getPixelColor(DiskClick.clickx-100*i-40, DiskClick.clicky+100*i+40);
                  check7 = false;
               }
               if (color != color7)
               {
                  for (int ii = i;ii<2*i;ii++)
                  {
                     DiskClick.color = color;
                     window.add(disk);
                  }
               }
               if (check8 == true)
               {
                  Color color8 = getPixelColor(DiskClick.clickx+100*i+40, DiskClick.clicky-100*i-40);
                  check8 = false;
               }
               if (color != color8)
               {
                  for (int ii = i;ii<2*i;ii++)
                  {
                     DiskClick.color = color;
                     window.add(disk);
                  }
               }
         }
         boolean check1 = true;
         boolean check2 = true;
         boolean check3 = true;
         boolean check4 = true;
         boolean check5 = true;
         boolean check6 = true;
         boolean check7 = true;
         boolean check8 = true;
      }
   }
   
   public static Color getPixelColor(int x, int y) throws AWTException 
   {
      Robot robot = new Robot();
      return robot.getPixelColor(x, y);
   }
   
   public static void main(String[] args)
   {
      gameInit();
   }
   
} 