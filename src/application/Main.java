package application;

import java.text.NumberFormat;
import java.util.Scanner;
public class Main {
    final static byte MONTHS = 12;
    final static byte PERCENT = 100;
    public static double readNumber(String prompt, int min, int max){
        Scanner input = new Scanner(System.in);
        double value;
        while (true) {
            System.out.print(prompt + " (" + min + " - " + max + "):" );
            value = input.nextDouble();
            if (value >= min && value <= max)
                break;
            else
                System.out.println("Enter a value from " + min + " to " + max + " please...");
        }
        return value;
    }
    public static void main(String[] args){
        int principal =(int) readNumber("Principal", 1_000, 1_000_000);
        float annualInterestRate = (float) readNumber("Annual Interest Rate", 0, 30);
        byte period = (byte) readNumber("Period(in years)", 0, 30);

        double mortgage = calculateMortgage(principal, annualInterestRate,period);

        System.out.println("MORTGAGE\n--------");
        System.out.println("Monthly Payments: "+ NumberFormat.getCurrencyInstance().format(mortgage));
        System.out.println("PAYMENT SCHEDULE\n----------------");
        getPaymentsSchedule(principal, annualInterestRate, period);
    }
    public static double calculateMortgage(int principal, float annualInterestRate, byte period){
        float monthlyInterestRate = annualInterestRate/PERCENT/MONTHS;
        short numberOfPayments = (short)(period*MONTHS);

        return principal*(monthlyInterestRate*Math.pow((1+monthlyInterestRate),numberOfPayments))/(Math.pow((1+monthlyInterestRate),numberOfPayments)-1);
    }
    public static void getPaymentsSchedule(int principal,float annualInterestRate, byte period){
        float monthlyInterestRate = annualInterestRate/PERCENT/MONTHS;
        short numberOfPayments = (short)(period*MONTHS);
        short paymentsDone = 1;
        while (paymentsDone != numberOfPayments) {
            double Balance =(double) (principal * (Math.pow((1 + monthlyInterestRate), numberOfPayments) - Math.pow((1 + monthlyInterestRate), paymentsDone))/(Math.pow((1+monthlyInterestRate), numberOfPayments) - 1));
            System.out.println(NumberFormat.getCurrencyInstance().format(Balance));
            paymentsDone++;
        }
        System.out.println("$0.00");
    }
}
