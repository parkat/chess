/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess;
import java.awt.*;

import java.awt.Color;


public class Highlight extends Piece{
    public static enum Direction {right,down};
    private int row;
    private int column;
    private Direction direction;
    

    private boolean isHighlight = true;
    private int numBoxes;

    Highlight(int _id)
    {
        super(_id);
    }
    Highlight()
    {
        isHighlight = false;
    }
    
        
    
    public int getRows()
    {
        return (row);
    }
     public int getColumns()
    {
        return (column);
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
//            System.out.println(xdelta);
            g.setColor(Color.YELLOW);
            type = Board.type;
//            Board.board3[4][4] = new Pieces(10);
//             g.fillRect(105, 140, 75, 67);
            
            if(type == 0)
            {
                
            }
            else if(type == 1)
            {
                //highlight king
                if(row >= 0 && row <= 7 && col >= 1 && col < 7)
                    Board.board3[col][row-1] = new Pieces(10);
                if(row >= 0 && row <= 7 && col >= 1 && col < 7)
                    Board.board3[col-1][row-1] = new Pieces(10);
                if(row >= 0 && row <= 7 && col >= 1 && col < 7)    
                    Board.board3[col+1][row-1] = new Pieces(10);
                if(row >= 0 && row <= 7 && col >= 1 && col < 7)    
                    Board.board3[col+1][row] = new Pieces(10);
                if(row >= 0 && row <= 7 && col >= 1 && col < 7)    
                    Board.board3[col-1][row] = new Pieces(10);
                if(row >= 0 && row < 7 && col >= 1 && col < 7)
                    Board.board3[col+1][row+1] = new Pieces(10);
                if(row >= 0 && row < 7 && col >= 1 && col < 7)
                    Board.board3[col][row+1] = new Pieces(10);
                if(row >= 0 && row < 7 && col >= 1 && col < 7)
                    Board.board3[col-1][row+1] = new Pieces(10);
            }
            else if(type == 11)
            {
                //highlight king
                if(row > 0 && row < 7 && col >= 1 && col < 7)
                    Board.board3[col][row-1] = new Pieces(10);
                if(row > 0 && row < 7 && col >= 1 && col < 7)
                    Board.board3[col-1][row-1] = new Pieces(10);
                if(row > 0 && row < 7 && col >= 1 && col < 7)    
                    Board.board3[col+1][row-1] = new Pieces(10);
                if(row >= 0 && row < 7 && col >= 1 && col < 7)    
                    Board.board3[col+1][row] = new Pieces(10);
                if(row >= 0 && row < 7 && col >= 1 && col < 7)    
                    Board.board3[col-1][row] = new Pieces(10);
                if(row >= 0 && row <= 7 && col >= 1 && col < 7)
                    Board.board3[col+1][row+1] = new Pieces(10);
                if(row >= 0 && row <= 7 && col >= 1 && col < 7)
                    Board.board3[col][row+1] = new Pieces(10);
                if(row >= 0 && row <= 7 && col >= 1 && col < 7)
                    Board.board3[col-1][row+1] = new Pieces(10);
            }
            else if(type == 2 || type == 12)
            {
                //highlight bishop
                
                
            }
            else if(type == 3 || type == 13)
            {
                //highlight knight 
                if(row >= 1 && row <= 6 && col >= 1 && col <= 6)
                    Board.board3[col+2][row+2] = new Pieces(10);
                if(row >= 1 && row <= 6 && col >= 1 && col <= 6)
                     Board.board3[col+2][row-2] = new Pieces(10);
                if(row >= 1 && row <= 6 && col >= 1 && col <= 6)
                     Board.board3[col-2][row-2] = new Pieces(10);
                if(row >= 1 && row <= 6 && col >= 1 && col <= 6)
                     Board.board3[col-2][row+2] = new Pieces(10);
                
            }
            else if(type == 4)
            {
                //highlight black pawn
                if(row >= 1)
                    Board.board3[col][row-1] = new Pieces(10);
                if(row >= 2)
                    Board.board3[col][row-2] = new Pieces(10);
            }
            else if(type == 14)
            {
                //highlight white pawn
                if(row <= 6)
                    Board.board3[col][row+1] = new Pieces(10);
                if(row <= 5)
                    Board.board3[col][row+2] = new Pieces(10);
            }
            else if(type == 5 || type == 15)
            {
                //highlight queen
                
            }
            else if(type == 6 || type == 16)
            {
                //highlight rook
                
            }
            Board.type = 0;
            
    }
        
    public void draw(Graphics2D g,int row,int column,int xdelta,int ydelta)
    {
        
    }
    public void draw(Graphics2D g,int row,int column,int xdelta,int ydelta,Chess thisObj)
    {
        
    }

}

