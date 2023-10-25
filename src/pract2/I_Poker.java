import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class I_Poker {
    public static void poker() {
        System.out.print("Количество игроков: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char[] masti={'Ч','П','Б','К'};
        String[] nums={"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        int siz = masti.length*nums.length;
        Random random=new Random();
        ArrayList<String> coloda = new ArrayList<>();
        for (int i=0; i < nums.length; i++) {
            for (int j = 0; j < masti.length; j++){
                coloda.add(nums[i] + masti[j]);
            }
        }
        if (n*5 > coloda.size()){
            System.out.println("Слишком много!");
            return;
        }
        Collections.shuffle(coloda);
        int ind = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Игрок " + (i+1) + ": ");
            for (int j = 0; j < 5; j++) {
                System.out.print(coloda.get(ind)+" ");
                ind ++;
            }
            System.out.println();
            System.out.println();
        }
    }
}