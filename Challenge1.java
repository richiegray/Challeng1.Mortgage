package challenge1;

import java.text.DecimalFormat;

import java.util.Scanner;
public class Challenge1 {

    public static void main(String[] args){
        //by putting this here I'm able to obtain variables by the users input
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter the purchase price of your new home: ");
        // inputnextDouble is how you obtain the data from the user may also be input.nextInt??
        double price = input.nextDouble();
    
     System.out.print("Enter Down payment : ");
      double downPayment = input.nextDouble();
       
      System.out.print("Enter loan term (in years): ");
      int years = input.nextInt();
       
      System.out.print("Enter interest rate: ");
      double interestRate = input.nextDouble();
      // my math formulas had to go step by step for some reason
      double loan = price - downPayment;
      double rate = interestRate / 100;
      double mathRate = rate / 12;
      double np = years * 12;
      double bracketMath =  mathRate + 1;
      //top and bottom math for brackets
      double result = Math.pow(bracketMath, np);
      //finishing the math for the top
      double top = mathRate * result;
      // finishing the bottom of equation 
      double bottom = result - 1;
      // compleating the equation
      double equat = top / bottom;
      // final monthly payment
      double fin = equat * loan;
      double totalCost = fin * np;
      /* test run for project
      System.out.println(loan);
      System.out.println(rate);
      System.out.println(mathRate);
      System.out.println(np);
      System.out.println(bracketMath);
      System.out.println(result);
      System.out.println(top);
      System.out.println(bottom);
      System.out.println(equat);
      System.out.println(fin);
      System.out.println(totalCost);
      */
      System.out.println("Your Monthly Payment is $" + (new DecimalFormat("0.00").format(fin)));
      System.out.println("The total price paid to the bank is $" + (new DecimalFormat("0.00").format(totalCost)));

              
    
    }
    
}
