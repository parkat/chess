package chess;

import javax.sound.sampled.*; 
import java.io.*; 
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;

public class Chess extends JFrame implements Runnable {
    boolean animateFirstTime = true;
    Image image;
    Graphics2D g;

    public static void main(String[] args) {
        Chess frame = new Chess();
        frame.setSize(Window.WINDOW_WIDTH, Window.WINDOW_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public Chess() {
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {

                if (e.BUTTON1 == e.getButton() ) {
                    Board.addPiece(e.getX(),e.getY());
                    
                  
                 //    Player.SwitchTurn();
                  //  System.out.println(e.getX()+" "+e.getY());
                    
                }

                if (e.BUTTON3 == e.getButton()) {
                    
                    
                      Board.removePiece(e.getX(),e.getY());
                   

                }
                repaint();
            }
        });
            

    addMouseMotionListener(new MouseMotionAdapter() {
      public void mouseDragged(MouseEvent e) {

        repaint();
      }
    });

    addMouseMotionListener(new MouseMotionAdapter() {
      public void mouseMoved(MouseEvent e) {

        repaint();
      }
    });

        addKeyListener(new KeyAdapter() {

            public void keyPressed(KeyEvent e) {
                if (e.VK_UP == e.getKeyCode()) {
                } else if (e.VK_DOWN == e.getKeyCode()) {
                } else if (e.VK_LEFT == e.getKeyCode()) {
                } else if (e.VK_RIGHT == e.getKeyCode()) {
                } else if (e.VK_ESCAPE == e.getKeyCode()) {
                    Board.Reset();
                    reset();
                }
                repaint();
            }
        });
        init();
        start();
    }
    Thread relaxer;
////////////////////////////////////////////////////////////////////////////
    public void init() {
        requestFocus();
    }
////////////////////////////////////////////////////////////////////////////
    public void destroy() {
    }
////////////////////////////////////////////////////////////////////////////
    public void paint(Graphics gOld) {
        if (image == null || Window.xsize != getSize().width || Window.ysize != getSize().height) {
            Window.xsize = getSize().width;
            Window.ysize = getSize().height;
            image = createImage(Window.xsize, Window.ysize);
            g = (Graphics2D) image.getGraphics();
            g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON);
        }
//fill background
        
        g.setColor(Color.black);
        g.fillRect(0, 0, Window.xsize, Window.ysize);

        int x[] = {Window.getX(0), Window.getX(Window.getWidth2()), Window.getX(Window.getWidth2()), Window.getX(0), Window.getX(0)};
        int y[] = {Window.getY(0), Window.getY(0), Window.getY(Window.getHeight2()), Window.getY(Window.getHeight2()), Window.getY(0)};
//fill border
        g.setColor(Color.GRAY);
        g.fillPolygon(x, y, 4);
// draw border
        g.setColor(Color.BLUE);
        g.drawPolyline(x, y, 5);
        
    //    g.dr

        if (animateFirstTime) {
            gOld.drawImage(image, 0, 0, null);
            return;
        }
        
              
        Board.Draw(g,this);
      /* 
       if(Player.players[1].winner == true)
         Board.win1(g);
     else if(Player.players[1].winner == true)
          Board.win2(g);
     else if (Player.players[1].winner == true && Player.players[0].winner == true)
         Board.stalemate(g);
         */
        gOld.drawImage(image, 0, 0, null);
    }

////////////////////////////////////////////////////////////////////////////
// needed for     implement runnable
    public void run() {
        while (true) {
            animate();
            repaint();
            double seconds = .1;    //time that 1 frame takes.
            int miliseconds = (int) (1000.0 * seconds);
            try {
                Thread.sleep(miliseconds);
            } catch (InterruptedException e) {
            }
        }
    }
    
/////////////////////////////////////////////////////////////////////////
    public void reset() {
        Board.Reset();
    }
/////////////////////////////////////////////////////////////////////////
    public void animate() {

        if (animateFirstTime) {
            animateFirstTime = false;
            if (Window.xsize != getSize().width || Window.ysize != getSize().height) {
                Window.xsize = getSize().width;
                Window.ysize = getSize().height;
            }

            reset();

        }

        
    }

////////////////////////////////////////////////////////////////////////////
    public void start() {
        if (relaxer == null) {
            relaxer = new Thread(this);
            relaxer.start();
        }
    }
////////////////////////////////////////////////////////////////////////////
    public void stop() {
        if (relaxer.isAlive()) {
            relaxer.stop();
        }
        relaxer = null;
    }

}

 

 