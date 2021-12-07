
package chess;
import java.awt.*;

public class King extends Piece {
    King(Color _color)
    {
        super(_color);
    }
   public void draw(Graphics2D g,int row,int column,int xdelta,int ydelta)   
   {
       g.setColor(getColor());
       g.fillArc(Window.getX(row*xdelta),Window.getY(ydelta*column), xdelta, ydelta,10,10);
   }
   public void Moves()
   {

        
   }

}
