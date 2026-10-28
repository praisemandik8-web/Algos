import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;




public class MainTest {


    @Test
    public void testShortestWordFromSentence() {
        String sentence = "Play Station versus the Xbox";
        String expectedShortestWord = "the";
        String actualShortestWord = Main.shortestWordFromSentence(sentence);
        assertEquals(expectedShortestWord, actualShortestWord);
    }
}]  

    @Test
    public void testShortestWordFromSentenceWithMultipleShortestWords() {
        String sentence = "I am a cat";
        String expectedShortestWord = "I";
        String actualShortestWord = Main.shortestWordFromSentence(sentence);
        assertEquals(expectedShortestWord, actualShortestWord); 
    }


    @Test
    public void testSquareArrayAscending() {
        int[] inputArray = {-4, -1, 0, 3, 10};
        int[] expectedOutputArray = {0, 1, 9, 16, 100};
        int[] actualOutputArray = Main.squareArrayAscending(inputArray);
        assertArrayEquals(expectedOutputArray, actualOutputArray);
    }