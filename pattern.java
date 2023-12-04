import java.util.*;
public class pattern {
    public static int multiply(int c , int d){
     int product = c*d;
     return product;
    }
   public static void main(String[] args){
for(int line = 1; line<=7; line++){
   // one line
    for(int star=1;star<=line; star++){
        System.out.print(" * ");
    }
    System.out.println( );
}
// Call by value 
//swap-values exchange
int a = 5;
int b =10;
//swap
int temp = a;
a=b;
b=temp;
System.out.println("a= " + a);
System.out.println("b = " + b);
// find product of c & d 
int c = 3;
int d= 5;
int prod = multiply(c, d);
System.out.println("c*d = " + prod);



    }
}
