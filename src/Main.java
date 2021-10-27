
public class Main {

  public static void main(String[] args) {

    Player p1 = new Player("PLAYER1");
    Player p2 = new Player("PLAYER2");

    p1.play();    
    p1.play();    
    p1.pause();    
    p2.pause();
    p2.pause();    
    p2.play();
    p2.play();

  }

}