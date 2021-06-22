import java.util.*;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test class for the CharFreq class.
 */
public class CharFreqTest {

  @Before
  public void setUp() throws Exception {
  }

  @After
  public void tearDown() throws Exception {

  }

  @Test
  public void testGetCharacterFrequency() {
    CharFreq cf = new CharFreq("https://raw.githubusercontent.com/" + 
      "mmeysenburg/IST146_Module07_HOA/main/test.txt");

    Map<Character, Integer> map = cf.getCharacterFrequency();

    // make sure all the counts are correct
    for(int i = 0; i < 26; i++) {
      char c = (char)('A' + i);
      int expected = map.get(c);
      assertEquals(5000, expected);
    }

    // make sure there's nothing else in the map
    Set<Character> aToZ = new TreeSet<>();
    for(int i = 0; i < 26; i++) {
      char c = (char)('A' + i);
      aToZ.add(c);
    }
    for(char c : map.keySet()) {
      assertEquals(true, aToZ.contains(c));
    }
    
  }

  /**
   * Test launcher.
   *
   * @param args Command-line arguments; ignored by 
   * this application
   */
  public static void main(String[] args) {
    org.junit.runner.JUnitCore.main("CharFreqTest");
  }
}