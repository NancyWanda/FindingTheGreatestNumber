/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author mbuya
 */
public class JavaApplication3 {

     static int biggestOfThree(int x, int y, int z)
    {
  
        return z > (x > y ? x : y) ? z : ((x > y) ? x : y);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        // Declaring variables for 3 numbers
        int a, b, c;
  
        // Variable holding the lagest number
        int largest;
        a = 5;
        b = 10;
        c = 3;
        // Calling the above function in main
        largest = biggestOfThree(a, b, c);
  
        // Printing the largest number
        System.out.println(largest + " is the largest number.");
        
    }
    
}
