import java.util.Scanner;
class arithmetic_menu
{ 
       public static void main(String[] args)
       {     
            int choice, num1, num2;
            int result;
            Scanner obj=new Scanner(System.in);
            System.out.println("choose from the following - 1 for ADDITION, 2 for SUBSTRACTION, 3 for MULTIPLICATION, 4 for DIVISION");
            System.out.println("enter your choice : ");
            choice=obj.nextInt(); 
            if(choice>=1 && choice<=4)
            { 
                System.out.println("enter the first number");
                num1=obj.nextInt();
                System.out.println("enter the second number");
                num2=obj.nextInt();
                
                if(choice==1)
                {   
                    result=num1+num2;
                    System.out.println("Result is "+result);
                }
                else if(choice==2)
                {
                    result=num1-num2;
                    System.out.println("Result is "+result);
                }
                else if(choice==3)
                {     
                    result=num1*num2;
                    System.out.println("Result is "+result);
                }
                else if(choice==4)
                {    
                    result=num1/num2;
                    System.out.println("Result is "+result);
                }
             
             }
             else
             { 
                System.out.println("invalid choice");
             }
       }
}