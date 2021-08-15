import java.util.Scanner;
class area_menu
{ 
       public static void main(String[] args)
       {     
            double choice, radius, base, height, length, breadth;
            double result;
            Scanner obj=new Scanner(System.in);
            System.out.println("for circle press 1, for triangle press 2, for rectangle press 3");
            System.out.println("enter your choice : ");
            choice=obj.nextDouble();
            if(choice>=1 && choice<=3)
            {
               if(choice==1)
                {   
                    System.out.println("enter the radius");
                    radius=obj.nextDouble();
                    result=3.14*radius*radius;
                    System.out.println("area of circle is "+result);
                }
               if(choice==2)
                {   
                    System.out.println("enter the base");
                    base=obj.nextDouble();
                    System.out.println("enter the height");
                    height=obj.nextDouble();
                    result=0.5*base*height;
                    System.out.println("area of triangle is "+result);
                }
               else if(choice==3)
                {   
                    System.out.println("enter the length");
                    length=obj.nextDouble();
                    System.out.println("enter the breadth");
                    breadth=obj.nextDouble();
                    result=length*breadth;
                    System.out.println("area of rectangle is "+result);
                }
           }
           else
           {
                System.out.println("invalid choice");
           }
      }
}