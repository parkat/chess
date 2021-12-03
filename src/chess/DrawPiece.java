package chess;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JComponent;
class MyCanvas extends JComponent {
  public void paint(Graphics g,int x,int y,int piece) {
    Graphics2D g2 = (Graphics2D) g;
    Image bking;
    Image wking;
    
    if(piece ==1){
     bking = Toolkit.getDefaultToolkit().getImage("./PNGs/bking.png");
    g2.drawImage(bking, x, y,70,70, this);
    }
    if(piece == 2){
     wking = Toolkit.getDefaultToolkit().getImage("./PNGs/wking.png");
    g2.drawImage(wking, x, y,70,70, this);
    }
    g2.finalize();
  }
}


//   outerSpaceImage = Toolkit.getDefaultToolkit().getImage("./outerSpace.jpg"); 