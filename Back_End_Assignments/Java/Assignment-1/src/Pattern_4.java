import java.util.Scanner;

public class Pattern_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        for(int row = 1; row < num; row++){
            for(int col = 1; col <= num; col++){
                if(row == 1 || row == num-1 || col == 1 || col == num){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        input.close();
    }
}
