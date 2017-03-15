/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication71;
import java.util.Scanner;
/**
 *
 * @author islamkamilov
 */
public class reverse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner scan = new Scanner(System.in);
       String n = scan.nextLine();
     
       char m[] = n.toCharArray();
       int left, right = 0;
       right = n.length()-1;
       for(left = 0; left < right; left++, right--) {
           char temp = m[left];
           m[left]=m[right];
           m[right]=temp;
       }
       System.out.println(m);
       
    }
}
