import java.util.Scanner;

class swapping{
public static void main(String agrs[])
{
int temp;
Scanner sc=new Scanner(System.in);
System.out.println("enter the first number");
int num1=sc.nextInt();
System.out.println("enter the second number to be swapped with first number");
int num2=sc.nextInt();

System.out.println("numbers before swapping");
System.out.println("num1:"+" "+num1);
System.out.println("num2:"+" "+num2);

System.out.println("numbers after swapping");
temp=num1;
num1=num2;
num2=temp;
System.out.println("num1:"+" "+num1);
System.out.println("num2:"+" "+num2);
 
}
}