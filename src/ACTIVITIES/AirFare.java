package ACTIVITIES;

import java.util.Scanner;

public class AirFare {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int economy = 250;
        int business = 500;
        System.out.print("Distance(km): ");
        int distance = input.nextInt();
        
        System.out.print("Class: ");
        int classes = input.nextInt();
        
        if(classes==1){
            

            if(distance >=1000){
                float totalfare = distance * economy;
                float discount = (float) (totalfare*0.1);
                float totaldiscount = totalfare - discount;
                System.out.printf("Total Fare: %.2f\n", totaldiscount);
            }else{
                float totalfare = distance * economy;
                System.out.printf("Total Fare: %.2f\n", totalfare);
            }
        }else if(classes==2){
            
            if(distance >1000){
                float totalfare2 = distance * business;
                float discount2 = (float) (totalfare2*0.1);
                float totaldiscount2 = totalfare2 - discount2;
                System.out.printf("Total Fare: %.2f\n", totaldiscount2);
            }else{
                float totalfare2 = distance * 500;
               System.out.printf("Total Fare: %.2f\n", totalfare2); 
            }
        }else{
            System.out.print("INVALID CLASS TYPE");
        }
        
    }
    
}
