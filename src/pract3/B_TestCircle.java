import java.util.Scanner;

public class B_TestCircle {
    public B_Circle[] mas;
    public int size;

    public B_Circle[] circle_sort(B_Circle[] circle){
        int elems = circle.length;
        for (int i = 0; i <= elems; i++) {
            for (int j = 0; j < elems-1; j++) {
                if(circle[j].radius> circle[j+1].radius){
                    B_Circle temp= circle[j];
                    circle[j]= circle[j+1];
                    circle[j+1]=temp;
                }
            }
        }
        return circle;
    }
    public B_Circle circle_big(B_Circle[] circle){
        B_Circle[] new_circle = circle_sort(circle);
        return new_circle[new_circle.length-1];
    }

    public B_Circle circle_small(B_Circle[] circle){
        B_Circle[] new_circle = circle_sort(circle);
        return new_circle[0];
    }

    public void test() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество: ");
        size=sc.nextInt();
        mas = new B_Circle[size];
        for (int i = 0; i <size; i++) {
            System.out.println("Введите х и у для элемента под индексом "+i);
            double x=sc.nextInt();
            double y=sc.nextInt();
            mas[i] = new B_Circle(x,y);
        }
        for (int i = 0; i <size; i++) {
            System.out.println(mas[i]);
        }
        System.out.println("Самая маленькая окружность: " + circle_small(mas));
        System.out.println("Самая большая окружность: " + circle_big(mas));
    }
}
