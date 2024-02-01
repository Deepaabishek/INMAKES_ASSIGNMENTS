import java.util.Scanner;;

public class Average_Of_Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the count of the numbers: ");
        int count = input.nextInt();
        int sum = 0;
        for (int i = 1; i <= count; i++) {
            System.out.print("Enter num" + i + " ");
            int numi = input.nextInt();
            sum += numi;
        }
        float ans = findAverage(count, sum);
        System.out.println("The average of given numbers is: " + ans);
        input.close();
    }

    public static float findAverage(int count, int sum) {
        float average = sum / count;
        return average;
    }
}
