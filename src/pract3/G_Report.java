public class G_Report {
    public static void generateReport(G_Employee[] people){
        for (int i=0; i<people.length;i++) {
            System.out.println("Сотрудник: " + people[i].fullname);
            System.out.printf("Зарплата: %23.2f\n" , people[i].salary);
        }
    }
}
