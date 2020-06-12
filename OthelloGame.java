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
   public static int turn = 0;
   public static int clickx = 0;
   public static int clicky = 0;
   public static int clickstat = 0;
   public static Color color = new Color(0, 0, 0);

   public void mouseClicked(MouseEvent e)
   {
      turn += 1;
      System.out.println(turn);
      clickx = ((e.getX()) / 100 ) * 100;
      clicky = ((e.getY()) / 100 ) * 100;
      OthelloDisk disk = new OthelloDisk();
      window.add(disk);
      window.getContentPane().validate();

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