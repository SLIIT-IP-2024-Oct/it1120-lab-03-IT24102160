import java.util.Scanner;

public class IT24102160Lab3Q1B {
   public static void main(String[] args) {

     Scanner scan = new Scanner(System.in);

     System.out.print("Enter the price of 1kg rice : ");
     int price_of_1kg_rice = scan.nextInt();

     System.out.print("Enter the number of kilograms you want to buy : ");
     int no_of_kilograms = scan.nextInt();

     System.out.println("\n"); //Move to the next line

     double total_amount = price_of_1kg_rice * no_of_kilograms;
     double discount = (total_amount *10)/100;
     double new_total_amount = total_amount - discount;


     System.out.print("The total amount with 10% discount is : " +new_total_amount);

     scan.close();

     }
}