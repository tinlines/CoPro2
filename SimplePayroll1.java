import java.util.Scanner;
class SimplePayroll1 {
	
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       // Employee names = new SimplePayroll.Employee();
        System.out.println("Enter name:");
        String name = s.nextLine();;
        System.out.println("Press F for Full Time or P for Part Time:");
        char time = s.next().charAt(0);
        switch(time){
        case 'F':
        	FullTimeEmployee f = new FullTimeEmployee();
            f.getMothlySalary();
           System.out.println("Enter rate per hour and no. of hours worked separeted by space:");
           f.ratePerHour = s.nextDouble();
           f.hoursWorked = s.nextInt();
           //wage = (ratePerHour * hoursWorked);
           double monthlySalary = f.ratePerHour * f.hoursWorked;
           System.out.println("Name: " + name);
           System.out.printf("Wage: 5.2f", monthlySalary);
           break;
       case 'P':
    	   PartTimeEmployee p = new PartTimeEmployee();
    	   System.out.println("Enter rate per hour and no. of hours worked separeted by space:");
           p.ratePerHour = s.nextDouble();
           p.hoursWorked = s.nextInt();
           //wage = (ratePerHour * hoursWorked);
           double wage = p.ratePerHour * p.hoursWorked;
           System.out.println("Name: " + name);
           System.out.printf("Wage: 5.2f", wage);
           break;
   }
        
}
class Employee {
	private String name;
	public void setName(String newName){
		this.name = newName;
		}
	public String getName(){
		return name;
		}
}
class FullTimeEmployee extends Employee{
	private double monthlySalary, ratePerHour;
    private int hoursWorked;
    public void setMonthlySalary(double newRatePerHour, int newHourWorked){
        this.ratePerHour = newRatePerHour;
        this.hoursWorked = newHourWorked;      
    }
    public double getMothlySalary(){
        this.monthlySalary = ratePerHour * hoursWorked;
        return monthlySalary;
    }
}
class PartTimeEmployee extends Employee{
	private int hoursWorked;
	private double ratePerHour, wage;
	public void setWage(int newHourWorked, double newRatePerHour){
	       this.hoursWorked = newHourWorked;
	       this.ratePerHour = newRatePerHour;
	   }
	public double getWage(){
	       wage = ratePerHour * hoursWorked;
	       return wage;
	   }
	}
}



