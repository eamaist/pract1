import java.util.ArrayList;
import java.util.Scanner;

public class D {
    public void test(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        double n = sc.nextDouble();
        while (n<=0 || n != Math.round(n)){
            System.out.print("Не подходящее число. Введите размер массива: ");
            n = sc.nextDouble();
        }
        int[] mas = new int[(int) n];
        int siz = (int) n;
        for (int i=0; i < siz; i++){
            mas[i] = (int) (Math.random()*n);
        }
        for (int i=0; i < siz; i++){
            System.out.print(mas[i] + " ");
        }
        System.out.println();
        ArrayList<Integer> chet = new ArrayList<Integer>();
        for (int i=0; i < siz; i++){
            if (mas[i]%2 == 0)
                chet.add(mas[i]);
        }
        for (int i=0; i < chet.size(); i++){
            System.out.print(chet.get(i) + " ");
        }
    }
}
