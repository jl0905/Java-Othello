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
      Graphics2D diskdown = (Graphics2D) g;
      Rectangle rectangle = new Rectangle(OthelloGame.clickx, OthelloGame.clicky, 100, 100);
      diskdown.draw(rectangle);
      if (OthelloGame.turn % 2 == 0 || OthelloGame.color == Color.WHITE)
      {
         diskdown.setColor(Color.WHITE);
      }
      if (OthelloGame.turn % 2 == 1 || OthelloGame.color == Color.WHITE)
      {
         diskdown.setColor(Color.BLACK);
      }
      diskdown.fillRect(OthelloGame.clickx+10, OthelloGame.clicky+10, 80, 80);

   }

    
} 