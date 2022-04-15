import java.util.HashMap;
import java.util.Map;

public class PedometrManager {
    int maxStep;
    Map<Integer, Integer> add = new HashMap<Integer, Integer>();


    public int add(int day, int step) {
        if (add.containsKey(day)) {
            add.put(day, add.get(day) + step);
        } else {
            add.put(day, step);
        }

        for (Map.Entry<Integer, Integer> entry : add.entrySet()){
                if (maxStep <= entry.getValue()){
                    maxStep = entry.getValue()+1;}
                }
        return maxStep;
    }
}

