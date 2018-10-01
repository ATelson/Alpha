package sandbox;

public interface Item {

  // A public constant string named MANUFACTURER that is set to "Oracle Production"
  String MANUFACTURER = "Oracle Production";

  // the definition of a public setProductionNumber method that returns an integer
  Item setProductionNumber(int productionNumber);

  // the definition of a public setName method that accept a string named deviceName
  Item setProductName(String deviceName);

  // the definition of a public getName method that returns a String
  Item getProductName();

  // the definition of a public getManufacturer method that returns a String
  Item getManufacturer();

  // the definition of a public getSerialNumber method that returns an integer
  Item getSerialNumber();


}
