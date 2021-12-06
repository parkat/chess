/////////////////////////////////////Board.java
package chess;
import java.awt.*;

public class Board {
    //private  static int winner;
    private final static int NUM_ROWS = 8;
    private final static int NUM_COLUMNS = 8;      
    public static Piece board[][] = new Piece[NUM_ROWS][NUM_COLUMNS];
    private static Highlight highlight;
  
    

    public static void Reset() {
//clear the board.
      // winner = 0;
        for (int zrow=0;zrow<NUM_ROWS;zrow++)
            for (int zcol=0;zcol<NUM_COLUMNS;zcol++)
                //points to null or instance of peice
                board[zrow][zcol] = null;  
        Player.Reset();
     highlight = null;
   highlight = new Highlight();
  
       
    }
    
    public static void Draw(Graphics2D g,Chess thisObj) {
//draw grid
    
        int ydelta = Window.getHeight2()/NUM_ROWS;
        int xdelta = Window.getWidth2()/NUM_COLUMNS;
 // highlight.Draw(g, xdelta, ydelta);

 
          highlight.Draw(g, xdelta, ydelta);
        g.setColor(Color.black);
        for (int zi = 1;zi<NUM_ROWS;zi++)
        {
            g.drawLine(Window.getX(0),Window.getY(zi*ydelta),
                    Window.getX(Window.getWidth2()),Window.getY(zi*ydelta));
        }
                                                                                                                 
        for (int zi = 1;zi<NUM_COLUMNS;zi++)
        {
            g.drawLine(Window.getX(zi*xdelta),Window.getY(0),
                    Window.getX(zi*xdelta),Window.getY(Window.getHeight2()));
        }
        for (int zrow=0;zrow<NUM_ROWS;zrow++)
        {
            for (int zcol=0;zcol<NUM_COLUMNS;zcol++)        
            {
                if (board[zrow][zcol] != null)
                    board[zrow][zcol].draw(g, zrow, zcol,xdelta, ydelta, thisObj );
            }
        }  
         if(Player.players[1].getWinner() == true&&Player.players[0].getWinner() == true)
      {
           g.setColor(Color.yellow);
            g.setFont(new Font("Arial",Font.PLAIN,75));
            g.drawString("DRAW!",Window.WINDOW_WIDTH/3,400);      
    
      }
        
    else  if(Player.players[0].getWinner() == true)
      {
           g.setColor(Color.orange);
            g.setFont(new Font("Arial",Font.PLAIN,75));
            g.drawString("PLAYER 1 WINS",35,Window.WINDOW_HEIGHT/2);      
    
      }
    else  if(Player.players[1].getWinner() == true)
      {
           g.setColor(Color.black);
            g.setFont(new Font("Arial",Font.PLAIN,75));
            g.drawString("PLAYER 2 WINS",35,Window.WINDOW_HEIGHT/2);      
    
      }
    
    
    }
    public static void addPiece(int xpix ,int ypix)
    {
        
       
         {
             ///Player play = Player.getTurn();
               //play.getColor();
               //
//             if(areConnected() == true){
//                 
//                 Player play = Player.getTurn();
//                 play.setWinner(true);
//                 return;
//             }
             
        Board yeet = new Board();
        int ydelta = Window.getHeight2()/NUM_ROWS;
        int xdelta = Window.getWidth2()/NUM_COLUMNS;
        int xpixelOffset = xpix - Window.getX(0);
        int ypixelOffset = ypix - Window.getY(0);
     //    int num = (int)(Math.random()*2);
         if(xpixelOffset < 0  || xpixelOffset > Window.getWidth2())               
            return;    
                if(ypixelOffset < 0  || ypixelOffset > Window.getHeight2())
                return;
     
           
                int column = xpixelOffset/xdelta;
                 int row = ypixelOffset/ydelta;

        
       
      
       
           
        board[column][row] = new DrawPiece(Color.blue );

            
        
        }
        
      
     
       
 // if  (yeet.areFourConnected(board[column][row],Player.players[1].getColor()))
      //System.out.println("heyyy");
  
    //   if(yeet.areFourConnected(board[column][row],Player.players[0].getColor()))
         //  System.out.println("heyyy");
       
       
//      if(areConnected() == true){
//                 
//                 Player play = Player.getTurn();
//                 play.setWinner(true);
//                 return;
//             }
//      
      
         
    }
    public static void removePiece(int xpix, int ypix)
    {
        int ydelta = Window.getHeight2()/NUM_ROWS;
        int xdelta = Window.getWidth2()/NUM_COLUMNS;
        int xpixelOffset = xpix - Window.getX(0);
        int ypixelOffset = ypix - Window.getY(0);
     //    int num = (int)(Math.random()*2);
         if(xpixelOffset < 0  || xpixelOffset > Window.getWidth2())               
            return;    
                if(ypixelOffset < 0  || ypixelOffset > Window.getHeight2())
                return;
                
                int col = xpixelOffset/xdelta;
                int row = ypixelOffset/ydelta;
              //   board[col][row] = null;    
                 
                 

        
            board[col][row] = null;
        
        
    }
    
    
    public static int getRows()
    {
        return NUM_ROWS;
    }
     public static int getColumns()
    {
        return NUM_COLUMNS;
    }
     
             
    
  

    }              
  



