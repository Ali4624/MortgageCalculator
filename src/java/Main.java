import java.text.NumberFormat;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        final byte MONTHS = 12;
        final byte PERCENT = 100;

        Scanner input = new Scanner(System.in);
        System.out.print("Principal:");
        int principal = input.nextInt();
        System.out.print("Annual Interest Rate:");
        float annualInterestRate = input.nextFloat();
        System.out.print("Period(in years):");
        byte period = input.nextByte();
        float monthlyInterestRate = annualInterestRate/PERCENT/MONTHS;
        short numberOfPayments = (short)(period*MONTHS);
        double mortgage = principal*(monthlyInterestRate*Math.pow((1+monthlyInterestRate),numberOfPayments))/(Math.pow((1+monthlyInterestRate),numberOfPayments)-1);
        System.out.println("Principal: "+NumberFormat.getCurrencyInstance().format(principal));
        System.out.println("Annual Interest Rate: "+NumberFormat.getPercentInstance().format(annualInterestRate/PERCENT));
        System.out.println("Period: "+ period);
        System.out.println("Mortgage: "+ NumberFormat.getCurrencyInstance().format(mortgage));
    }
}
