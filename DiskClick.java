// Jeffery Lin, Ethan Valentine
// Othelllo Controls

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;

public class DiskClick extends MouseAdapter
{
   public static int turn = 0;
   public static int clickx = 0;
   public static int clicky = 0;
   public static int clickstat = 0;
   public static Color color = new Color(0, 0, 0);
   
   public void mouseClicked(MouseEvent e)
   {
      turn += 1;
      System.out.println(turn);
      clickx = ((e.getX() + 99) / 100 ) * 100;
      clicky = ((e.getY() + 99) / 100 ) * 100;
      //OthelloDisk disk = new OthelloDisk();
      //window.add(disk);
      clickstat = 1;
   }
}