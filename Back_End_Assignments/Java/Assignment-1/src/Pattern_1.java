import java.util.Scanner;

public class Pattern_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        for(int row = 1; row <= num; row++){
            int spaces = row - 1;
            for(int space = 1; space <= spaces; space++){
                    System.out.print(" ");
            }
            for(int col = 1; col <= (num-row)+1; col++){
                    System.out.print("* ");
                }
                     System.out.println();
        }
        input.close();
    }
}
