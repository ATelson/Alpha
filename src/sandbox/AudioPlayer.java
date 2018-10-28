package sandbox;

public class AudioPlayer extends Product implements MultimediaControl {


  String audioSpecification;
  ItemType mediaType;

  /**
   * constructor used to take in the name of the product and set to the field variable name. Assign
   * a serial number from the currentProductionNumber. Incremented the currentProductionNumber in
   * readiness for the next instance. Set manufacturedOn as the current date and time.
   *
   * @param deviceName for product name.
   */
  public AudioPlayer(String deviceName, String audioSpecification, ItemType mediaType) {
    super(deviceName);
    this.audioSpecification = audioSpecification;
    this.mediaType = mediaType;
  }

  @Override
  public void play() {
    System.out.println("Playing");

  }

  @Override
  public void stop() {
    System.out.println("Stop");

  }

  @Override
  public void previous() {
    System.out.println("Previous");

  }

  @Override
  public void next() {
    System.out.println("Next");

  }

  @Override
  public String toString() {
    return super.toString() + "\n" + this.audioSpecification + "\n" + this.mediaType;
  }
}
