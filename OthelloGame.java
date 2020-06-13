import javax.swing.JFrame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;

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
         addDisk(x, y, turn%2);
         //search all above squares
         int i = y-1;
         while(i >= 0) {
            //if disk of same color found
            if(disks[x][i] == turn%2) {
               //for all spaces between original location and found disk
               for(int j=y-1;j>i;j--) {
                  //check for open space, if there is open space exit
                  if(disks[x][j] ==2) {
                     i = -1;
                     break;
                  }
               }
               //if there wasnt open space
               if(i != -1) {
                  //for all spaces between original location and found disk
                  for (int j = y - 1; j > i; j--) {
                     //draw disk and put it into coordinate array
                     disks[x][j] = turn % 2;
                     addDisk(x, j, turn % 2);
                     i = -1;
                  }
               }
            }
            i--;
         }
         //end loop
      }
      else {
         turn-=1;
      }

      disks[x][y] = turn%2;

      clickstat = 1;
   }
   public void addDisk(int x, int y, int color) {
      OthelloDisk disk = new OthelloDisk(x*100, y*100, color);
      window.add(disk);
      window.getContentPane().invalidate();
      window.getContentPane().validate();
   }
   public void gameInit(OthelloGame game)
   {
      window.getContentPane().addMouseListener(game);
      
      window.setSize(950, 840);
      window.setLocation(700, 150);
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