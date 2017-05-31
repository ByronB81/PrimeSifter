import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class PrimeSifterTest {

  @Test
  public void runSift_countToOne_ArrayList(){
    PrimeSifter testPrimeSifter = new PrimeSifter();
    List<Object> expectedOutput = new ArrayList<Object>();
    expectedOutput.add(1);
    assertEquals(expectedOutput, testPrimeSifter.runSift(1));
  }

  @Test
  public void runSift_countTo2_ArrayList(){
    PrimeSifter testPrimeSifter = new PrimeSifter();
    List<Object> expectedOutput = new ArrayList<Object>();
    expectedOutput.add(1);
    expectedOutput.add(2);
    assertEquals(expectedOutput, testPrimeSifter.runSift(2));
  }

  @Test
  public void runSift_primeSift2_ ArrayList

}
