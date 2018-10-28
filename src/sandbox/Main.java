/***************************************************************************************************
 * Author: Allen Telson
 * File: class Main.java
 * Date: 10/01/2018
 * Description: The class Main is currently being used as a debugger for parts throughout my
 * program.
 **************************************************************************************************/

package sandbox;

import static sandbox.ItemType.*;
import static sandbox.MonitorType.*;

public class Main {

  public static void main(String[] args) {

    AudioPlayer myPlayer = new AudioPlayer("iPod", "MP3 Player", AU);
    System.out.println(myPlayer);

    Screen myScreen = new Screen("60", 0, 0);

    MoviePlayer dvdPlayer = new MoviePlayer("DVD Player" , LCD, myScreen);
    System.out.println("\n" + dvdPlayer);
  }
}
