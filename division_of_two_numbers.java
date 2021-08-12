import java.util.Scanner;
public class division_of_two_numbers
{
    public static void main(String[] args)
    {
        float num1, num2, quotient, remainder;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter first number : ");
        num1=obj.nextInt();
        System.out.println("enter second number : ");
        num2=obj.nextInt();
        quotient=num1/num2;
        remainder=num1%num2;
        System.out.println("quotient is "+quotient);
        System.out.println("remainder is "+remainder);
    }
}