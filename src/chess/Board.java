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
      
// add the detections for win 
                
                //find the correct row to place the piece.        
        int row = NUM_ROWS-1;  //start at the bottom index.
//while we are below the top and spot is not empty.        
        while (row >= 0 && board[column][row] != null)
        {
            row--; //ove up to the next row.
       }
       if (row < 0)  //don't add a piece if column full
            return; 
       
      
       if (Player.getTurn() == Player.players[0] ) { 
           
        board[column][row] = new OvalPiece(Player.players[0].getColor() );
            Player.SwitchTurn();
            
        
        }
        
       else  {
            board[column][row] = new DrawPiece(Player.players[1].getColor());
          
            Player.SwitchTurn();
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
        
       
            if(board[0][0] != null && board[1][0] != null&& board[2][0] != null&& board[3][0] != null&& board[4][0] != null&& board[5][0] != null&& board[6][0] != null&& board[7][0] != null ) //areConnected() == false)               
            {
                Player.players[1].setWinner(true);
                 Player.players[0].setWinner(true);
            }
         }
                

       
      
         
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
                 
                 
//if piece at bottom 
        if(board[col][row] != null)
        {
            //keep looping while not at top and there is a piece to shuffle 
            while(row >= 0 &&  board[col][row] != null)
            {
                //move piece down
                board[col][row] = board[col][row-1];
                        //move up 
                        row --;
            }
            
            //if at top remove 
        
            board[col][0] = null;
        }
        
    }
    
    
    public static int getRows()
    {
        return NUM_ROWS;
    }
     public static int getColumns()
    {
        return NUM_COLUMNS;
    }
     
             
    
    /* 
     private static boolean areConnected(){
         
       final  int numconnect = 4;
        int _row = 0 ;
        int wrow= 0;
        int wcol = 0;
       
         Color currentColor = null;
       //  final  int numconnect2 = 4;
         //int _row = 0 ;
       // int _col = 0;
         Color currentColor2 = null;
         
        for (int zrow = 0; zrow<NUM_ROWS; zrow++){         
        for (int zcol = 0; zcol<NUM_COLUMNS; zcol++){
            
            
            if(board[zcol][zrow] == null)
            {
             _row = 0;
             currentColor = null;
            }
            else if(board[zcol][zrow].getColor() == currentColor)
            {
                _row ++;
                
                if(_row == numconnect)
                {
                    highlight = new Highlight(wcol,wrow,numconnect,Highlight.Direction.right);
                
                    
                    return true;
                }
                
            }
            else{
                _row = 1;
                wrow = zrow;
                wcol = zcol;
                currentColor = board[zcol][zrow].getColor();
        }
        
    }
          
         _row = 0;
         currentColor = null;
          
    }        
                
        for (int zcol = 0; zcol<NUM_COLUMNS; zcol++){
            for (int zrow = 0; zrow<NUM_ROWS; zrow++){ 
            
            
            if(board[zcol][zrow] == null)
            {
             _row = 0;
             currentColor2 = null;
            }
            else if(board[zcol][zrow].getColor() == currentColor2)
            {
                _row ++;
                if(_row == numconnect)
                {
                 highlight = new Highlight(zcol,zrow,numconnect,Highlight.Direction.down);
           
                    return true;
                }
                
            }
            else{
                _row = 1;
                currentColor2 = board[zcol][zrow].getColor();
        }
       
    }
          
         
            _row = 0;
         currentColor2 = null;
    }
        /*
        for (int zrow = 0; zrow<NUM_ROWS; zrow++){         
        for (int zcol = 0; zcol<NUM_COLUMNS; zcol++){
        for(int rowStart = 0; rowStart < NUM_ROWS-4;rowStart++){
        int count = 0;
        int row2, col;
        for(row2 = rowStart,col = 0;row2<NUM_ROWS && col < NUM_COLUMNS; row2++, col++){
            if(board[col][row2] == board[zcol][zrow])
                
            
        }
       
            }}}

        return false;
     }
*/



    }              
  



