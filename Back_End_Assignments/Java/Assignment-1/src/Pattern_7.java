import java.util.Scanner;

public class Pattern_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char ch = 'A';
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        for(int row = 1; row <= num; row++){
            int totalspace = row - 1;
            for(int space = 1; space <= totalspace; space++){
                System.out.print(" ");
            }
            for(int col = 1; col <= (num - row) + 1; col++){
                System.out.print(ch+" ");
                ch++;
            }
                System.out.println();
                ch = 'A';
        }
        input.close();
    }
}
