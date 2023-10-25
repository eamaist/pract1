import java.util.Scanner;

public class B_TestBall {
    public void test() {
        B_Ball ball = new B_Ball();
        Scanner elem = new Scanner(System.in);
        System.out.println("X: " + ball.getX());
        System.out.println("Y: " + ball.getY());
        System.out.print("Введите координату x: ");
        double x = elem.nextDouble();
        System.out.print("Введите координату y: ");
        double y = elem.nextDouble();
        ball.move(x, y);
        System.out.println("X: " + ball.getX());
        System.out.println("Y: " + ball.getY());
    }
}
