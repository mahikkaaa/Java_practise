import java.util.Scanner;
class check_perc
{
     public static void main(String args[])     
     {
        float perc;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter your percentage : ");
        perc=obj.nextFloat();
        if(perc>=50)
        { 
           System.out.println("you are pass");
        }
        else
        {
           System.out.println("you are fail");
        }
     }   





}