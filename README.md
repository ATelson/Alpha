# Alpha

Version: 1.0.1
Author: Allen Telson

Program Description:  This program is designed to imitate a production line for multimedia devices
which include music or movie players. It serves as a template  for creating and recording future production line items.
It contains a flexible structure necessary to provide use in any production line that can easily be modified to handle
different products.

Program Contents:

Interface: Item.java

  - MANUFACTURER  : String

  + setProductionNumber(productionNumber  : int)
  + setProductName(deviceName : String)
  + getProductName()
  + getManufacturer()
  + getSerialNumber()


Interface: MutlimediaControl.java

  + MultimediaControl()
      + play()
      + stop()
      + previous()
      + next()
      

abstract: Product.java implements Item


  - serialNumber  : int
  - manufacturer  : String
  - manufacturedOn  : Date
  - productName : String
  - currentProductionNumber  : int
  - date :  java.util.Date()
  
  + setProductionNumber(productionNumber  : int)
  + setProductName(deviceName : String)
  + getProductName()
  + getManufacturer()
  + getSerialNumber()
  + Product(deviceName  : String)
  + toString()

Enum: ItemType.java
  
  - ItemType  : enum
  
  
Class:  TypeTest.java
  
  - type  : ItemType
  
  + typeTest(type : ItemType)
  + displayItemTypes()
  
Class:  Main.java

  + main(args : String)
