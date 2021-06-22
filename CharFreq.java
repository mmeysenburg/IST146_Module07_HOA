import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

/**
 * Class encapsulating methods to count character frequency in 
 * online text files.
 */
public class CharFreq {
  /** List of Strings containing all the lines of the input file. */
  private List<String> lines;

  /**
   * Construct the CharFreq object by reading the text from the specified
   * resource and placing the lines into a list.
   * 
   * @param resource String containing URL of the plaintext file to 
   * read in. 
   */
  public CharFreq(String resource) {
    try {
      // access the text from the Web
      URL url = new URL(resource);
      Scanner fileIn = new Scanner(url.openStream());

      // place the lines into a list
      lines = new LinkedList<>();
      while (fileIn.hasNextLine()) {
        lines.add(fileIn.nextLine().toUpperCase());
      }
    } catch (MalformedURLException mue) {
      System.err.println("Invalid file URL.");
    } catch (IOException ioe) {
      System.err.println("Cannot read from URL.");
    }
  }

  /**
   * Get a list of all the alphabetic characters in the text.
   *
   * @return List of all the alphabetic characters in the text, as uppercase
   *     letters.
   */
  private List<Character> getListOfCharacters() {
    List<Character> cList = new LinkedList<>();
    // TODO: Write a nested loop to do the following. 
    // Iterate through the list named lines. Iterate through
    // the characters in each string in lines, and add each character 
    // to cList if it is between 'A' and 'Z'. No other characters 
    // (puncutation, spaces, digits, etc.) should be added to cList.
    // Hint: use the String charAt() method -- see
    // https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html

    return cList;
  }

  /**
   * Get a map showing the number of times each character in the text occurs.
   *
   * @return Map<Character, Integer> where each value is the frequency of the
   * corresponding key.
   */
  public Map<Character, Integer> getCharacterFrequency() {
    // this gets a list of all the characters in the text; all are
    // uppercased
    List<Character> charList = getListOfCharacters();

    // see https://www.w3schools.com/java/java_hashmap.asp
    // TODO: create a TreeMap or HashMap with Character keys and
    // Integer values, named map


    // loop through each character...
    for (char c : charList) {
      // TODO: if c is already in the map, get its count, increase
      // by one, and put the new value back into the map. If c is
      // not in the map, put a value of 1 into the map


    }

    return map;
  }  
}