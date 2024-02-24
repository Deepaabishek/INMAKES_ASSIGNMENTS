public class PrimeNumbers {
    public static void main(String[] args) {
        int number = 2;
        System.out.print("First fifty prime numbers: ");
        for (int i = 1; i <= 50;) {
            if (isPrime(number)) {
                System.out.print(number + " ");
                i++;
            }
            number++;
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
