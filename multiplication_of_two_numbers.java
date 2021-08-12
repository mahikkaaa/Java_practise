import java.util.Scanner;
public class multiplication_of_two_numbers
{
    public static void main(String[] args)
    {
         int num1, num2, result;
         Scanner obj=new Scanner(System.in);
         System.out.println("enter first number : ");
         num1=obj.nextInt();
         System.out.println("enter second number : ");
         num2=obj.nextInt();
         result=num1*num2;
         System.out.println("multiplication of two numbers is "+result);
    }
}  