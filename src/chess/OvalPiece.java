
package chess;
import java.awt.*;
import java.awt.Graphics2D;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;


import javax.swing.JFrame;


public class OvalPiece extends Piece{
    
   OvalPiece(Color _color)
    {
     super(_color);
    
    }
   public void draw(Graphics2D g,int row,int column,int xdelta,int ydelta)   
   {
       MyCanvas ptr = new MyCanvas();
       
       ptr.paint(g, Window.getX(row*xdelta), Window.getY(ydelta*column));
       //g.setColor(getColor());
        
       //g.fillOval(Window.getX(row*xdelta),Window.getY(ydelta*column), xdelta, ydelta);
   }
}
