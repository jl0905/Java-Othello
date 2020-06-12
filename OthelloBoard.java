// Ethan Valentine, Jeffery Lin
// GUI Code

import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;
  
public class OthelloBoard extends JComponent
{ 

   public void paintComponent(Graphics g)
   {
      System.out.println("test2");
      Graphics2D graphics = (Graphics2D) g;
      Rectangle[] gameboard = new Rectangle[64];
      for (int i=0;i<8;i++)
      {
         for (int ii=0;ii<8;ii++)
         {
            gameboard[i] = new Rectangle(100*i, 100*ii, 100, 100);
            graphics.draw(gameboard[i]);
         }
      }
      graphics.setColor(Color.WHITE);
      graphics.fillRect(310, 310, 80, 80);
      graphics.fillRect(410, 410, 80, 80);
      graphics.setColor(Color.BLACK);
      graphics.fillRect(310, 410, 80, 80);
      graphics.fillRect(410, 310, 80, 80);
   }
    
} 