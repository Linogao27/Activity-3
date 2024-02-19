/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication21;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class JavaApplication21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner scn = new Scanner (System.in);
    System.out.println("Enter Any word");
        String word = scn.nextLine ();
        
        System.out.println("Orginal word: " + word);
        
        String newWord = new StringBuilder (word).reverse().toString();
        
        System.out.println("Reversed Word: " + newWord);
    }
    
}
