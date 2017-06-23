/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1.pkg3_interview_questions;
import java.util.Scanner;

/**
 *
 * @author islamkamilov
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        String n = scan.next();
        char[] s = n.toCharArray();
        int [] l = n.length();
        
        System.out.println(s + " " + l);
    }
    public static void replaceSpaces(char[] str, int length) {
        int spaceCount = 0, newLength, i;
        for(i=0; i<length; i++) {
            if(str[i] == ' ') {
                spaceCount++;
            }
        newLength = length + spaceCount*2;
        for(i=length-1; i>=0; i++) {
            if(str[i] == ' ') {
                str[newLength-1] = '0';
                str[newLength-2] = '2';
                str[newLength-3] = '%';
                newLength = newLength-3;
            }
            else {
                str[newLength-1] = str[i];
                newLength=newLength-1;
            }
        }
        
        }
        
    }
    
}
