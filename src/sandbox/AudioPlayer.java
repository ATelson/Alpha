package sandbox;

/**
 * The AudioPlayer class is used to create an AudioPlayer object that inherits all From the Product
 * class and is implemented by the MultimediaControl interface. It is used to create and store
 * Products that are audio players such as an iPod.
 */
public class AudioPlayer extends Product implements MultimediaControl {

  //Fields that are specific to Audio Players
  private String audioSpecification;
  private ItemType mediaType = ItemType.AUDIO;

  /**
   * AudioPlayer constructor that sets device name, audio spec, and item type using parameters. The
   * device name is passed into an additional argument that calls from the superclass constructor to
   * fill in the rest of the fields that are required when create a product that is of AudioPlayer
   * type.
   *
   * @param deviceName for product name.
   * @param audioSpecification for audio specification.
   * @param mediaType for the type of item.
   */
  AudioPlayer(String deviceName, String audioSpecification, ItemType mediaType) {
    super(deviceName);
    this.audioSpecification = audioSpecification;
    this.mediaType = mediaType;
  }

  /**
   * AudioPlayer constructor that sets device name and audio spec using parameters. The device name
   * is passed into an additional argument that calls from the superclass constructor to fill in the
   * rest of the fields that are required when create a product that is of AudioPlayer type.
   *
   * @param deviceName for product name.
   * @param audioSpecification for audio specification.
   */
  AudioPlayer(String deviceName, String audioSpecification) {
    super(deviceName);
    this.audioSpecification = audioSpecification;
  }

  //implement play method derived from MultimediaControl interface
  @Override
  public void play() {
    System.out.println("Playing");

  }

  //implement stop method derived from MultimediaControl interface
  @Override
  public void stop() {
    System.out.println("Stop");

  }

  //implement previous method derived from MultimediaControl interface
  @Override
  public void previous() {
    System.out.println("Previous");

  }

  //implement next method derived from MultimediaControl interface
  @Override
  public void next() {
    System.out.println("Next");

  }

  /**
   * Override toString method and return the superclass' toString method to print all the
   * characteristics from its superclass along with printing the new fields created within the
   * AudioPlayer class.
   */
  @Override
  public String toString() {
    return super.toString() + "\n" + "Audio Spec: " + this.audioSpecification + "\n" + "Type: "
        + this.mediaType;
  }
}
