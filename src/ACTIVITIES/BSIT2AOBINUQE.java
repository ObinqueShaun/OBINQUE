package ACTIVITIES;

import java.util.Scanner;


public class BSIT2AOBINUQE {

    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        String name;
        int science, history, math, soc, arts;
        
 
        System.out.print("Enter Name: ");
            name = input.nextLine();

        System.out.print("Enter marks in Science: ");
            science = input.nextInt();

        System.out.print("Enter marks in History: ");
            history = input.nextInt();

        System.out.print("Enter marks in Math: ");
            math = input.nextInt();

        System.out.print("Enter marks in Soc: ");
            soc = input.nextInt();

        System.out.print("Enter marks in Arts: ");
            arts = input.nextInt();
        
            int marks = science + history + math + soc + arts;
        
        System.out.println("\nCriteria\nFail - Below 70\nPoor - 71 to 75\nFair - 76 to 80\nGood - 81 to 85\nVery Good - 86 to 90\nExcellent - 91 to 100");
        

            double total_percentage = marks / 5.00;
        
        System.out.println("\nName: "+name);
        System.out.println("Total Marks: "+marks);
        System.out.println("Total Percentage: "+total_percentage);
            
        if(total_percentage <71){
            System.out.println("Remarks: Fail");
        }else if(total_percentage <76){
            System.out.println("Remarks: Poor");
        }else if(total_percentage <81){
            System.out.println("Remarks: Fair");
        }else if(total_percentage <86){
            System.out.println("Remarks: Good");
        }else if(total_percentage <91){
            System.out.println("Remarks: Very Good");
        }else{
            System.out.println("Remaks: Excellent");
        }
        
    }
    
}
