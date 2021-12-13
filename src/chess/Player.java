
package chess;
import java.awt.*;

public class Player {
    
    
    private static Player currentTurn;
    public static Player players[] = new Player[2];
    private boolean winner; 
    private Color color;
    
    public static void Reset()
    {
       currentTurn = players[1];
       players[1] = new Player(Color.RED);
       players[0] = new Player(Color.BLACK);
       Player.SwitchTurn();
       
    }
    Player(Color _color)
    {
       color = _color;
        
    }
        public static Player GetCurrentTurn() {
        return (currentTurn);
    }
    
    public Color getColor()
    {
        return color;
    }
    public static Player getTurn()
    {
        return currentTurn;
    }
    public static void SwitchTurn()
    {
     if(currentTurn == players[1])
         currentTurn = players[0];
     else 
         currentTurn = players[1];
     
        
    }
    public boolean getWinner()
    {
        return winner;
    }
    public void setWinner(boolean y)
    {
        winner = y;
//        System.out.println("winner is set to "+y);
    }
    
    
   
}
