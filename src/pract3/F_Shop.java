import java.util.Scanner;

public class F_Shop {
    public void test(){
        Scanner sc = new Scanner(System.in);
        System.out.print("К - Книга - 638 руб" +
                "\nТ - Телевизор - 100 892 руб" +
                "\nБ - Ботинок - 234 руб (Акция: два по цене одного)"+"\nВыберите товар: ");
        String thing = sc.next();
        double cost = 0;
        switch (thing){
            case "К": cost = 638;
                break;
            case "Т": cost = 100892;
                break;
            case "Б": cost = 234;
                break;
        }
        System.out.print("Введите количество товара: ");
        double counter = sc.nextDouble();
        cost = cost*counter;
        System.out.println("Стоимость покупки: " + cost + ". Время оплачивать!");
        F_Convertor change = new F_Convertor();
        change.test(cost);
    }
}
