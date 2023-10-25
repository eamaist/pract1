import java.util.Scanner;

public class G_Test {
    public void test(){
        System.out.print("Сколько будет сотрудников: ");
        Scanner sc = new Scanner(System.in);
        int nums = sc.nextInt();
        double salary;
        String fullname, fam, name, ot;
        G_Employee[] p = new G_Employee[nums];
        G_Employee prom;
        for (int i=0; i < nums; i++){
            System.out.println("Введите полное ФИО сотрудника: ");
            fam = sc.next();
            name = sc.next();
            ot = sc.next();
            fullname = fam + " " + name + " " + ot;
            System.out.println("Введите зарплату этого сотрудника: ");
            salary = sc.nextDouble();
            p[i] = new G_Employee(fullname, salary);
        }
        G_Report r = new G_Report();
        r.generateReport(p);
    }
}
