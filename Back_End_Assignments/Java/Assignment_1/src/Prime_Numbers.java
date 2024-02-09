import java.util.Scanner;

public class Prime_Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number more than 1: ");
        int num = Math.abs(input.nextInt());
        if((num==1) || (num==0)){
            System.out.println("Enter a number more than 1");
        }
        else if(num==2){
            System.out.println("The given "+num+ " is a prime number");
        }
        else{
            String ans = isprime(num) ? "The given "+num+" is a prime number" : "The given "+num+" is not a prime number";
            System.out.println(ans);
        }
        input.close();
        }

        public static boolean isprime(int num){
            for (int i = 2; i <= Math.sqrt((double)num); i++) {
                if(num % i == 0){
                    return false;
                }   
            }
                    return true;
        }
        
        }
