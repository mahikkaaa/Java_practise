import java.util.Scanner;
class percentage_grade
{
    public static void main(String[] args)
    {
       Float perc;
       Scanner obj=new Scanner(System.in);
       System.out.println("enter your percentage : ");
       perc=obj.nextFloat();
       if(perc<=100 || perc>=90)
       { 
           System.out.println("A1");
       }
       else if(perc<=90 || perc>=80)
       { 
           System.out.println("A2");
       }
       else if(perc<=80 || perc>=70)
       { 
           System.out.println("B1");
       }
       else if(perc<=70 || perc>=60)
       { 
           System.out.println("B2");
       }
       else if(perc<=60 || perc>=50)
       { 
           System.out.println("C");
       }
       else if(perc<=50)
       { 
           System.out.println("NEED IMPROVEMENT");
       }
       else
       {
           System.out.println("try re-entering the grade!");
       }
    }
}