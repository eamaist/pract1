import java.util.Scanner;

public class G_TestBook {
    public static void main(String[] args) {
        System.out.println("Введите количество элементов на полке: ");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        G_BookShelf bookShelf=new G_BookShelf(size);
        for (int i = 0; i < size; i++) {
            System.out.println("Введите автора, название книги и год издания: ");
            String author=sc.next();
            String name=sc.next();
            int year=sc.nextInt();
            bookShelf.add(new G_Book(author,name,year));
        }
        bookShelf.firstLast();
    }
}
