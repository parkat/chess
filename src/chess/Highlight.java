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

                    public void Draw( Graphics2D g,int xdelta,int ydelta) {
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



}

