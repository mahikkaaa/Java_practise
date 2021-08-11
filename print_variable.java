//program to print variables in java 
import java.util.Scanner;
class print_variable
{  
   public static void main(String args[])
   {
       int rollno;
       String name;
       double perc;
       char grade;
       Scanner obj=new Scanner(System.in);
       System.out.println("Enter roll number ");
       rollno=obj.nextInt();
       System.out.println("Enter name ");
       name=obj.next();       
       System.out.println("Enter percentage ");
       perc=obj.nextDouble();
       //System.out.println("Enter grade ");
       //grade=obj.nextChar();

       System.out.println("printing details of student : ");
       System.out.println(" roll number is "+rollno);
       System.out.println("name is "+name);
       System.out.println("percentage is "+perc);
       //System.out.println("grade is "+grade);
    }
}


