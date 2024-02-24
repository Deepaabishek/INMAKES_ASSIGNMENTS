import java.util.Scanner;

public class ReverseTheSentence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine().strip();
        System.out.println("Orginal Sentence: " + sentence);

        String[] arr = sentence.split(" ");
        String ans = reverseSentence(arr);

        System.out.print("Reversed Sentencs: " + ans);
        input.close();
    }

    public static String reverseSentence(String[] arr) {
        int start = 0;
        int end = arr.length - 1;
        StringBuilder build = new StringBuilder();

        while (start < end) {
            String temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        for (int i = 0; i < arr.length; i++) {
            build.append(arr[i]);
            if (i < arr.length - 1) {
                build.append(" ");
            }
        }

        return build.toString();
    }
}
