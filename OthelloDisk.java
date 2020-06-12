// Ethan Valentine, Jeffery Lin
// GUI Code

import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;
  
public class OthelloDisk extends JComponent
{ 

   public void paintComponent(Graphics g)
   {
      System.out.println("test");
      Graphics2D diskdown = (Graphics2D) g;
      if (DiskClick.turn % 2 == 0 || DiskClick.color == Color.WHITE)
      {
         diskdown.setColor(Color.WHITE);
      }
      if (DiskClick.turn % 2 == 1 || DiskClick.color == Color.WHITE)
      {
         diskdown.setColor(Color.BLACK);
      }
      diskdown.fillRect(DiskClick.clickx+10, DiskClick.clicky+10, 80, 80);

   }

    
} 