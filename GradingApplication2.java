/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gradingapplication2;

/**
 *
 * @author Phelembe Phetolo
 */
import java.util.Scanner;

public class GradingApplication2 {

    public static void main(String[] args) {
        
       Scanner input=new Scanner(System.in);
       
        System.out.println("enter subject name");
        
        String subject=input.nextLine();
        
         System.out.println("enter the marks obtained");
         
         double marks=input.nextDouble();
         
          System.out.println("enter the total marks for the test");
          
           double totalMarks=input.nextDouble();
           
           double percentage=marks/totalMarks*100;
           
            if(percentage>=80&&percentage<=100){
             System.out.print("Level 7 outstanding achievement for"+subject);
             
            }else if(percentage>=70&&percentage<79){
                  System.out.println("Level 6 Meritorious achievement for "+subject);
                  
           }else if(percentage>=60&&percentage<69){
                  System.out.println("Level 5 Substantial achievement for "+subject);
                  
           }else if(percentage>=50&&percentage<59){
                  System.out.println("Level 4 Moderate achievement  for "+subject);
                  
           }else if(percentage>=40&&percentage<49){
                  System.out.println("Level 3 Adequate achievement for "+subject);
                  
           }else if(percentage>=30&&percentage<39){
               System.out.println("Level 2 Elementary achievement for "+subject);
    }
else {
    System.out.println("Level 1 Not achieved-Fail for "+subject);
}
    
    
              
           
    }
}
