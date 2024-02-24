import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class example {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put(input.nextLine(), null);
        }
        Set<String> keys = map.keySet();
        for (String str : keys) {
            int count = map.get(str);
            map.put(str, count);
        }

        System.out.println(map);
    }
}
