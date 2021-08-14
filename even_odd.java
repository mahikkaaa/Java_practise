import java.util.Scanner;
class even_odd
{
    public static void main(String[] args)
    {
        int num;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter any number : ");
        num=obj.nextInt();
        if(num%2==0)
        {
          System.out.println("number is even");  
        }
        else 
        { 
           System.out.println("number is odd");
        }
    }
}