
package chess;
import java.awt.*;

public class Pawn extends Piece {
    
    Pawn(Color _color)
    {
        super(_color);
    }
   public void draw(Graphics2D g,int row,int column,int xdelta,int ydelta)   
   {
       g.setColor(getColor());
       g.fillRect(Window.getX(row*xdelta),Window.getY(ydelta*column), xdelta, ydelta);
   }
}
