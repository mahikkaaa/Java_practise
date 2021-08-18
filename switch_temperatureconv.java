/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mahika.cj;

/**
 *
 * @author Mahika Agrawal
 */
import java.util.Scanner;
public class switch_temperatureconv {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int choice;
        float Temp_f, Temp_c;
        Scanner scan=new Scanner(System.in);
        
        System.out.println(" enter your choice : "
                + "\n 1. celcius to fahrenheit"
                + "\n 2. fahrenheit to celsius");
        choice=scan.nextInt();
        
        switch(choice){
            case 1:
                System.out.println("welcome to celcius to fahrenheit");
                System.out.println("enter temperature in celsius : ");
                Temp_c=scan.nextFloat();
                Temp_f=(Temp_c*9/5)+32;
                System.out.println("temperature in fahrenheit is :"+Temp_f);
                break;
           case 2:
                System.out.println("welcome to fahrenheit to celcius ");
                System.out.println("enter temperature in fahrenheit : ");
                Temp_f=scan.nextFloat();
                Temp_c=(Temp_f-32)*5/9;
                System.out.println("temperature in celsius :"+Temp_c);     
                break;
        
    }
            
    }
    
}
