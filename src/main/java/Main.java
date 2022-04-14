import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        PedometrManager pM = new PedometrManager();


        System.out.println("Сколько нужно сделать шагов на следующий день, чтобы побить максимум?? " + pM.add(2,0));
        System.out.println("Сколько нужно сделать шагов на следующий день, чтобы побить максимум?? " + pM.add(2,15));

    }
}
