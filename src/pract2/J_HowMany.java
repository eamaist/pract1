import java.util.Scanner;

public class J_HowMany {
    public void how_many(){
        Scanner elem = new Scanner(System.in);
        String words = new String();
        System.out.print("Введите ваши слова: ");
        words = elem.nextLine();
        String word = new String();
        int count = 0;
        if (words.length() != 0){
            for (int i=0; i < words.length(); i++){
                if (words.charAt(i) == ' ' && word.toString() != "") {
                    count++;
                    word = "";
                    continue;
                }
                if (words.charAt(i) != ' ')
                    word += words.charAt(i);
            }
            if (word != " ")
                count ++;
        }
        System.out.println("Количество слов: " + count);
    }
}
