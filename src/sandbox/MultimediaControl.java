/***************************************************************************************************
 * Author: Allen Telson
 * File: Interface MultimediaControl.java
 * Date: 10/01/2018
 * Description: The Interface MultimediaControl currently contains methods used to represent
 * operators play, stop, previous, and next which are all used in devices that have music playback
 * capabilities.
 **************************************************************************************************/

package sandbox;

/**
 * Interface used to provide functionality to all devices that have multimedia control buttons.
 */
public interface MultimediaControl {

  /**
   * the definition of a method used provide the play functionality for a multimedia device.
   */
  void play();

  /**
   * the definition of a method used provide the stop functionality for a multimedia device.
   */
  void stop();

  /**
   * the definition of a method used provide the previous functionality for a multimedia device.
   */
  void previous();

  /**
   * the definition of a method used provide the next functionality for a multimedia device.
   */
  void next();


}
