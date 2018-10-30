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

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {

  public static void main(String[] args) {

    ArrayList<Product> myList = new ArrayList<>();
    myList.add(new Product("ISP"));
    myList.add(new Product("PS5"));
    myList.add(new Product("PS6"));
    myList.add(new AudioPlayer("iPod", "MP3", AUDIO));
    System.out.println(myList);
  }
}
