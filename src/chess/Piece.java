/////////////////////////////////////Piece.java

package chess;
import java.awt.*;

public abstract class Piece {
    
    private Color color;
    Piece(Color _color)
    {
        color = _color;
    }
    public Color getColor()
    {
        return (color);
    }

    public abstract void draw(Graphics2D g,int row,int column,int xdelta,int ydelta);
       
    
    public abstract void Moves();

    public static void Highlight(int type)
    {
       if(type == 1)
       {
           //highlight pawn
           
       }
       else if(type == 2)
       {
           //highlight king
       }
       else if(type == 3)
       {
           //highlight queen
       }
       else if(type == 4)
       {
           //highlight rook
       }
       else if(type == 5)
       {
           //highlight bishop
       }
       else if(type == 6)
       {
           //highlight knight
       }
    }
    
    
    
}