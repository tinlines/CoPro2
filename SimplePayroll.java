import java.util.Scanner;

public class SimplePayroll {
   //blic 
   private static String name;
   private static double monthlySalary, ratePerHour, wage;
   private static int hoursWorked;
   
   public void setName(String newName){
       name = newName;
   }
   public void setMonthlySalary(double newRatePerHour, int newHourWorked){
       ratePerHour = newRatePerHour;
       hoursWorked = newHourWorked;
       
   }
   public void setWage(double newWage){
       wage = newWage;
   }
   public String getName(){
       return name;
   }
   public double getMothlySalary(){
       monthlySalary = ratePerHour * hoursWorked;
       return monthlySalary;
   }
   public double getWage(){
       wage = ratePerHour * hoursWorked;
       return wage;
   }
    
   public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       SimplePayroll p = new SimplePayroll();
       System.out.println("Enter name:");
       name = s.nextLine();
       System.out.println("Press F for Full Time or P for Part Time:");
       char time = s.next().charAt(0);
       switch(time){
           case 'P':
               System.out.println("Enter rate per hour and no. of hours worked separeted by space:");
               ratePerHour = s.nextDouble();
               hoursWorked = s.nextInt();
               System.out.println("Wage: " + p.getWage());
               break;
           case 'F':
               System.out.println("Enter rate per hour and no. of hours worked separeted by space:");
               ratePerHour = s.nextDouble();
               hoursWorked = s.nextInt();
               System.out.printf("Wage: %.2f", p.getMothlySalary());
               break;
       }
    }
    
}
