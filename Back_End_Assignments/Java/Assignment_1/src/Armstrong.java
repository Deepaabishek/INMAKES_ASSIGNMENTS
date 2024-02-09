import java.util.*;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int orginalNum = num;
        int power = String.valueOf(num).length();
        int sum = 0;

        while(num > 0){
            int rem = num % 10;
            sum += Math.pow((double)rem, (double)power);
            num /= 10;
        }
        String ans = orginalNum==sum ? "The given "+orginalNum+" is armstrong number" : "The given "+orginalNum+" is not a armstrong number";
        System.out.println(ans);
        input.close();
    }
}
