import java.util.Scanner;
public class substraction_of_two_numbers
{
     public static void main(String[] args)
     {
          int num1, num2, result;
          Scanner obj=new Scanner(System.in);
          System.out.println("enter first number : ");
          num1=obj.nextInt();
          System.out.println("enter second number : ");
          num2=obj.nextInt();
          result=num2-num1;
          System.out.println("substraction of two numbers is "+result);
     }
}