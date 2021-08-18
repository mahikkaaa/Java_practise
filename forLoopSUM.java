/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mahika.cj;

import java.util.Scanner;

/**
 *
 * @author Mahika Agrawal
 */
public class forLoopSUM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
        int n, num, sum=0;
        Scanner scan=new Scanner(System.in);
        
        System.out.println("for how many numbers do you want to find the sum?");
        n=scan.nextInt();
        for(int i=1; i<=n; i++)
        {
          System.out.println("enter number "+i);
          num=scan.nextInt();
          sum=sum+num;
        }
        System.out.println("the sum is " +sum);
    }

    
    }
    

