/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author akj_2
 */
public class displaySquareRoot {
    public static void displaySquareRoot(int max ) {
        
        for(int i=0 ;i<=max ;i+=2 )
        {
            System.out.printf("%d \t %.4f",i,Math.sqrt(i));
        }
    }
    public static void show ()
}
