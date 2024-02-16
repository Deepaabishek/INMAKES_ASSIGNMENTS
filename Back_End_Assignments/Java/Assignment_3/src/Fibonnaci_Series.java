import java.util.Arrays;

public class Fibonnaci_Series {
    public static void main(String[] args) {
        String str = "   Hi How Are You   ".strip();
        System.out.println(str);
        System.out.println(str.replace(" ", ""));
        String[] words = str.split(" ");
        System.out.println(Arrays.toString(words));
        System.out.println(words[1]);
    }
}
