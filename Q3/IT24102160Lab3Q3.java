import java.util.Scanner;

public class IT24102160Lab3Q3 {
   public static void main(String[] args) {

     Scanner scan = new Scanner(System.in);

     System.out.print("Enter the Rupee amount :");
     int amount = scan.nextInt();

     int Count_5000 = amount/5000;

     amount %= 5000; //amount = amount % 5000 (Remainder)
     int Count_1000 = amount/1000;

     amount %= 1000;
     int Count_500 = amount/500;

     amount %= 500;
     int Count_200 = amount/200;

     amount %= 200;
     int Count_100 = amount/100;

     amount %= 100;
     int Count_50 = amount/50;

     amount %= 50;
     int Count_20 = amount/20;

     amount %= 20;
     int Count_10 = amount/10;

     amount %= 10;
     int Count_5 = amount/5;

     amount %= 5;
     int Count_2 = amount/2;

     amount %= 2;
     int Count_1 = amount/1;

     System.out.println("5000 Notes - " + Count_5000);
     System.out.println("1000 Notes - " + Count_1000);
     System.out.println("500 Notes - " + Count_500);
     System.out.println("200 Notes - " + Count_200);
     System.out.println("100 Notes - " + Count_100);
     System.out.println("50 Notes - " + Count_50);
     System.out.println("20 Notes - " + Count_20);
     System.out.println("10 Notes - " + Count_10);
     System.out.println("5 Notes - " + Count_5);
     System.out.println("2 Notes - " + Count_2);
     System.out.println("1 Notes - " + Count_1);

scan.close();

    }
}