public class PauseMode extends State {

  private static PauseMode instance;  

  protected PauseMode() {}

  public static PauseMode instance() {
    if (instance == null)
    	instance = new PauseMode();

    return instance;
  }


  public boolean pause(Player player) {
    System.out.println("Already in PauseMode " + player);
    return false;
  }

  public void play(Player player) {
    System.out.println("Put in PlayMode " + player);
    player.setState(PlayMode.instance());
  }

  public String toString() {
    return "PauseMode";
  }
}