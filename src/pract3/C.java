import java.util.Arrays;

public class C {
    int minim=10;
    int maxim=89;
    public void test(){
        int[] mas = new int[4];
        for (int i=0; i < 4; i++){
            mas[i] = (int) (Math.random()*++maxim) + minim;
        }
        for (int i=0; i < 4; i++){
            System.out.print(mas[i] + " ");
        }
        System.out.println();
        for (int i=1; i<mas.length;i++){
            if (mas[i] <=mas[i-1]){
                System.out.println("Не является строго возрастающей");
                return;
            }
        }
        System.out.println("Является строго возрастающей");
    }
}
