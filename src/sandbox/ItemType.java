package sandbox;

public enum ItemType {
  AU, VI, AM, VM
}

class TypeTest {

  ItemType type;

  TypeTest(ItemType type) {
    this.type = type;
  }

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

      default:
        System.out.println("Unkown Type");
        break;
    }
  }
}
