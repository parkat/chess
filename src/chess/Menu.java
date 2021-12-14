
package chess;

import java.awt.*;
import javax.swing.*;

public class Menu extends JFrame{
    public static boolean show = false;
     //JFrame f = new JFrame("New Frame");
    Menu(boolean _show)
    {
        
    //     f.setSize(390, 300);
         
//JButton b = new JButton("Submit");
////b.setBounds(50, 150, 100, 30);
//add button to the frame
//f.add(b);
        
        show = _show;
     
         
         //setDefaultCloseOperation(EXIT_ON_CLOSE);
        //setVisible(true);
    }
    
    public static void Draw(Graphics2D g)
    {
        if(show == true){
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
            
            
        
        }
    }
    public static void button(Graphics2D g,int x, int y)
    {
       
        if( y >= 500 && y<=530&&x >= 280 && x<=380){
         g.setColor(Color.WHITE); 

        }
        else
        {
   g.setColor(Color.BLUE); 
 
        }
        g.fillRect(280,500, 100, 30);
    }
}
