/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shahrizmalek
 */
import java.util.Scanner; 

public class Palindrome {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a palindromic number:");
        
        int palin = input.nextInt();
        System.out.println("here is / " + palin / 100); // This is for me to understand math behind 
        
        System.out.println("here is % " + palin % 10); // This is for me to understand the math 
        
        if (palin % 10 == palin / 100){ // Checks for the remainder for the 1st digit and to check the divide by a 100
            System.out.println(palin + " is palindrome number");
        } 
        else {
            System.out.println(palin + " is not a palindrome number");
        }
        
    }
}
