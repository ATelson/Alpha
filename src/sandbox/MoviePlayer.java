package sandbox;

public class MoviePlayer extends Product implements MultimediaControl {

  public MonitorType monitorType;
  public Screen screen;

  /**
   * constructor used to take in the name of the product and set to the field variable name. Assign
   * a serial number from the currentProductionNumber. Incremented the currentProductionNumber in
   * readiness for the next instance. Set manufacturedOn as the current date and time.
   *
   * @param deviceName for product name.
   */
  public MoviePlayer(String deviceName, MonitorType monitorType, Screen screen) {
    super(deviceName);
    this.monitorType = monitorType;
    this.screen = screen;
  }

  @Override
  public void play() {

  }

  @Override
  public void stop() {

  }

  @Override
  public void previous() {

  }

  @Override
  public void next() {

  }

  @Override
  public String toString() {
    return super.toString() + "\n" + "Monitor Type : " + this.monitorType + "\n" + "Screen : " + "\n"
        + this.screen;
  }
}
