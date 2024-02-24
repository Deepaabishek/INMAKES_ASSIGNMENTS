import java.util.*;

public class WordOccurrence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Sentence: ");
        String str = input.nextLine().toLowerCase();

        String[] arr = str.split(" ");

        HashMap<String, Integer> map = wordCount(arr);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " occurs " + entry.getValue());
        }
        input.close();
    }

    public static HashMap<String, Integer> wordCount(String[] arr) {
        HashMap<String, Integer> map = new HashMap<>();

        for (String word : arr) {
            if (map.containsKey(word)) {
                int count = map.get(word);
                map.put(word, count + 1);
            } else {
                map.put(word, 1);
            }
        }

        return map;
    }
}
