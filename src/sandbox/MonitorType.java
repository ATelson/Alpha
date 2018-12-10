package sandbox;

//Enum used to distinguish between different types of monitors
public enum MonitorType {
  LCD("LCD"), LED("LED");

  public String code;

  MonitorType(String code) {
    this.code = code;
  }

}
