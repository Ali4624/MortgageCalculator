import java.text.NumberFormat;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        final byte MONTHS = 12;
        final byte PERCENT = 100;

        Scanner input = new Scanner(System.in);
        System.out.print("Principal ($1K - $1M):");
        int principal;
        while (true) {
            principal = input.nextInt();
            if (principal >= 1_000 && principal <= 1_000_000)
                break;
            else
                System.out.println("Enter a number from 1,000 to 1,000,000 please...");
        }
        System.out.print("Annual Interest Rate:");
        float annualInterestRate;
        while (true) {
            annualInterestRate = input.nextFloat();
            if (annualInterestRate > 0 && annualInterestRate <= 30)
                break;
            else
                System.out.println("Enter a value from 1 to 30 please...");
        }
        System.out.print("Period(in years):");
        byte period;
        while (true) {
            period = input.nextByte();
            if (period > 0 && period <=30)
                break;
            else
                System.out.println("Enter a value from 1 to 30 please<3");
        }
        float monthlyInterestRate = annualInterestRate/PERCENT/MONTHS;
        short numberOfPayments = (short)(period*MONTHS);
        double mortgage = principal*(monthlyInterestRate*Math.pow((1+monthlyInterestRate),numberOfPayments))/(Math.pow((1+monthlyInterestRate),numberOfPayments)-1);
        System.out.println("Principal: "+NumberFormat.getCurrencyInstance().format(principal));
        System.out.println("Annual Interest Rate: "+NumberFormat.getPercentInstance().format(annualInterestRate/PERCENT));
        System.out.println("Period: "+ period);
        System.out.println("Mortgage: "+ NumberFormat.getCurrencyInstance().format(mortgage));
    }
}
