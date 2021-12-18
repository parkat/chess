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
                //highlight black king
                if(row >= 0 && row <= 7 && col >= 0 && col <= 7)
                    Board.board3[col][row-1] = new Pieces(10);
                if(row >= 0 && row <= 7 && col > 0 && col <= 7)
                    Board.board3[col-1][row-1] = new Pieces(10);
                if(row >= 0 && row <= 7 && col >= 0 && col < 7)    
                    Board.board3[col+1][row-1] = new Pieces(10);
                if(row >= 0 && row <= 7 && col >= 0 && col < 7)    
                    Board.board3[col+1][row] = new Pieces(10);
                if(row >= 0 && row <= 7 && col > 0 && col <= 7)    
                    Board.board3[col-1][row] = new Pieces(10);
                if(row >= 0 && row < 7 && col >= 0 && col < 7)
                    Board.board3[col+1][row+1] = new Pieces(10);
                if(row >= 0 && row < 7 && col >= 0 && col <= 7)
                    Board.board3[col][row+1] = new Pieces(10);
                if(row >= 0 && row < 7 && col > 0 && col <= 7)
                    Board.board3[col-1][row+1] = new Pieces(10);
            }
            else if(type == 11)
            {
                //highlight white king
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
                if(row-1 >= 0 && row <= 7 && col-1 >= 0 && col <= 7)
                    Board.board3[col-1][row-1] = new Pieces(10);
                if(row-2 >= 0 && row <= 7 && col-2 >= 0 && col <= 7)
                    Board.board3[col-2][row-2] = new Pieces(10);
                if(row-3 >= 0 && row <= 7 && col-3 >= 0 && col <= 7)
                    Board.board3[col-3][row-3] = new Pieces(10);
                if(row-4 >= 0 && row <= 7 && col-4 >= 0 && col <= 7)
                    Board.board3[col-4][row-4] = new Pieces(10);
                if(row-5 >= 0 && row <= 7 && col-5 >= 0 && col <= 7)
                    Board.board3[col-5][row-5] = new Pieces(10);
                if(row-6 >= 0 && row <= 7 && col-6 >= 0 && col <= 7)
                    Board.board3[col-6][row-6] = new Pieces(10);
                if(row-7 >= 0 && row <= 7 && col-7 >= 0 && col <= 7)
                    Board.board3[col-7][row-7] = new Pieces(10);
                
                if(row >= 0 && row+1 <= 7 && col-1 >= 0 && col <= 7)
                    Board.board3[col-1][row+1] = new Pieces(10);
                if(row >= 0 && row+2 <= 7 && col-2 >= 0 && col <= 7)
                    Board.board3[col-2][row+2] = new Pieces(10);
                if(row >= 0 && row+3 <= 7 && col-3 >= 0 && col <= 7)
                    Board.board3[col-3][row+3] = new Pieces(10);
                if(row >= 0 && row+4 <= 7 && col-4 >= 0 && col <= 7)
                    Board.board3[col-4][row+4] = new Pieces(10);
                if(row >= 0 && row+5 <= 7 && col-5 >= 0 && col <= 7)
                    Board.board3[col-5][row+5] = new Pieces(10);
                if(row >= 0 && row+6 <= 7 && col-6 >= 0 && col <= 7)
                    Board.board3[col-6][row+6] = new Pieces(10);
                if(row >= 0 && row+7 <= 7 && col-7 >= 0 && col <= 7)
                    Board.board3[col-7][row+7] = new Pieces(10);
                
                if(row >= 0 && row+1 <= 7 && col >= 0 && col+1 <= 7)
                    Board.board3[col+1][row+1] = new Pieces(10);
                if(row >= 0 && row+2 <= 7 && col >= 0 && col+2 <= 7)
                    Board.board3[col+2][row+2] = new Pieces(10);
                if(row >= 0 && row+3 <= 7 && col >= 0 && col+3 <= 7)
                    Board.board3[col+3][row+3] = new Pieces(10);
                if(row >= 0 && row+4 <= 7 && col >= 0 && col+4 <= 7)
                    Board.board3[col+4][row+4] = new Pieces(10);
                if(row >= 0 && row+5 <= 7 && col >= 0 && col+5 <= 7)
                    Board.board3[col+5][row+5] = new Pieces(10);
                if(row >= 0 && row+6 <= 7 && col >= 0 && col+6 <= 7)
                    Board.board3[col+6][row+6] = new Pieces(10);
                if(row >= 0 && row+7 <= 7 && col >= 0 && col+7 <= 7)
                    Board.board3[col+7][row+7] = new Pieces(10);
                
                if(row-1 >= 0 && row <= 7 && col >= 0 && col+1 <= 7)
                    Board.board3[col+1][row-1] = new Pieces(10);
                if(row-2 >= 0 && row <= 7 && col >= 0 && col+2 <= 7)
                    Board.board3[col+2][row-2] = new Pieces(10);
                if(row-3 >= 0 && row <= 7 && col >= 0 && col+3 <= 7)
                    Board.board3[col+3][row-3] = new Pieces(10);
                if(row-4 >= 0 && row <= 7 && col >= 0 && col+4 <= 7)
                    Board.board3[col+4][row-4] = new Pieces(10);
                if(row-5 >= 0 && row <= 7 && col >= 0 && col+5 <= 7)
                    Board.board3[col+5][row-5] = new Pieces(10);
                if(row-6 >= 0 && row <= 7 && col >= 0 && col+6 <= 7)
                    Board.board3[col+6][row-6] = new Pieces(10);
                if(row-7 >= 0 && row <= 7 && col >= 0 && col+7 <= 7)
                    Board.board3[col+7][row-7] = new Pieces(10);
            }
            else if(type == 3 || type == 13)
            {
                //highlight knight 
                if(row >= 0 && row < 6 && col >= 0 && col <= 5)
                    Board.board3[col+2][row+2] = new Pieces(10);
                if(row > 1 && row <= 7 && col >= 0 && col <= 5)
                     Board.board3[col+2][row-2] = new Pieces(10);
                if(row > 1 && row <= 7 && col > 1 && col <= 7)
                     Board.board3[col-2][row-2] = new Pieces(10);
                if(row >= 0 && row < 6 && col > 1 && col <= 7)
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
                
                if(row-1 >= 0 && row <= 7 && col >= 0 && col <= 7)
                    Board.board3[col][row-1] = new Pieces(10);
                if(row-2 >= 0 && row <= 7 && col >= 0 && col <= 7)
                    Board.board3[col][row-2] = new Pieces(10);
                if(row-3 >= 0 && row <= 7 && col >= 0 && col <= 7)
                    Board.board3[col][row-3] = new Pieces(10);
                if(row-4 >= 0 && row <= 7 && col >= 0 && col <= 7)
                    Board.board3[col][row-4] = new Pieces(10);
                if(row-5 >= 0 && row <= 7 && col >= 0 && col <= 7)
                    Board.board3[col][row-5] = new Pieces(10);
                if(row-6 >= 0 && row <= 7 && col >= 0 && col <= 7)
                    Board.board3[col][row-6] = new Pieces(10);
                if(row-7 >= 0 && row <= 7 && col >= 0 && col <= 7)
                    Board.board3[col][row-7] = new Pieces(10);
                
                if(row >= 0 && row+1 <= 7 && col >= 0 && col <= 7)
                    Board.board3[col][row+1] = new Pieces(10);
                if(row >= 0 && row+2 <= 7 && col >= 0 && col <= 7)
                    Board.board3[col][row+2] = new Pieces(10);
                if(row >= 0 && row+3 <= 7 && col >= 0 && col <= 7)
                    Board.board3[col][row+3] = new Pieces(10);
                if(row >= 0 && row+4 <= 7 && col >= 0 && col <= 7)
                    Board.board3[col][row+4] = new Pieces(10);
                if(row >= 0 && row+5 <= 7 && col >= 0 && col <= 7)
                    Board.board3[col][row+5] = new Pieces(10);
                if(row >= 0 && row+6 <= 7 && col >= 0 && col <= 7)
                    Board.board3[col][row+6] = new Pieces(10);
                if(row >= 0 && row+7 <= 7 && col >= 0 && col <= 7)
                    Board.board3[col][row+7] = new Pieces(10);
                
                if(row >= 0 && row <= 7 && col-1 >= 0 && col <= 7)    
                    Board.board3[col-1][row] = new Pieces(10);
                if(row >= 0 && row <= 7 && col-2 >= 0 && col <= 7)    
                    Board.board3[col-2][row] = new Pieces(10);
                if(row >= 0 && row <= 7 && col-3 >= 0 && col <= 7)    
                    Board.board3[col-3][row] = new Pieces(10);
                if(row >= 0 && row <= 7 && col-4 >= 0 && col <= 7)    
                    Board.board3[col-4][row] = new Pieces(10);
                if(row >= 0 && row <= 7 && col-5 >= 0 && col <= 7)    
                    Board.board3[col-5][row] = new Pieces(10);
                if(row >= 0 && row <= 7 && col-6 >= 0 && col <= 7)    
                    Board.board3[col-6][row] = new Pieces(10);
                if(row >= 0 && row <= 7 && col-7 >= 0 && col <= 7)    
                    Board.board3[col-7][row] = new Pieces(10);
                
                if(row >= 0 && row <= 7 && col >= 0 && col+1 <= 7)    
                    Board.board3[col+1][row] = new Pieces(10);
                if(row >= 0 && row <= 7 && col >= 0 && col+2 <= 7)    
                    Board.board3[col+2][row] = new Pieces(10);
                if(row >= 0 && row <= 7 && col >= 0 && col+3 <= 7)    
                    Board.board3[col+3][row] = new Pieces(10);
                if(row >= 0 && row <= 7 && col >= 0 && col+4 <= 7)    
                    Board.board3[col+4][row] = new Pieces(10);
                if(row >= 0 && row <= 7 && col >= 0 && col+5 <= 7)    
                    Board.board3[col+5][row] = new Pieces(10);
                if(row >= 0 && row <= 7 && col >= 0 && col+6 <= 7)    
                    Board.board3[col+6][row] = new Pieces(10);
                if(row >= 0 && row <= 7 && col >= 0 && col+7 <= 7)    
                    Board.board3[col+7][row] = new Pieces(10);
                
                if(row-1 >= 0 && row <= 7 && col-1 >= 0 && col <= 7)
                    Board.board3[col-1][row-1] = new Pieces(10);
                if(row-2 >= 0 && row <= 7 && col-2 >= 0 && col <= 7)
                    Board.board3[col-2][row-2] = new Pieces(10);
                if(row-3 >= 0 && row <= 7 && col-3 >= 0 && col <= 7)
                    Board.board3[col-3][row-3] = new Pieces(10);
                if(row-4 >= 0 && row <= 7 && col-4 >= 0 && col <= 7)
                    Board.board3[col-4][row-4] = new Pieces(10);
                if(row-5 >= 0 && row <= 7 && col-5 >= 0 && col <= 7)
                    Board.board3[col-5][row-5] = new Pieces(10);
                if(row-6 >= 0 && row <= 7 && col-6 >= 0 && col <= 7)
                    Board.board3[col-6][row-6] = new Pieces(10);
                if(row-7 >= 0 && row <= 7 && col-7 >= 0 && col <= 7)
                    Board.board3[col-7][row-7] = new Pieces(10);
                
                if(row >= 0 && row+1 <= 7 && col-1 >= 0 && col <= 7)
                    Board.board3[col-1][row+1] = new Pieces(10);
                if(row >= 0 && row+2 <= 7 && col-2 >= 0 && col <= 7)
                    Board.board3[col-2][row+2] = new Pieces(10);
                if(row >= 0 && row+3 <= 7 && col-3 >= 0 && col <= 7)
                    Board.board3[col-3][row+3] = new Pieces(10);
                if(row >= 0 && row+4 <= 7 && col-4 >= 0 && col <= 7)
                    Board.board3[col-4][row+4] = new Pieces(10);
                if(row >= 0 && row+5 <= 7 && col-5 >= 0 && col <= 7)
                    Board.board3[col-5][row+5] = new Pieces(10);
                if(row >= 0 && row+6 <= 7 && col-6 >= 0 && col <= 7)
                    Board.board3[col-6][row+6] = new Pieces(10);
                if(row >= 0 && row+7 <= 7 && col-7 >= 0 && col <= 7)
                    Board.board3[col-7][row+7] = new Pieces(10);
                
                if(row >= 0 && row+1 <= 7 && col >= 0 && col+1 <= 7)
                    Board.board3[col+1][row+1] = new Pieces(10);
                if(row >= 0 && row+2 <= 7 && col >= 0 && col+2 <= 7)
                    Board.board3[col+2][row+2] = new Pieces(10);
                if(row >= 0 && row+3 <= 7 && col >= 0 && col+3 <= 7)
                    Board.board3[col+3][row+3] = new Pieces(10);
                if(row >= 0 && row+4 <= 7 && col >= 0 && col+4 <= 7)
                    Board.board3[col+4][row+4] = new Pieces(10);
                if(row >= 0 && row+5 <= 7 && col >= 0 && col+5 <= 7)
                    Board.board3[col+5][row+5] = new Pieces(10);
                if(row >= 0 && row+6 <= 7 && col >= 0 && col+6 <= 7)
                    Board.board3[col+6][row+6] = new Pieces(10);
                if(row >= 0 && row+7 <= 7 && col >= 0 && col+7 <= 7)
                    Board.board3[col+7][row+7] = new Pieces(10);
                
                if(row-1 >= 0 && row <= 7 && col >= 0 && col+1 <= 7)
                    Board.board3[col+1][row-1] = new Pieces(10);
                if(row-2 >= 0 && row <= 7 && col >= 0 && col+2 <= 7)
                    Board.board3[col+2][row-2] = new Pieces(10);
                if(row-3 >= 0 && row <= 7 && col >= 0 && col+3 <= 7)
                    Board.board3[col+3][row-3] = new Pieces(10);
                if(row-4 >= 0 && row <= 7 && col >= 0 && col+4 <= 7)
                    Board.board3[col+4][row-4] = new Pieces(10);
                if(row-5 >= 0 && row <= 7 && col >= 0 && col+5 <= 7)
                    Board.board3[col+5][row-5] = new Pieces(10);
                if(row-6 >= 0 && row <= 7 && col >= 0 && col+6 <= 7)
                    Board.board3[col+6][row-6] = new Pieces(10);
                if(row-7 >= 0 && row <= 7 && col >= 0 && col+7 <= 7)
                    Board.board3[col+7][row-7] = new Pieces(10);
            }
            else if(type == 6 || type == 16)
            {
                //highlight rook
                if(row-1 >= 0 && row <= 7 && col >= 0 && col <= 7)
                    Board.board3[col][row-1] = new Pieces(10);
                if(row-2 >= 0 && row <= 7 && col >= 0 && col <= 7)
                    Board.board3[col][row-2] = new Pieces(10);
                if(row-3 >= 0 && row <= 7 && col >= 0 && col <= 7)
                    Board.board3[col][row-3] = new Pieces(10);
                if(row-4 >= 0 && row <= 7 && col >= 0 && col <= 7)
                    Board.board3[col][row-4] = new Pieces(10);
                if(row-5 >= 0 && row <= 7 && col >= 0 && col <= 7)
                    Board.board3[col][row-5] = new Pieces(10);
                if(row-6 >= 0 && row <= 7 && col >= 0 && col <= 7)
                    Board.board3[col][row-6] = new Pieces(10);
                if(row-7 >= 0 && row <= 7 && col >= 0 && col <= 7)
                    Board.board3[col][row-7] = new Pieces(10);
                
                if(row >= 0 && row+1 <= 7 && col >= 0 && col <= 7)
                    Board.board3[col][row+1] = new Pieces(10);
                if(row >= 0 && row+2 <= 7 && col >= 0 && col <= 7)
                    Board.board3[col][row+2] = new Pieces(10);
                if(row >= 0 && row+3 <= 7 && col >= 0 && col <= 7)
                    Board.board3[col][row+3] = new Pieces(10);
                if(row >= 0 && row+4 <= 7 && col >= 0 && col <= 7)
                    Board.board3[col][row+4] = new Pieces(10);
                if(row >= 0 && row+5 <= 7 && col >= 0 && col <= 7)
                    Board.board3[col][row+5] = new Pieces(10);
                if(row >= 0 && row+6 <= 7 && col >= 0 && col <= 7)
                    Board.board3[col][row+6] = new Pieces(10);
                if(row >= 0 && row+7 <= 7 && col >= 0 && col <= 7)
                    Board.board3[col][row+7] = new Pieces(10);
                
                if(row >= 0 && row <= 7 && col-1 >= 0 && col <= 7)    
                    Board.board3[col-1][row] = new Pieces(10);
                if(row >= 0 && row <= 7 && col-2 >= 0 && col <= 7)    
                    Board.board3[col-2][row] = new Pieces(10);
                if(row >= 0 && row <= 7 && col-3 >= 0 && col <= 7)    
                    Board.board3[col-3][row] = new Pieces(10);
                if(row >= 0 && row <= 7 && col-4 >= 0 && col <= 7)    
                    Board.board3[col-4][row] = new Pieces(10);
                if(row >= 0 && row <= 7 && col-5 >= 0 && col <= 7)    
                    Board.board3[col-5][row] = new Pieces(10);
                if(row >= 0 && row <= 7 && col-6 >= 0 && col <= 7)    
                    Board.board3[col-6][row] = new Pieces(10);
                if(row >= 0 && row <= 7 && col-7 >= 0 && col <= 7)    
                    Board.board3[col-7][row] = new Pieces(10);
                
                if(row >= 0 && row <= 7 && col >= 0 && col+1 <= 7)    
                    Board.board3[col+1][row] = new Pieces(10);
                if(row >= 0 && row <= 7 && col >= 0 && col+2 <= 7)    
                    Board.board3[col+2][row] = new Pieces(10);
                if(row >= 0 && row <= 7 && col >= 0 && col+3 <= 7)    
                    Board.board3[col+3][row] = new Pieces(10);
                if(row >= 0 && row <= 7 && col >= 0 && col+4 <= 7)    
                    Board.board3[col+4][row] = new Pieces(10);
                if(row >= 0 && row <= 7 && col >= 0 && col+5 <= 7)    
                    Board.board3[col+5][row] = new Pieces(10);
                if(row >= 0 && row <= 7 && col >= 0 && col+6 <= 7)    
                    Board.board3[col+6][row] = new Pieces(10);
                if(row >= 0 && row <= 7 && col >= 0 && col+7 <= 7)    
                    Board.board3[col+7][row] = new Pieces(10);
            }
            Board.type = 0;
    }
        
    public void draw(Graphics2D g,int row,int column,int xdelta,int ydelta)
    {
        
    }
    public void draw(Graphics2D g,int row,int column,int xdelta,int ydelta,Chess thisObj)
    {
        
    }
    
    public static void reset()
    {
        for (int zrow=0;zrow<Board.getRows();zrow++)
        {
            for (int zcol=0;zcol<Board.getColumns();zcol++)        
            {
                Board.board3[zcol][zrow] = null;
            }
        }
    }
}