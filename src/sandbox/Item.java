/***************************************************************************************************
 * Author: Allen Telson
 * File: Interface Item.java
 * Date: 10/01/2018
 * Description: Interface Item is used as a template for the abstract class Product.
 * It contains a necessary field and some methods (accessors and mutators) that will be
 * used as a template for Product class.
 **************************************************************************************************/

package sandbox;

/**
 * The Item interface is used to create different types of items that will be considered products,
 * AudioPlayer and MoviePLayer classes that are all implemented from this interface.
 */
public interface Item {

  // A public constant string named MANUFACTURER that is set to "Oracle Production"
  String MANUFACTURER = "OracleProduction";

  // the definition of a public setProductionNumber method that returns an integer
  void setProductionNumber(int productionNumber);

  // the definition of a public setName method that accept a string named deviceName
  void setProductName(String deviceName);

  // the definition of a public getName method that returns a String
  String getProductName();

  // the definition of a public getManufacturer method that returns a String
  String getManufacturer();

  // the definition of a public getSerialNumber method that returns an integer
  Integer getSerialNumber();


}
