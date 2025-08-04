package ACTIVITIES;

import java.util.Scanner;

public class ACTIVITY2 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Employee Name: ");
        String name = input.nextLine();
        System.out.print("Enter Hourly Rate: ");
        float hrate = input.nextFloat();
        System.out.print("Enter Total Hours Worked: ");
        int hours = input.nextInt();
        
        System.out.println("----Wage Summary----");
        System.out.println("Employee: "+name);
        System.out.printf("Hourly Rate: ₱%.2f\n", hrate);
        System.out.println("Hours Worked: "+hours);
        float weeklywage = hrate*hours;
        System.out.printf("Gross Weekly Wage: ₱%.2f\n", weeklywage);
        float sss = (float) (weeklywage * 0.1);
        System.out.printf("SSS Contribution(10%%): ₱%.2f\n", sss);
        System.out.println("-------------------------------------------");
        float netweekly = weeklywage - sss;
        System.out.printf("Net Weekly Wage: ₱%.2f\n", netweekly);
    }
    
}
