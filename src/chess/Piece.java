/////////////////////////////////////Piece.java

package chess;
import java.awt.*;

public abstract class Piece {
   private Image image;
    private Color color;
    private int id;
    
    Piece()
    {
    
    }
    
    Piece(int _id)
    {
        id = _id;
    
    }
    public Color getColor()
    {
        return (color);
    }
//    public int getid()
//    {
//       return (id);
//    }
    
    public abstract void draw(Graphics2D g,int row,int column,int xdelta,int ydelta);  
    
    public abstract void draw(Graphics2D g,int row,int column,int xdelta,int ydelta,Chess thisObj);
      
public int getId()
    {
        return(id);
    }
    
    public int getid()
    {
       return (id);
    }
    
    
}