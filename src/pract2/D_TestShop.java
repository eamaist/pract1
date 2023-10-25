import java.util.Scanner;

public class D_TestShop {
    public void test() {
        D_Shop shop=new D_Shop();
        System.out.println("Введите количество компьютеров");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        for (int i = 0; i < number; i++) {
            System.out.println("Введите название и цену");
            String name=sc.next();
            int price=sc.nextInt();
            shop.addComputer(name, price);
        }
        shop.showComputers();

        System.out.println("Введите название компьютера, который надо найти");
        String name=sc.next();
        shop.find(name);

        System.out.println("Введите промежуток цен для поиска подходящего компьютера");
        int minPrice=sc.nextInt();
        int maxPrice=sc.nextInt();

        shop.find(minPrice,maxPrice);

        System.out.println("Введите название компьютера, который надо удалить");
        name=sc.next();
        shop.delComputer(name);
        shop.showComputers();
    }
}
