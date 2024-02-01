import java.util.Scanner;

public class Pattern_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        for(int row = 1; row <= num; row++){
            for(int col = 1; col <= (num-row)+1; col++){
                    System.out.print(col+" ");
                }
                     System.out.println();
        }
        input.close();
    }
}

