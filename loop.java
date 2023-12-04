import java.util.*;
public class loop {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
       /*  int counter = 0;
        while(counter <100){
            System.out.println("Hello world");
            counter++;
        }
        System.out.println("printed HW 10x"); */
int counter = 1;
while(counter <=10){
    System.out.println(counter);
    counter++;
}
System.out.println();
int n = sc.nextInt();
int sum = 0;
int i = 1;
while (i<=n) {
    sum += i;
    i++;
    
}
System.out.println("Sum is : " + sum);
//Print SQUARE pattern
for (int line=1; line<=4; line++){
    System.out.println("****");
}
int line =1;
while(line<=4){
    System.out.println("* * * * ");
    line++;
}
// Print  Reverse of a  Number
int m = 10899;
while (m > 0){
int lastDigit = m%10;
System.out.print(lastDigit + " ");
m = m/10;
}
System.out.println();
//Reverse the given number
int j =10899;
int rev = 0;
while(j>0){
    int lastDigit=j%10;
    rev =(rev*10) + lastDigit;
    j = j/10;
}
System.out.println(rev);
// do while loop
int cunter= 1;
do{
    System.out.println("Heloo");
    cunter++;
}
while(cunter<=10);

// break Statement
for(int I = 1;I<5; I++){
    if(I==3){
        break;
    }
    System.out.println(I);
}
System.out.println("I am not of the loop"); 
do{
    System.out.println("Enter your number : ");
    int o =sc.nextInt();
    if (o%10==0){
        break;
    }
    System.out.println(o);
}
while(true);
//Continue statement to skip an iteration
for(j=0;j<=5;j++){
    if(j==3){
        continue;
    }
    System.out.println(j);
}
// check if a number is prime or not
//prime 2,3,5,7,11
int l = sc.nextInt();
if (l==2){
    System.out.println("l is prime");
} else{
boolean isPrime = true;
for(int t=2;t<=l-1;t++){
    if(l% t==0){
        //l is a multiple of t (t not eqal to 1 r n-1)
        isPrime=false;
    }
}
if(isPrime==true){
    System.out.println("l is prime");
}
else{
    System.out.println("l is not prime");
}
}
int num;
int fact=1;
System.out.println("Enter any postive integer: ");
num = sc.nextInt();
for (int k=1; k<=num; k++){
    fact *=k;
}
System.out.println("Factorial: " + fact);

    }
}
