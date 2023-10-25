import java.util.Scanner;

public class F_TestCircle {
    public static void main(String[] args) {
        System.out.println("Введите радиус окружности");
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        F_Circle c1=new F_Circle(r);
        c1.length();
        c1.area();
        System.out.println("Введите радиус второй окружности");
        r=sc.nextInt();
        F_Circle c2=new F_Circle(r);
        c2.length();
        c2.area();
        c1.compareWith(c2);

    }
}
