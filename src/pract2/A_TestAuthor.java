import java.util.Scanner;

public class A_TestAuthor {
    public void test(){
        Scanner elem = new Scanner(System.in);
        String name = new String();
        String email = new String();
        char gender;
        System.out.print("Введите имя автора: ");
        name = elem.next();
        System.out.print("Введите email автора: ");
        email = elem.next();
        System.out.print("Введите гендер автора: ");
        gender = elem.next().charAt(0);
        A_Author pep = new A_Author(name, email, gender);
        System.out.println(pep.getName());
        System.out.println(pep.getEmail());
        System.out.println(pep.getGender());
        System.out.print("Введите новый email автора: ");
        email = elem.next();
        pep.setEmail(email);
        System.out.println(pep.getEmail());
        System.out.println(pep.toString());
    }
}
