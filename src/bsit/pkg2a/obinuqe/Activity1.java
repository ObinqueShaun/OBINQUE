package bsit.pkg2a.obinuqe;

import java.util.Scanner;

public class Activity1 {
    
      public static void main(String[] args) {
          
     Scanner input = new Scanner(System.in);
     
     String name;
     int subjects, grade;
     float sum=0;
     float average=0;
     
     System.out.print("Enter Student Name: ");
     name = input.nextLine();
     
     System.out.print("Enter number of subjects: ");
     subjects = input.nextInt();
     
        for(int x =1; x<=subjects; x++){
            
            System.out.print("Enter grade for sub"+x+":");
            grade = input.nextInt();
            
            sum = sum + grade;
            
        }
    average = sum/sum;
    
    if(average>=92.33){
        System.out.print("Remarks: PASSED");
    }else{
        System.out.println("Remarks: FAILED");
    }
      }
    
}
