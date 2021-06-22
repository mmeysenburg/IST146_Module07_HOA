import java.util.*;

/**
 * IST 146 HOA 6 - Character Frequency for text files.
 */
public class Main {
  /**
   * Application entry point.
   *
   * @param args Command line arguments; ignored by this application.
   */
  public static void main(String[] args) {
    CharFreq cf = new CharFreq("https://raw.githubusercontent.com/" + 
      "mmeysenburg/IST146_Module07_HOA/main/wells.txt");

    // once we have the map, convert to an array and then sort in
    // decreasing value by count
    Map.Entry<Character, Integer>[] pairs = new Map.Entry[26];
    pairs = cf.getCharacterFrequency().entrySet().toArray(pairs);

    Arrays.sort(pairs, 0, pairs.length,
                (x, y) -> y.getValue().compareTo(x.getValue()));

    // display the results
    for (Map.Entry<Character, Integer> p : pairs) {
      System.out.println(p.getKey() + ": " + p.getValue());
    }
  }
}
