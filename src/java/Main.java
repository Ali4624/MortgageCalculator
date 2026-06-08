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

        System.out.println("Principal: "+NumberFormat.getCurrencyInstance().format(principal));
        System.out.println("Annual Interest Rate: "+NumberFormat.getPercentInstance().format(annualInterestRate/PERCENT));
        System.out.println("Period: "+ period);
        System.out.println("Mortgage: "+ NumberFormat.getCurrencyInstance().format(mortgage));
    }
    public static double calculateMortgage(int principal, float annualInterestRate, byte period){
        float monthlyInterestRate = annualInterestRate/PERCENT/MONTHS;
        short numberOfPayments = (short)(period*MONTHS);

        return principal*(monthlyInterestRate*Math.pow((1+monthlyInterestRate),numberOfPayments))/(Math.pow((1+monthlyInterestRate),numberOfPayments)-1);
    }
}
