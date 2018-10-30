/***************************************************************************************************
 * Author: Allen Telson
 * File: Enum ItemType.java
 * Date: 10/01/2018
 * Description: The enum ItemTpye is currently used to represent data types needed to provide
 * types of products.
 **************************************************************************************************/

package sandbox;

public enum ItemType {
AUDIO ("AU") , VISUAL ("VI") , AUDIO_MOBILE ("AM") , VISUAL_MOBILE ("VM");

public final String code;
  ItemType(String code) {
    this.code = code;
  }
}