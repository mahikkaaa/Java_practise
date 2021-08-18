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
public class for_loop_demo 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int i;
        for(i=1; i<=10;i++)
        {
            System.out.println(i);
        }
    

        for(i=10; i>=1;i--)
        {
            System.out.println(i);
        }
    
        for(i=1; i<=10;i+=2)
        {
            System.out.println(i);
        }
        
        for(i=0; i<=10;i+=2)
        {
            System.out.println(i);
        }
    }
    
}