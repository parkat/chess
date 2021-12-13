
package chess;

import java.io.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;
import javax.swing.*;

public class Menu extends JFrame{
    public static boolean show = true;
    JButton button = new JButton("Click here!");
     
        JPanel panel = new JPanel();
    Menu(boolean _show)
    {
        JButton button = new JButton("Click here!");
        button.setBounds(50,100,100,50);
        
        show = _show;
         Chess.frame.add(button);
         
         setDefaultCloseOperation(EXIT_ON_CLOSE);
         setVisible(true);
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
            
//              g.setColor(Color.WHITE);
//        g.setFont (new Font ("OCR A",Font.BOLD, 10));                  
//            g.drawString("help :\n" +
//"1) click with left mouse button to select a piece\n" +
//"2)click with right mouse button to place the piece\n" +
//"3) some pieces move differently be aware of this\n" +
//"| pawns can move and take backwards\n" +
//"| Knights can move in a big L (2x2) along with the normal L shape\n" +
//"| every two turns the king can move like a queen", 285, 250);

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
    
}
