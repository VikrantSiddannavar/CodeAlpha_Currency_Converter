package com.codeSoft.CurrencyConvertor;
import java.util.*;
import java.text.DecimalFormat;

public class Currency_Convertor {
    public static void main(String[] args) {
        double rupee, dollar, pound, euro, KWD;
//        int key = 0;
        DecimalFormat f = new DecimalFormat("##.###");
        Scanner sc = new Scanner(System.in);
//        code = inPut;
        while (true) {
            System.out.println("""
                    ### Welcome to CodeAlpha Currency Converter Project ###\s
                    Enter the Currency code\s
                    1: Rupees
                    2: Dollar
                    3: Pound
                    4: Euro
                    5: Kuwaiti Dinar
                    6: Exit""");
            System.out.println("=> Enter the Currency from which you want to convert the amount");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the amount in rupees: ");
                    rupee = sc.nextDouble();
                    dollar = rupee / 83.1248;
                        System.out.println("Dollar: " + f.format(dollar));
                    pound = rupee / 101.745;
                        System.out.println("Pound: " + f.format(pound));
                    euro = rupee / 88.0088;
                        System.out.println("Euro: " + f.format(euro));
                    KWD = rupee / 268.7537;
                        System.out.println("Kuwaiti Dinar KWD: " + f.format(KWD));
                    System.out.println("=======================================================");
                    System.out.println(" ");
                    break;
                case 2:
                    System.out.print("Enter the amount in Dollar: ");
                    dollar = sc.nextDouble();
                    rupee = dollar * 83.1248;
                        System.out.println("Rupees: " + f.format(rupee));
                    pound = dollar * 0.82;
                        System.out.println("Pound: " + f.format(pound));
                    euro = dollar * 0.96;
                        System.out.println("Euro: " + f.format(euro));
                    KWD = dollar * 0.31;
                        System.out.println("Kuwaiti Dinar KWD: " + f.format(KWD));
                    System.out.println("============================================================");
                    System.out.println(" ");
                    break;
                case 3:
                    System.out.println("Enter the amount in Pound");
                    pound = sc.nextDouble();
                    rupee = pound * 94.43;
                        System.out.println("Rupees: " + f.format(rupee));
                    dollar = pound * 1.22;
                        System.out.println("Dollar: " + f.format(dollar));
                    euro = pound * 1.17;
                        System.out.println("Euro: " + f.format(euro));
                    KWD = pound * 0.3748;
                        System.out.println("Kuwaiti Dinar KWD: " + f.format(KWD));
                    System.out.println("==============================================================");
                    System.out.println(" ");
                    break;
                case 4:
                    System.out.print("Enter the amount in Euro: ");
                    euro = sc.nextDouble();
                    rupee = euro * 80.43;
                        System.out.println("Rupees: " + f.format(rupee));
                    dollar = euro * 1.04;
                        System.out.println("Dollar: " + f.format(dollar));
                    pound = euro * 0.85;
                        System.out.println("Pound: " + f.format(pound));
                    KWD = euro * 0.318949;
                        System.out.println("Kuwaiti Dinar KWD: " + f.format(KWD));
                    System.out.println("===============================================================");
                    System.out.println(" ");
                    break;
                case 5:
                    System.out.print("Enter the amount in Kuwaiti Dinar: ");
                    KWD = sc.nextDouble();
                    rupee = KWD * 268.7537;
                        System.out.println("Rupees: " + f.format(rupee));
                    dollar = KWD * 3.26;
                        System.out.println("Dollar: " + f.format(dollar));
                    pound = KWD * 2.67;
                        System.out.println("Pound: " + f.format(pound));
                    euro = KWD * 3.13;
                        System.out.println("Euro: " + f.format(euro));
                    System.out.println("=======================================================");
                    System.out.println(" ");
                    break;
                case 6:
                    System.out.println("Thank you for using CodeAlpha Currency Converter | VISIT AGAIN |");
                    System.out.println("________________________________________________________________");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Code...!");
            }
        }
    }
}