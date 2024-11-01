import java.util.Scanner;

public class IT24102160Lab3Q4 {
   
   public static void main(String[] args) {

     Scanner scan = new Scanner(System.in);

     System.out.print("Enter a five-digit-number : ");
     int five_digit_number = scan.nextInt();

     System.out.print("\n"); //Move to the next line

     System.out.print("digit1 : ");
     int digit1 = scan.nextInt();

     System.out.print("digit2 : ");
     int digit2 = scan.nextInt();

     System.out.print("digit3 : ");
     int digit3 = scan.nextInt();

     System.out.print("digit4 : ");
     int digit4 = scan.nextInt();

     System.out.print("digit5 : ");
     int digit5 = scan.nextInt();

     System.out.print("\n"); //Move to the next line

     System.out.print(+digit1 +" " +digit2 +" " +digit3 +" " +digit4 +" " +digit5);

       scan.close();

     }
}