import java.util.HashMap;

public class MostRepeatedWord {

    public static void findMostRepeated(String str) {

        str = str.toLowerCase().replaceAll("[^a-z ]", " ");

        String[] words = str.split("\\s+");

        HashMap<String, Integer> map = new HashMap<>();

        // Count frequency
        for (String word : words) {

            if (!word.isEmpty()) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }

        // Find max
        String maxWord = "";
        int maxCount = 0;

        for (String word : map.keySet()) {

            if (map.get(word) > maxCount) {
                maxWord = word;
                maxCount = map.get(word);
            }
        }

        System.out.println("Most Repeated Word: " + maxWord);
        System.out.println("Frequency: " + maxCount);
    }

    public static void main(String[] args) {

        String str = "Java is great and Java is powerful and Java is fast";

        findMostRepeated(str);
    }
}
