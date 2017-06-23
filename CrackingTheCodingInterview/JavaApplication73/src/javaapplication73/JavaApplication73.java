/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication73;
import java.io.*;
import java.util.StringTokenizer;
import javax.rmi.CORBA.Util;

/**
 *
 * @author islamkamilov
 */
public class JavaApplication73 {

    /**
     * @param args the command line arguments
     */
  
//How to convert a String to an Integer
     int x = Integer.parseInt(String) ;

//Putting it altogether:
      public static void main(String [] args)
      {
 Student lab2 [] = new Student[40];
 //Populate the student array
 lab2 = Util.readFile("filename.txt", lab2); 
 Statistics statlab2 = new Statistics();
 statlab2.findlow(lab2); 
 //add calls to findhigh and find average
 //Print the data and statistics
      } 
}
    

