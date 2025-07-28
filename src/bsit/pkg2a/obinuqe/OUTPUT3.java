package bsit.pkg2a.obinuqe;

import java.util.Scanner;

public class OUTPUT3 {
    
  public static void main(String[] args) {
      
  Scanner input = new Scanner(System.in);
        
        int number;
        
        System.out.print("Input Number: ");
        number = input.nextInt();
        
        if(number >=1){
            System.out.println(number+" is a positive number");
        }else if(number ==0){
            System.out.println("Inputted number zero");
        }else{
            System.out.println(number+" is a negative number");
        }
        
    }

}
