package sandbox;

/**
 * The MoviePlayer class inherits from the Product class and is implemented from the
 * MultimediaControl interface that contains the functionality of buttons that associate with
 * multimedia products.
 */
public class MoviePlayer extends Product implements MultimediaControl {

  //fields that are specific features to a movie player
  private MonitorType monitorType;
  private Screen screen;

  /**
   * constructor used to set the name of the movie player, its screen, and monitor type. Prints from
   * Super class constructor. Assign a serial number from the currentProductionNumber. Increments
   * the currentProductionNumber in readiness for the next instance. Set manufacturedOn as the
   * current date and time.
   *
   * @param deviceName sets the MoviePlayer name.
   * @param screen to set screen specifications of the movie Player.
   * @param monitorType to set the monitor type of the movie player.
   */
  MoviePlayer(String deviceName, Screen screen, MonitorType monitorType) {
    super(deviceName);
    this.monitorType = monitorType;
    this.screen = screen;
  }

  //method used to implement the functionality of a media player
  @Override
  public void play() {

  }

  //method used to implement the functionality of a media player
  @Override
  public void stop() {

  }

  //method used to implement the functionality of a media player
  @Override
  public void previous() {

  }

  //method used to implement the functionality of a media player
  @Override
  public void next() {

  }

  /**
   * overridden toString method used to return Strings from the product super class and prints the
   * screen specifications and the movie player's monitor type.
   */
  @Override
  public String toString() {
    return super.toString() + "\n" + "Screen : " + this.screen + "\n" + "Monitor Type : "
        + this.monitorType;
  }
}
