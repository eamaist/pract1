import java.util.Arrays;
import java.util.Random;

public class A {
    public void double_nums() {
        double[] mas = new double[5];
        Random rand = new Random();
        System.out.println("До сортировки: ");
        for (int i=0; i < 5; i++) {
            mas[i] = Math.random();
            //mas[i] = rand.nextDouble();
            System.out.print(mas[i] + " ");
        }
        Arrays.sort(mas);
        System.out.println("\nПосле сортировки: ");
        for (int i=0; i < 5; i++)
            System.out.print(mas[i] + " ");
    }
}
