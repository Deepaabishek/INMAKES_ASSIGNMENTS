import java.util.Scanner;

public class Pattern_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        for(int row = 1; row <= num; row++){
            int s = num - row;
            for(int space = 1; space <= s; space++){
                System.out.print(" ");
            }
            for(int col = 1; col <= (2 * row) - 1; col++){
                    System.out.print((num-row)+1);
                }
                     System.out.println();
        }
        input.close();
    }
}


