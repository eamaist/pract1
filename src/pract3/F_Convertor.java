import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class F_Convertor {
    public void test(double number) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите валюту (Р - рубли, ЮВ - южнокорейская вона, Е - евро, Д - доллары, ФС - фунты стерлингов, КД - канадский доллар, ЯИ - японская иена):");
        String val = sc.next();
        switch (val) {
            case "Р":NumberFormat numberFormat =
                    NumberFormat.getInstance();
                System.out.println("Стоимость в рублях: " + numberFormat.format(number));
                break;
            case "ЮВ": NumberFormat numberFormat0 =
                    NumberFormat.getCurrencyInstance(Locale.KOREA);
                System.out.println("Стоимость в южнокорейской воне: " + numberFormat0.format(number*13.7));
                break;
            case "Е": NumberFormat numberFormat1 =
                    NumberFormat.getCurrencyInstance(Locale.FRANCE);
                System.out.println("Стоимость в евро: " + numberFormat1.format(number*0.0097));
                break;
            case "Д": NumberFormat numberFormat2 =
                    NumberFormat.getCurrencyInstance(Locale.US);
                System.out.println("Стоимость в долларах: " + numberFormat2.format(number*0.010347));
                break;
            case "ФС": NumberFormat numberFormat4 =
                    NumberFormat.getCurrencyInstance(Locale.UK);
                System.out.println("Стоимость в фунтах стерлингов: " + numberFormat4.format(number*0.0084));
                break;
            case "ЯИ": NumberFormat numberFormat6 =
                    NumberFormat.getCurrencyInstance(Locale.JAPAN);
                System.out.println("Стоимость в японской иене: " + numberFormat6.format(number*0.0152));
                break;
            case "КД": NumberFormat numberFormat8 =
                    NumberFormat.getCurrencyInstance(Locale.CANADA);
                System.out.println("Стоимость в канадском долларе: " + numberFormat8.format(number*0.14));
                break;
        }
    }
}
