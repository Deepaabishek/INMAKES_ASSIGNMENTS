import java.util.Scanner;

public class Pattern_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1 = 1;
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        for(int row = 1; row <= num; row++){
            for(int col = 1; col <= row; col++){
                System.out.print(num1+" ");
                num1++;
            }
                System.out.println();
        }
        input.close();
    }
}

