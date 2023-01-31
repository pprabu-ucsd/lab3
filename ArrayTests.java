import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {

  @Test
  public void testReverseInPlace() {
    int[] input1 = {1, 2, 3, 2, 1};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{1, 2, 3, 2, 1}, input1);
	}

  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }
  
  @Test
  public void testReversed2() {
    int[] input1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    assertArrayEquals(new int[]{ 9, 8, 7, 6, 5, 4, 3, 2, 1 }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testAverageWithoutLowest() {
    double[] input1 = { 2.0, 2.0, 3.0, 4.0};
    assertEquals(3.0, ArrayExamples.averageWithoutLowest(input1), 0.0);
  }

}
