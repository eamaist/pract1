package pract1;

import java.util.Scanner;

public class pr1 {
    public static void pr1() {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum=0;
        for (int i = 0; i<a.length; i++) {
            sum+=a[i];
        }
        System.out.print(sum + " " + sum/a.length);
    }

    public static void pr2() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int sum = 0, i = 0;
        do {
            a[i] = sc.nextInt();
            sum += a[i];
            i += 1;
        } while(i<n);

        int min = a[0], k = 0, max = a[0];
        while (k < a.length) {
            if (min>a[k]) {
                min = a[k];
            }
            if(max<a[k]) {
                max = a[k];
            }
            k+=1;
        }

        System.out.print("сумма: " + sum + ", максимальное: " + max + ", минимальное:  " + min);
    }

    public static void pr3(String[] args) {
        for(String i:args) {
            System.out.println(i);
        }
    }

    public static void pr4() {
        for(int i = 1; i < 11; ++i) {
            System.out.printf("%.2f%n", 1.0 / (double)i);
        }
    }

    public static int fact(int num) {
        int fact = 1;

        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void pr5() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(fact(num));
    }

    public static void main(String[] args) {
        System.out.print("pr1\n");
        pr1();
        System.out.print("\npr2\n");
        pr2();
        System.out.print("\npr3\n");
        pr3(args);
        System.out.print("\npr4\n");
        pr4();
        System.out.print("\npr5\n");
        pr5();
    }

}
