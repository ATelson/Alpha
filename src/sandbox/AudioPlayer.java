package sandbox;

public class AudioPlayer extends Product implements MultimediaControl {


  private String audioSpecification;
  private ItemType mediaType = ItemType.AUDIO;

  /**
   * constructor used to take in the name of the product and set to the field variable name. Assign
   * a serial number from the currentProductionNumber. Incremented the currentProductionNumber in
   * readiness for the next instance. Set manufacturedOn as the current date and time.
   *
   * @param deviceName for product name.
   */
  AudioPlayer(String deviceName, String audioSpecification, ItemType mediaType) {
    super(deviceName);
    this.audioSpecification = audioSpecification;
    this.mediaType = mediaType;
  }

  AudioPlayer(String deviceName, String audioSpecification) {
    super(deviceName);
    this.audioSpecification = audioSpecification;
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
    return super.toString() + "\n" + "Audio Spec: " + this.audioSpecification + "\n" + "Type: "
        + this.mediaType;
  }
}
