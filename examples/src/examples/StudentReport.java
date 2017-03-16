/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examples;


import java.io.*;
import java.util.StringTokenizer;

class Student {
  private int SID;
  private int scores[] = new int[5];
  //write public get and set methods for
  //SID and scores
  //add methods to print values of instance variables.
}


class Statistics
{
  int [] lowscores = new int [5];
  int [] highscores = new int [5];
  float [] avgscores = new float [5];
  void findlow(Student [] a){
      //This method will find lowest score and store it in an array names lowscores
  }
 
  void findhigh(Student [] a){
      //This method will find highest score and store it in an array names highscores

  }

  void findavg(Student [] a){
       //This method will find avg score for each quiz and store it in an array names avgscores

  }
  //add methods to print values of instance variables.
}


class Util {
 static Student [] readFile(String filename, Student [] stu)
 {
 //Reads the file and builds student array.
 //Open the file using FileReader Object.
 //In a loop read a line using readLine method.
 //Tokenize each line using StringTokenizer Object
 //Each token is converted from String to Integer using parseInt method
 //Value is then saved in the right property of Student Object.
 


//Example references
//ReadSource.java -- shows how to work with readLine and FileReader
//How do you tokenize a String

     StringTokenizer st = new StringTokenizer("this is a test");
     while (st.hasMoreTokens()) {
         System.out.println(st.nextToken());
     }

//How to convert a String to an Integer
     int x = Integer.parseInt(String) ;

//Putting it altogether:
      public static void main(String [] args)
      {
 Student lab2 [] = new Student[40];
 //Populate the student array
 lab2 = Util.readFile("Data.txt", lab2) 
 Statistics statlab2 = new Statistics();
 statlab2.findlow(lab2); 
 //add calls to findhigh and find average
 //Print the data and statistics
      } 
	
       
   
    

