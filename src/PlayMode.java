public class PlayMode extends State {


  private static PlayMode instance; 

  protected PlayMode() {}

  public static PlayMode instance() {
    if (instance == null)
    	instance = new PlayMode();

    return instance;
  }
  public boolean pause(Player player) {
	  System.out.println("Put in PauseMode " + player);
	    player.setState(PauseMode.instance());
	    return true;
	  }

  public void play(Player player) {
	    System.out.println("Already in PlayMode " + player);
	  }


	  public String toString() {
	    return "PlayMode";
	  }
	}
