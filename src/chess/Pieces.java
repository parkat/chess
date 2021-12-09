package chess;

import java.awt.*;

class Pieces extends Piece  {
    int id;
    private Image img;
    
    Pieces(int _id)
    {
     super(_id);
     id = _id;
     img = null;
    setPiece();                                          
    }
    
   private void setPiece()
   {
       if(id == 1)
        img =   Toolkit.getDefaultToolkit().getImage("./PNGs/bking.png"); 
        if(id == 11)
        img =   Toolkit.getDefaultToolkit().getImage("./PNGs/wking.png"); 
         if(id == 2)
        img =   Toolkit.getDefaultToolkit().getImage("./PNGs/bbishop.png"); 
         if(id == 12)
        img =   Toolkit.getDefaultToolkit().getImage("./PNGs/wbishop.png"); 
         if(id == 3)
        img =   Toolkit.getDefaultToolkit().getImage("./PNGs/bknight.png"); 
          if(id == 13)
        img =   Toolkit.getDefaultToolkit().getImage("./PNGs/wknight.png"); 
           if(id == 4)
        img =   Toolkit.getDefaultToolkit().getImage("./PNGs/bpawn.png"); 
            if(id == 14)
        img =   Toolkit.getDefaultToolkit().getImage("./PNGs/wpawn.png"); 
            if(id == 5)
        img =   Toolkit.getDefaultToolkit().getImage("./PNGs/bqueen.png"); 
            if(id == 15)
        img =   Toolkit.getDefaultToolkit().getImage("./PNGs/wqueen.png"); 
            if(id == 6)
        img =   Toolkit.getDefaultToolkit().getImage("./PNGs/brook.png"); 
            if(id == 16)
        img =   Toolkit.getDefaultToolkit().getImage("./PNGs/wrook.png"); 
           
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
}
//  board[zrow][zcol].draw(g, zrow, zcol,xdelta, ydelta, thisObj );
//   outerSpaceImage = Toolkit.getDefaultToolkit().getImage("./outerSpace.jpg"); 