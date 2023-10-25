import java.util.Scanner;

public class E_TestDog {
    public void test() {
        System.out.println("Введите количество собак");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        E_Dog[] dogs=new E_Dog[number];
        for (int i = 0; i < number; i++) {
            System.out.println("Введите имя и возраст");
            String name=sc.next();
            int age=sc.nextInt();
            dogs[i]=new E_Dog(name ,age);
        }
        for(E_Dog elem:dogs){
            System.out.println(elem);
        }
    }
}
