
package chess;
import java.awt.*;

public class King extends Piece {
    King(int _id)
    {
        super(_id);
    
    }
   public void draw(Graphics2D g,int row,int column,int xdelta,int ydelta)   
   {
       g.setColor(getColor());
       g.fillArc(Window.getX(row*xdelta),Window.getY(ydelta*column), xdelta, ydelta,10,10);
   }
   
   
     public void draw (Graphics2D g,int row,int column,int xdelta,int ydelta,Chess thisObj)
         {
             
         }
}
