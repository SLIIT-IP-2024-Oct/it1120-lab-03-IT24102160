import java.util.Scanner;

public class IT24102160Lab3Q2 {
   public static void main(String[] args) {

     Scanner scan = new Scanner(System.in);

     System.out.print("Enter the monthly salary : ");
     int monthly_salary=scan.nextInt();

     System.out.print("Enter the number of OT hours : ");
     int OT_hours =scan.nextInt();
     
     System.out.print("Enter the OT hourly rate : ");
     int OT_Hourly_Rate =scan.nextInt();

     int OT_Amount = OT_hours * OT_Hourly_Rate;
     double Total_Salary =monthly_salary + OT_Amount;

     System.out.print("\n"); //Move to the next line

     System.out.print("The total salary including OT is) : " +Total_Salary);

     scan.close();

     }
}