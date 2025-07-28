package bsit.pkg2a.obinuqe;

import java.util.Scanner;

public class OUTPUT2 {
    
     public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int number;
        
        System.out.print("Input Number: ");
        number = input.nextInt();
        
        if(number == 0){
            System.out.println("Inputted number is zero");
        }else if(number % 2 ==0){
            System.out.println(number+" is even");
        }else{
            System.out.println(number+" is odd");
        }
        
    }
    
}
