/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tla003;

/**
 *
 * @author Student's Account
 */
import java.util.*;

public class TLA003 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        Stack<String> stack = new Stack<>();

        System.out.print("How many words in your sentence? ");
        int number = scan.nextInt();

        System.out.println("Enter the words one by one:");
        for (int i = 0; i < number; i++) {
            String words = scan.next();
            stack.push(words);
        }

        System.out.print("Output: ");
        for (int i = 0; i < number; i++) {
            System.out.print(stack.pop());
            if (i < number - 1) {
                System.out.print(" ");
            }
        }
    }
}