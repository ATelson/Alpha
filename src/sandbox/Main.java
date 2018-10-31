package sandbox;


import java.util.ArrayList;
import java.util.Collections;


public class Main {

  public static void main(String[] args) {

    // Write one line of code to create an ArrayList of products
    ArrayList<Product> productArrayList;

    // Write one line of code to call testCollection and assign the result to the ArrayList
    productArrayList = testCollection();

// Write one line of code to sort the ArrayList
    Collections.sort(productArrayList);

    // Call the print method on the ArrayList
    print(productArrayList);
  }

  // Step 15
  // Complete the header for the testCollection method here

  private static ArrayList<Product> testCollection() {

    AudioPlayer a1 = new AudioPlayer("iPod Mini", "MP3");
    AudioPlayer a2 = new AudioPlayer("Walkman", "WAV");
    MoviePlayer m1 = new MoviePlayer("DBPOWER MK101",
        new Screen("720x480", 40, 22), MonitorType.LCD);
    MoviePlayer m2 = new MoviePlayer("Pyle PDV156BK",
        new Screen("1366x768", 40, 22), MonitorType.LED);

    // Write one line of code here to create the collection
    ArrayList<Product> products = new ArrayList<>();

    products.add(a1);
    products.add(a2);
    products.add(m1);
    products.add(m2);
    return products;
  }

  // Step 16
  // Create print method here
  private static <E> void print(ArrayList<E> productList) {
    for (E p :
        productList) {
      System.out.println(p);
    }

  }

}
