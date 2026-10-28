import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // List<Integer> ages = new ArrayList<>();
        // ages.add(25);
        // ages.add(30);
        // ages.add(35);
        // System.out.println("Ages: " + ages);

        // String[] names = new String[3];
        // names[0] = "Ada";
        // names[1] = "Tunde";
        // names[2] = "Zainab";
        // System.out.println(names.length);

        // List<String> list = new ArrayList<>(List.of("a", "b", "c", "d"));
        // try {
        //     for (String s : list) {
        //         if (s.equals("b")) {
        //             list.remove(s);
        //         }
        //     }
        // } catch (Exception e) {
        //     System.out.println("Error: " + e.getMessage());
        // }

        // System.out.println(list);

       String shortestWord = shortestWordFromSentence("Shola is a student at Semicolon Africa ");
       String shortestWord2 = shortestWordFromSentence("Peter Parker picked three pecks of pickled peppers");
       System.out.println("Shortest word: " + shortestWord);
       System.out.println("Shortest word 2: " + shortestWord2);
        int [] squaredArray = (new int[]{-4, -1, 0, 3, 10});

        squaredArray = squareArrayAscending(squaredArray);
        System.out.println("Squared array in ascending order: " + Arrays.toString(squaredArray));

    }

    public static String shortestWordFromSentence(String sentence) {
        String[] words = sentence.split(" ");
        String shortestWord = words[0];

        for(int word = 0; word < words.length; word++) {
            if (words[word].length() < shortestWord.length()) {
                shortestWord = words[word];
            }
        }
        
        return shortestWord;
    }

    public static int[] squareArrayAscending(int[] arr) {
        int n = arr.length;
        int[] squaredArr = new int[n];

        for (int i = 0; i < n; i++) {
            squaredArr[i] = arr[i] * arr[i];
        }

        Arrays.sort(squaredArr);

        return squaredArr;
    }

}
