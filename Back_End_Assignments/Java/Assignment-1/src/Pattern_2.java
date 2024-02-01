import java.util.Scanner;

public class Pattern_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter a number: ");
        int num = input.nextInt();

        for(int row = 1; row < 2*num; row++){
                int totalspace = row > num ? row - num : num - row;
                for(int space = 1; space <= totalspace; space++){
                    System.out.print(" ");
                }
                int totalcol = row > num ? 2 * ((2 * num) - row) - 1 : (2 * row) - 1;
            for(int col = 1; col <= totalcol; col++){
                System.out.print("*");
            }
                System.out.println();
        }
        input.close();
    }
}
