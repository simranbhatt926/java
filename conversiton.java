import java.util.*;
public class conversiton {
    public static void main(String args[]) {
        int a = 25;
        long b = a;
        System.out.println(b);
        Scanner sc = new Scanner(System.in);
        //float number = sc.nextInt();
       // System.out.println(number);
float c = 28.12f;// type casting
int d = (int)c;
System.out.println(d);

char ch = 'e';
int number = ch;
System.out.println(number);

char g = 'g';
char h = 'h';
System.out.println((int)(h));
System.out.println((int)(g));
System.out.println(h-g);
short A = 5;
byte B = 24;
char C = 'c';
byte bt = (byte)(A+B+C);
System.out.println(bt);
    }
}


