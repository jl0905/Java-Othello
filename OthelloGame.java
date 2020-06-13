import javax.swing.JFrame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.Robot;
import java.awt.AWTException;

public class OthelloGame extends MouseAdapter
{
   public JFrame window = new JFrame("Othello!");
   public OthelloBoard board = new OthelloBoard();
   public static Integer[][] disks = new Integer[8][8];
   public static int turn = 0;
   public static int clickx = 0;
   public static int clicky = 0;
   public static int clickstat = 0;
   public static Color color = new Color(0, 0, 0);

   public void mouseClicked(MouseEvent e)
   {
      turn += 1;
      clickx = ((e.getX()) / 100 ) * 100;
      clicky = ((e.getY()) / 100 ) * 100;
      int x = clickx/100;
      int y = clicky/100;

      if(disks[x][y] == 2) {
         System.out.println(disks[x][y]);
         OthelloDisk disk = new OthelloDisk();
         window.add(disk);
         window.getContentPane().invalidate();
         window.getContentPane().validate();
      }
      else {
         turn-=1;
      }

      disks[x][y] = turn%2;
      for(int i=y-1;i>=0;i--) {
         //try {
         if(disks[x][i] == turn%2) {

               /*for(int j=y-1;j>=i;i--) {
                  disks[x][j] = turn%2;
                  clickx = x*100;
                  clicky = j*100;
                  OthelloDisk disk = new OthelloDisk();
                  window.add(disk);
                  window.getContentPane().invalidate();
                  window.getContentPane().validate();
               }*/
         }
         //}
         //catch(RuntimeException error) {}
      }
      clickstat = 1;
      try {
         Robot robot = new Robot();
         int count = 100;
         Color color = robot.getPixelColor(e.getX(),e.getY());
         if (turn % 2 == 0) {
            count = 100;
            while(count < 800 && color.getRed() != 255) {
               color = robot.getPixelColor(e.getX()+count, e.getY());
               count += 100;
            }
            count = 100;
            while(count < 800 && color.getRed() != 255) {
               color = robot.getPixelColor(e.getX()-count, e.getY());
               count += 100;
            }
            count = 100;
            while(count < 800 && color.getRed() != 255) {
               color = robot.getPixelColor(e.getX(), e.getY()+count);
               count += 100;
            }
            count = 100;
            while(count < 800 && color.getRed() != 255) {
               color = robot.getPixelColor(e.getX()-count, e.getY()-count);
               count += 100;
            }
            count = 100;
            while(count < 800 && color.getRed() != 255) {
               color = robot.getPixelColor(e.getX()-count, e.getY()-count);
               count += 100;
            }
            count = 100;
            while(count < 800 && color.getRed() != 255) {
               color = robot.getPixelColor(e.getX()+count, e.getY()+count);
               count += 100;
            }
            count = 100;
            while(count < 800 && color.getRed() != 255) {
               color = robot.getPixelColor(e.getX()+count, e.getY()-count);
               count += 100;
            }
            count = 100;
            while(count < 800 && color.getRed() != 255) {
               color = robot.getPixelColor(e.getX()-count, e.getY()+count);
               count += 100;
            }
            }
         if (turn % 2 == 1) {
            count = 100;
            while(count < 800 && color.getRed() != 0) {
               color = robot.getPixelColor(e.getX()+count, e.getY());
               count += 100;
            }
            count = 100;
            while(count < 800 && color.getRed() != 0) {
               color = robot.getPixelColor(e.getX()-count, e.getY());
               count += 100;
            }
            count = 100;
            while(count < 800 && color.getRed() != 0) {
               color = robot.getPixelColor(e.getX(), e.getY()+count);
               count += 100;
            }
            count = 100;
            while(count < 800 && color.getRed() != 0) {
               color = robot.getPixelColor(e.getX()-count, e.getY()-count);
               count += 100;
            }
            count = 100;
            while(count < 800 && color.getRed() != 0) {
               color = robot.getPixelColor(e.getX()-count, e.getY()-count);
               count += 100;
            }
            count = 100;
            while(count < 800 && color.getRed() != 0) {
               color = robot.getPixelColor(e.getX()+count, e.getY()+count);
               count += 100;
            }
            count = 100;
            while(count < 800 && color.getRed() != 0) {
               color = robot.getPixelColor(e.getX()+count, e.getY()-count);
               count += 100;
            }
            count = 100;
            while(count < 800 && color.getRed() != 0) {
               color = robot.getPixelColor(e.getX()-count, e.getY()+count);
               count += 100;
            }
         }
         } catch (AWTException h) {
            h.printStackTrace();
           }


   }

   public void gameInit(OthelloGame game)
   {
      window.getContentPane().addMouseListener(game);
      
      window.setSize(950, 840);
      window.setLocation(-7, -30);
      window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      window.setVisible(true);
      window.add(board);


      
   }

   

   
   public static void main(String[] args)
   {
      OthelloGame game = new OthelloGame();
      game.gameInit(game);

   }
   
} 