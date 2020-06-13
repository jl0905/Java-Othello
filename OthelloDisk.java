// Ethan Valentine, Jeffery Lin
// GUI Code

import javax.swing.JPanel;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;
  
public class OthelloDisk extends JPanel
{
   public int xpos;
   public int ypos;
   public int t;
   public OthelloDisk(int x, int y, int turn) {
      xpos = x;
      ypos = y;
      t = turn;
   }
   public void paintComponent(Graphics g)
   {
      Graphics2D diskdown = (Graphics2D) g;
      Rectangle rectangle = new Rectangle(xpos, ypos, 100, 100);
      diskdown.draw(rectangle);
      if (t % 2 == 0 || OthelloGame.color == Color.WHITE)
      {
         diskdown.setColor(Color.WHITE);
      }
      if (t % 2 == 1 || OthelloGame.color == Color.WHITE)
      {
         diskdown.setColor(Color.BLACK);
      }
      diskdown.fillRect(xpos+10, ypos+10, 80, 80);

   }

    
} 