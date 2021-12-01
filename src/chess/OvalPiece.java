
package chess;
import java.awt.*;
import java.awt.image.ImageObserver;

public class OvalPiece extends Piece{
    private static Image rocketAnim;    
   OvalPiece(Color _color)
    {
     super(_color);
    
    }
   public static void Init()
    {
        
        rocketAnim = Toolkit.getDefaultToolkit().getImage("./animShip.GIF");
    }
   public void draw(Graphics2D g,int row,int column,int xdelta,int ydelta,OvalPiece thisObj)   
   {
      drawImage(g,thisObj,rocketAnim,Window.getX(Window.getX(row*xdelta)),Window.getYNormal(Window.getY(ydelta*column)),0.0,-0.25,0.25 );
       g.fillOval(Window.getX(row*xdelta),Window.getY(ydelta*column), xdelta, ydelta);
   }
   public void drawImage(Graphics2D g,OvalPiece thisObj,Image image,int xpos,int ypos,double rot,double xscale,double yscale) {
        int width = image.getWidth((ImageObserver) thisObj);
        int height = image.getHeight((ImageObserver) thisObj);
        g.translate(xpos,ypos);
        g.rotate(rot  * Math.PI/180.0);
        g.scale( xscale , yscale );

        g.drawImage(image,-width/2,-height/2,
        width,height, (ImageObserver) thisObj);

        g.scale( 1.0/xscale,1.0/yscale );
        g.rotate(-rot  * Math.PI/180.0);
        g.translate(-xpos,-ypos);
    }    
    
}
