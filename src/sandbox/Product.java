package sandbox;

import java.util.Date;
import java.lang.String;

//Abstract class that is implemented by the Item Interface
abstract class Product implements Item {


  private int serialNumber;
  private String manufacturer = MANUFACTURER;
  private Date manufacturedOn;
  private String productName;
  private int currentProductionNumber = 1; //used to store the next number to be assigned to serial#


  // Time and date variable that will be used for the manufacturing date
  private java.util.Date date = new java.util.Date();

  /**
   * @param productionNumber for passed production number
   * @return int
   *  mutator method used to set production number to current production number
   */
  public Item setProductionNumber(int productionNumber) {
    currentProductionNumber = productionNumber;
    return this;
  }

  /**
   * @param deviceName for passed device name
   * @return String
   *  mutator method used to set product name to current device name
   */
  public Product setProductName(String deviceName) {
    productName = deviceName;
    return this;
  }

  /**
   *  accessor method used to return the product name
   */
  public Product getProductName() {
    return this;
  }

  /**
   *  accessor method used to return manufacturer
   */
  public Product getManufacturer() {
    return this;
  }

  /**
   *  accessor method used to return serialNumber
   */
  public Product getSerialNumber() {
    return this;
  }

  /**
   * @param deviceName for product name
   *  constructor
   *  used to take in the name of the product and set to the field variable name.
   *  Assign a serial number from the currentProductionNumber.
   *  Incremented the currentProductionNumber in readiness for the next instance.
   *  Set manufacturedOn as the current date and time.
   */
  public Product(String deviceName) {

    productName = deviceName;
    serialNumber = currentProductionNumber;
    currentProductionNumber++;
    manufacturedOn = date;
  }

  /**
   * toString method used to return a print statement with the following:
   * manufacturer
   * serialNumber
   * manufacturedOn
   * productName
   */
  public String toString() {

    return "Manufacturer  : " + manufacturer + "\n"
        + "Serial Number : " + serialNumber + "\n"
        + "Date          : " + manufacturedOn + "\n"
        + "Name          : " + productName;
  }

}
