import java.util.Scanner;

public class C_TestCircle {

    public void test() {
        int size;
        C_Circle[] mas;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество: ");
        size=sc.nextInt();
        mas = new C_Circle[size];
        for (int i = 0; i <size; i++) {
            System.out.println("Введите х и у для элемента под индексом "+i);
            double x=sc.nextInt();
            double y=sc.nextInt();
            mas[i] = new C_Circle(x,y);
        }
        for (int i = 0; i <size; i++) {
            System.out.println(mas[i]);
        }
    }
}
