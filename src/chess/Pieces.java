package chess;

import java.awt.*;

class Pieces extends Piece  {
    int id;
    static int ID;
    private Image img;
    
    Pieces(int _id)
    {
     super(_id);
     id = _id;
     ID = id;
     img = null;
    setPiece();                                          
    }
    
    private void setPiece()
    {
        if(id == 1)
            img =   Toolkit.getDefaultToolkit().getImage("./PNGs/bking.png"); 
        else if(id == 11)
            img =   Toolkit.getDefaultToolkit().getImage("./PNGs/wking.png"); 
        else if(id == 2)
            img =   Toolkit.getDefaultToolkit().getImage("./PNGs/bbishop.png"); 
        else if(id == 12)
            img =   Toolkit.getDefaultToolkit().getImage("./PNGs/wbishop.png"); 
        else if(id == 3)
            img =   Toolkit.getDefaultToolkit().getImage("./PNGs/bknight.png"); 
        else  if(id == 13)
            img =   Toolkit.getDefaultToolkit().getImage("./PNGs/wknight.png"); 
        else if(id == 4)
            img =   Toolkit.getDefaultToolkit().getImage("./PNGs/bpawn.png"); 
        else if(id == 14)
            img =   Toolkit.getDefaultToolkit().getImage("./PNGs/wpawn.png"); 
        else if(id == 5)
            img =   Toolkit.getDefaultToolkit().getImage("./PNGs/bqueen.png"); 
        else if(id == 15)
             img =   Toolkit.getDefaultToolkit().getImage("./PNGs/wqueen.png"); 
        else if(id == 6)
            img =   Toolkit.getDefaultToolkit().getImage("./PNGs/brook.png"); 
        else  if(id == 16)
            img =   Toolkit.getDefaultToolkit().getImage("./PNGs/wrook.png"); 
        else if(id == 10)
             img = Toolkit.getDefaultToolkit().getImage("./PNGs/bluedot.png"); 
           
    }
    
    
   public void draw(Graphics2D g,int row,int column,int xdelta,int ydelta)   
   {
       
   }
    
    
    
    
    
    
  public void draw (Graphics2D g,int row,int column,int xdelta,int ydelta,Chess thisObj) {
  
    
    
     
    drawImage(g,thisObj,img,Window.getX(xdelta*row)+38,Window.getY(ydelta*column)+30,0.0,1.25,1.25 );
    }
 public void drawImage(Graphics2D g,Chess thisObj,Image image,int xpos,int ypos,double rot,double xscale,double yscale) {
        int width = image.getWidth(thisObj);
        int height = image.getHeight(thisObj);
        g.translate(xpos,ypos);
        g.rotate(rot  * Math.PI/180.0);
        g.scale( xscale , yscale );

        g.drawImage(image,-width/2,-height/2,
        width,height,thisObj);

        g.scale( 1.0/xscale,1.0/yscale );
        g.rotate(-rot  * Math.PI/180.0);
        g.translate(-xpos,-ypos);
    }    


    public int getid()
    {
        return(id);
    }
        public static int getID()
    {
        return(ID);
    }
    
}
//  board[zrow][zcol].draw(g, zrow, zcol,xdelta, ydelta, thisObj );
//   outerSpaceImage = Toolkit.getDefaultToolkit().getImage("./outerSpace.jpg"); 