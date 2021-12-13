/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess;
import java.awt.*;

import java.awt.Color;


public class Highlight {
    public static enum Direction {right,down};
    private int row;
    private int column;
    private Direction direction;

    private boolean isHighlight = true;
    private int numBoxes;

    Highlight(int _row,int _column,int num,Direction d)
    {
       row = _row;
       column = _column;

       direction = d;
       numBoxes = num;

    }
    Highlight()
    {isHighlight = false;}
        
    
    public int getRows()
    {
        return (row);
    }
     public int getColumns()
    {
        return (column);
    }
    
     public void Draw(Graphics2D g,int xdelta,int ydelta,int type)
    {
//        if(!isHighlight)
//            return;
        g.setColor(Color.YELLOW);
        
        int zcol = column;
        int zrow = row;
//        for (int i = 0; i<numBoxes;i++)    {     
//        g.fillRect(Window.getX(zrow*xdelta),Window.getY(ydelta*zcol), xdelta, ydelta);
//        if(direction == Direction.right)
//            zrow++;
//        else if(direction == Direction.down)
//            zcol--;
//        }
        
       if(type == 1 || type == 11)
       {
           //highlight king
           System.out.println("hi");
           g.fillRect(Window.getX(zrow*xdelta),Window.getY(ydelta*zcol), xdelta, ydelta);
       }
       else if(type == 2 || type == 12)
       {
           //highlight bishop
           g.fillRect(Window.getX(zrow*xdelta),Window.getY(ydelta*zcol), xdelta, ydelta);
       }
       else if(type == 3 || type == 13)
       {
           //highlight knight  
           g.fillRect(Window.getX(zrow*xdelta),Window.getY(ydelta*zcol), xdelta, ydelta);
       }
       else if(type == 4)
       {
           //highlight black pawn
           g.fillRect(Window.getX(zrow*xdelta),Window.getY(ydelta*zcol), xdelta, ydelta);
       }
       else if(type == 14)
       {
           //highlight white pawn
           g.fillRect(Window.getX(zrow*xdelta),Window.getY(ydelta*zcol), xdelta, ydelta);
       }
       else if(type == 5 || type == 15)
       {
           //highlight queen
           g.fillRect(Window.getX(zrow*xdelta),Window.getY(ydelta*zcol), xdelta, ydelta);
       }
       else if(type == 6 || type == 16)
       {
           //highlight rook
           g.fillRect(Window.getX(zrow*xdelta),Window.getY(ydelta*zcol), xdelta, ydelta);
       }
    }

    
    public void Draw(Graphics2D g,int xdelta,int ydelta) {
        if(!isHighlight)
            return;
        g.setColor(Color.YELLOW);
        int zcol = column;
        int zrow = row;
        for (int i = 0; i<numBoxes;i++)    {     
        g.fillRect(Window.getX(zrow*xdelta),Window.getY(ydelta*zcol), xdelta, ydelta);
        if(direction == Direction.right)
            zrow++;
        else if(direction == Direction.down)
            zcol--;
        }
    }
    
    
    public static void Draw(Graphics2D g,int row,int col,int xdelta,int ydelta,int type)
    {
            System.out.println(row);
            g.setColor(Color.YELLOW);
            type = Board.type;
            if(type == 0)
            {

            }
            else if(type == 1 || type == 11)
            {
                g.fillRect(row*5, col*5, 75, 67);
            }
            else if(type == 2 || type == 12)
            {
                //highlight bishop
                g.fillRect(row*5, col*5, 75, 67);
             }
            else if(type == 3 || type == 13)
            {
                //highlight knight  
                g.fillRect(row*5, col*5, 75, 67);
            }
            else if(type == 4)
            {
                //highlight black pawn
                g.fillRect(row*5, col*5, 75, 67);
            }
            else if(type == 14)
            {
                //highlight white pawn
                g.fillRect(row*5, col*5, 75, 67);
            }
            else if(type == 5 || type == 15)
            {
                //highlight queen
                g.fillRect(row*5, col*5, 75, 67);
            }
            else if(type == 6 || type == 16)
            {
                //highlight rook
                g.fillRect(row*5, col*5, 75, 67);
            }
    }

}

