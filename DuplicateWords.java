import java.util.HashMap;

public class DuplicateWords {

    public static void findDuplicates(String str) {

        String[] words = str.toLowerCase().split(" ");
        HashMap<String, Integer> map = new HashMap<>();

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        for (String key : map.keySet()) {
            if (map.get(key) > 1) {
                System.out.println(key + ": " + map.get(key));
            }
        }
    }

    public static void main(String[] args) {
        String str = "Java is great and Java is powerful";
        findDuplicates(str);
    }
}
