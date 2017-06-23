/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1.pkg4_interview_questions;
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
        String s = scan.nextLine();
        
        System.out.println(isPermutationOfPalindrome(s));
       
    }
    public static boolean isPermutationOfPalindrome(String phrase) {
        int countOdd = 0;
        int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
        for(char c : phrase.toCharArray()) {
            int x;
            x = getCharNumber(c);
            if(x!= -1) {
                table[x]++;
                if(table[x]%2 == 1) {
                    countOdd++;
                }else {
                    countOdd--;
                }
            }
        }
        return countOdd <= 1;
    }

    
     
}
