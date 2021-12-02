package chess;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JComponent;
class MyCanvas extends JComponent {
  public void paint(Graphics g,int x,int y) {
    Graphics2D g2 = (Graphics2D) g;
    Image img1 = Toolkit.getDefaultToolkit().getImage("./bking.png");
    g2.drawImage(img1, x, y,100,100, this);
    g2.finalize();
  }
}


//   outerSpaceImage = Toolkit.getDefaultToolkit().getImage("./outerSpace.jpg"); 