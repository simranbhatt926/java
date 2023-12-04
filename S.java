
    import java.util.Scanner;
    public class S {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        /*int originalNumber = number;
        int reversedNumber = 0;

        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        if (originalNumber == reversedNumber) {
            System.out.println(originalNumber + " is a palindrome number.");
        } else {
            System.out.println(originalNumber + " is not a palindrome number.");
        }*/
        // Print al prime in a range 
        public static void primesInRange(int n) {
        for (int i = 2; i<=n; i++){
            if (isPrime(i)){ //true
            System.out.println(i+" ");
        }
        }
        System.out.println();
        }
        
    }
}

