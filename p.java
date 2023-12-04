import java.util.Scanner;
public class p {
        public static boolean isPrime(int n){
            if (n==2){
                return true;
            }
            for (int i =2; i<Math.sqrt(n); i++){
                if(n%i == 0){
                    return false;
                }
            }
            return true;


        }
        public static void primesInRange(int n){
            for(int i =2; i<=n; i++){
                if(isPrime(i)) {//true
    System.out.print(i+" ");
                }
            }
            System.out.println();
        }
        public static void main(String[] args) {
           primesInRange(7); //2 to 20
   // public static void main(String[]args){
       /* Scanner sc = new Scanner(System.in);
            int p= sc.nextInt();
            if (p==2)
            {
                System.out.println("P is Prime Number :");
            }
            else
        {
            boolean isPrime=true;
            for(int i=2;i<=p-1;i++){
                isPrime=false;
            }
            if(isPrime==false)
            {
                System.out.println("P is prime :");
            }
           else {
                System.out.println("P is not prime number :");
            }
        }
        //pattern
        */
    System.out.println(isPrime(7));

        
    }}
