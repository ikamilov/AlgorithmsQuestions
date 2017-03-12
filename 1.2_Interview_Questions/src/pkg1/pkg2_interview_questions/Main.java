/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1.pkg2_interview_questions;
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
        String s1 = scan.nextLine();
        String s2 = scan.nextLine();
        System.out.println(permutation(s1,s2));
        
    }
    public static String sort(String s) {
        char[] content = s.toCharArray();
        java.util.Arrays.sort(content);
        return new String(content);
    }
    public static boolean permutation(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        return sort(s).equals(sort(t));
    }
}
   

