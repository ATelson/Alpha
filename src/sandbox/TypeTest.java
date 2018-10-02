/***************************************************************************************************
 * Author: Allen Telson
 * File: class TypeTest.java
 * Date: 10/01/2018
 * Description: TypeTest file is currently being used to just test the enum ItemType.
 * It first instantiates an object from ItemType and labels it type and tests each element
 * within the enum. Each element of the enum has a respective data type description.
 **************************************************************************************************/
package sandbox;


public class TypeTest {

  private ItemType type;

  TypeTest(ItemType type) {
    this.type = type;
  }

  /**
   * void type method used to test enum ItemType in a switch statement.
   * Each element has a case which prints data type.
   */
  public void displayItemTypes() {
    switch (type) {
      case AU:
        System.out.println("Audio Type");
        break;

      case VI:
        System.out.println("Visual Type");
        break;

      case AM:
        System.out.println("AudioMobile Type");
        break;

      case VM:
        System.out.println("VisualMobile Type");
        break;

      default:
        System.out.println("Unkown Type");
        break;
    }
  }
}
