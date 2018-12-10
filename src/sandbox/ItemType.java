package sandbox;

//ItemType enum is used to distinguish items from each other by their functionality
public enum ItemType {
  AUDIO("AU"), VISUAL("VI"), AUDIO_MOBILE("AM"), VISUAL_MOBILE("VM");

  public final String code;

  ItemType(String code) {
    this.code = code;
  }
}