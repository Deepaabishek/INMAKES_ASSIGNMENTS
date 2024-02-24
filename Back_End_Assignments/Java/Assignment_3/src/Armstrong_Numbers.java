public class Armstrong_Numbers {
    public static void main(String[] args) {
        System.out.print("Three digit armstrongs: ");
        for (int i = 100; i <= 999; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
        System.out.print("Four digit armstrongs: ");
        for (int i = 1000; i <= 9999; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
        System.out.print("Five digit armstrongs: ");
        for (int i = 10000; i <= 99999; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isArmstrong(int num) {
        int orginalnum = num;
        int sum = 0;
        int power = String.valueOf(num).length();

        while (num != 0) {
            int rem = num % 10;
            sum += Math.pow(rem, power);
            num /= 10;
        }

        return sum == orginalnum;
    }
}
