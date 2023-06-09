package currencyconvertor;

import java.util.Scanner;

public class CurrencyConvertorRunner {

    public static void main(String[] args) {

        Rupee rupee = new Rupee(100);

        Scanner scan = new Scanner(System.in);
        System.out.println("Original Amount in Rupees: 100.0");

        double x = -1.0;
        while (x == -1.0) {
            System.out.println(
                "Enter name of currency to convert to in all lowercase letters.");
            x = rupee.convertTo("ruble");
            System.out.println(x);
            x = scan.nextDouble();
        }

        System.out.println("New Amount in Rubles: " + x);
    }

}
