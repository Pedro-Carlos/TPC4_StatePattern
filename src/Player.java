public class Player {

  private State state;   

  private String name;


  public Player(String name) {
    this.name = name;
    this.state = PauseMode.instance();
  }

  public String toString() {
    return (this.name + " ( Current state " + this.state + ")" );
  }


  void setState(State state) {
    this.state = state;
  }


  public void play() {
    this.state.play(this);
  }

  public boolean pause() {
    return this.state.pause(this);
  }
}