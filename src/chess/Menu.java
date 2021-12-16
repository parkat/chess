
package chess;

import java.awt.*;
import javax.swing.*;

public class Menu extends JFrame{
    public static boolean show = true;
    private static boolean color;
    Menu(boolean _show)
    {
       show = true;  
    }
    
    public static void Draw(Graphics2D g)
    {
       
        if(show != false){
            g.setColor(Color.BLACK);
            g.fillRect(0, 0, 800, 800);
            g.setColor(Color.DARK_GRAY);
            g.fillRect(50, 80, 550, 500);
            
              g.setColor(Color.WHITE);
        g.setFont (new Font ("OCR A",Font.BOLD, 30));                  
            g.drawString("Menu", 285, 150);


 g.setColor(Color.WHITE);
        g.setFont (new Font ("OCR A",Font.BOLD, 15));                  
            g.drawString("Help :", 85, 200);
            
            
            g.setColor(Color.WHITE);            
        g.setFont (new Font ("OCR A",Font.BOLD, 15));                  
            g.drawString("1) click with left mouse button to select a piece", 85, 220);
            
             g.setColor(Color.WHITE);
        g.setFont (new Font ("OCR A",Font.BOLD, 15));                  
            g.drawString("2)click with right mouse button to place the piece", 85, 240);

             g.setColor(Color.WHITE);
        g.setFont (new Font ("OCR A",Font.BOLD, 15));                  
            g.drawString("3) some pieces move differently be aware of this", 85, 260);
            
            g.setColor(Color.WHITE);
        g.setFont (new Font ("OCR A",Font.BOLD, 15));                  
            g.drawString("      | pawns can move and take backwards", 85, 280);
            
             g.setColor(Color.WHITE);
        g.setFont (new Font ("OCR A",Font.BOLD, 15));                  
            g.drawString("      | Knights can move in a big L (2x2) along with the normal L shape", 85, 300);
            
            g.setColor(Color.WHITE);
        g.setFont (new Font ("OCR A",Font.BOLD, 15));                  
            g.drawString("      | every two turns the king can move like a queen", 85, 320);
            
             g.setColor(Color.WHITE);
        g.setFont (new Font ("OCR A",Font.BOLD, 15));                  
            g.drawString("  Press [Enter] to bring back this screen", 200, 380);
        
        }
    }
    public static void mous(Graphics2D g,int x, int y)
    {
        
          if( y >= 400 && y<=430&&x >= 280 && x<=380){
        color = true;

        }
        else
        {
   color = false;
 
        }
    }
    public static void button(Graphics2D g)
    {
        if(show != false){
        if (color == true ){
              g.setColor(Color.WHITE);
        g.fillRect(280,400, 100, 30);
        
        g.setColor(Color.BLUE);
        g.setFont (new Font ("OCR A",Font.BOLD, 30));                  
            g.drawString("OK", 306, 420+5);
        }
           if (color == false ){
              g.setColor(Color.BLUE);
        g.fillRect(280,400, 100, 30);
        g.setColor(Color.WHITE);
        g.setFont (new Font ("OCR A",Font.BOLD, 30));                  
            g.drawString("OK", 306, 420+5);
         }
     }
}
    public static void buttonClick(int x, int y)
    {
            if( y >= 400 && y<=430&&x >= 280 && x<=380){
        show = false;
            }
       System.out.println(show);
    }
}
