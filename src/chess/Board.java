/////////////////////////////////////Board.java
package chess;
import java.awt.*;

public class Board {
    //private  static int winner;
   public static  boolean clickMode;
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
  clickMode = false;
       
    }
    
    public static void Draw(Graphics2D g,Chess thisObj) {
//draw grid
    
        int ydelta = Window.getHeight2()/NUM_ROWS;
        int xdelta = Window.getWidth2()/NUM_COLUMNS;
 // highlight.Draw(g, xdelta, ydelta);

            setPiece(xdelta,ydelta);
            
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
                    board[zrow][zcol].draw(g, zrow, zcol,xdelta, ydelta,thisObj);
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
        
      
 
        board[column][row] = new Pieces(16);
  
         }    
    }
     public static void setPiece(int xdelta,int ydelta)
        {
            //--white--
             board[3][0] = new Pieces(11);
             board[4][0] = new Pieces(15);
             board[2][0] = new Pieces(12);
             board[5][0] = new Pieces(12);
             board[1][0] = new Pieces(13);
             board[6][0] = new Pieces(13);
             board[0][0] = new Pieces(16);
             board[7][0] = new Pieces(16);
             board[0][1] = new Pieces(14);
             board[1][1] = new Pieces(14);
             board[2][1] = new Pieces(14);
             board[3][1] = new Pieces(14);
             board[4][1] = new Pieces(14);
             board[5][1] = new Pieces(14);
             board[6][1] = new Pieces(14);
             board[7][1] = new Pieces(14);
             //--------------------------------------
             //--black--
             board[3][7] = new Pieces(1);
             board[4][7] = new Pieces(5);
             board[2][7] = new Pieces(2);
             board[5][7] = new Pieces(2);
             board[1][7] = new Pieces(3);
             board[6][7] = new Pieces(3);
             board[0][7] = new Pieces(6);
             board[7][7] = new Pieces(6);
             board[0][6] = new Pieces(4);
             board[1][6] = new Pieces(4);
             board[2][6] = new Pieces(4);
             board[3][6] = new Pieces(4);
             board[4][6] = new Pieces(4);
             board[5][6] = new Pieces(4);
             board[6][6] = new Pieces(4);
             board[7][6] = new Pieces(4);
        }
  
    public static void movePiece(int xpix, int ypix)
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
              
        Piece board2 = null;
        if(clickMode == true)
        board2 =board[col][row];
       
        System.out.println(board2);
                 
        
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
  



