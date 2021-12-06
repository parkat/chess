package chess;

import java.awt.*;

class DrawPiece extends Piece  {
    
    DrawPiece(Color _color)
    {
     super(_color);
                                              
    }
  public void draw (Graphics2D g,int row,int column,int xdelta,int ydelta,Chess thisObj) {
    Graphics2D g2 = (Graphics2D) g;
    Image bking;
    
     bking = Toolkit.getDefaultToolkit().getImage("./PNGs/bking.png");
    drawImage(g,thisObj,bking,Window.getX(row*xdelta)+38,Window.getYNormal(ydelta*column)+30,0.0,1.25,1.25 );
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
}


//   outerSpaceImage = Toolkit.getDefaultToolkit().getImage("./outerSpace.jpg"); 