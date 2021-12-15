package chess;
//hihihihih

import java.io.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;
import javax.swing.*;
//commenting to test

public class Chess extends JFrame implements Runnable {
    boolean animateFirstTime = true;
    Image image;
    Graphics2D g;
 
     public static Chess frame = new Chess();
   public static  JButton button;
     //button = new JButton(“Click Me!”);
    
     
    public static boolean yes = true;

    Image chessboard;
    
    public static void main(String[] args) {
     
        
      button = new JButton("hello");
     //  Chess frame = new Chess();
     frame.setLayout(new FlowLayout());
     
        frame.setSize(Window.WINDOW_WIDTH, Window.WINDOW_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
                Menu a = new Menu(yes);

    }

    public Chess() {
        
        setTitle("Chess | By Parker and Jared");
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {

                if (e.BUTTON1 == e.getButton() ) {
              
              //  if(clickToggle == true)
               Menu.buttonClick(e.getX(), e.getY());
              if (Board.board2 !=null)
                   Board.addPiece(e.getX(),e.getY());
                
                    Board.board2 = null;
               //   System.out.println(clickToggle);
                }

                if (e.BUTTON3 == e.getButton()) {
                      Board.movePiece(e.getX(),e.getY());
                 
                  

                }
                   if (e.BUTTON2 == e.getButton()) {
                    
                     
                 Board.Reset();
                   

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
          
                Menu.mous(g, e.getX(), e.getY());
  
      //     System.out.println("xpos = " + e.getX()+"   "+" ypos = "+ e.getY());
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
        
//            g.drawImage(chessboard,Window.getX(0),Window.getY(0),Window.getWidth2(),Window.getHeight2(),this);
//        
//        g.setColor(Color.black);
//        g.fillRect(0, 0, Window.xsize, Window.ysize);
//
//        int x[] = {Window.getX(0), Window.getX(Window.getWidth2()), Window.getX(Window.getWidth2()), Window.getX(0), Window.getX(0)};
//        int y[] = {Window.getY(0), Window.getY(0), Window.getY(Window.getHeight2()), Window.getY(Window.getHeight2()), Window.getY(0)};
////fill border
//        g.setColor(Color.GRAY);
//        g.fillPolygon(x, y, 4);
//// draw border
//        g.setColor(Color.BLUE);
//        g.drawPolyline(x, y, 5);
//        
    //    g.dr

        if (animateFirstTime) {
            gOld.drawImage(image, 0, 0, null);
            return;
        }
        chessboard = Toolkit.getDefaultToolkit().getImage("./PNGs/chessboard.jpg");
        
        g.drawImage(chessboard,Window.getX(-75),Window.getY(-67),Window.getWidth2()+150,Window.getHeight2()+130,this);

                
            Board.Draw(g,this);
            Menu.Draw(g);
            Menu.button(g);
            
            button = new JButton("hello");
     frame.setLayout(new FlowLayout());
            frame.add(button);
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
        Menu.show = true;
        chessboard = Toolkit.getDefaultToolkit().getImage("./chessboard.jpg");
    }
/////////////////////////////////////////////////////////////////////////
    public void animate() {

        if (animateFirstTime) {
            animateFirstTime = false;
            if (Window.xsize != getSize().width || Window.ysize != getSize().height) {
                Window.xsize = getSize().width;
                Window.ysize = getSize().height;
            }
            chessboard = Toolkit.getDefaultToolkit().getImage("./chessboard.jpg");
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

 

 
