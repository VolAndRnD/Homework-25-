import java.util.Map;
import java.util.Comparator;


public class DayComparator implements Comparator<PedometrManager> {
    protected int minSteps;

    public DayComparator(int steps) {
    this.minSteps = steps;
    }


    @Override
    public int compare(PedometrManager o1, PedometrManager o2) {
    int cnt1 = 0;
    int cnt2 = 0;


        for (Map.Entry<Integer, Integer> entry : o1.add1.entrySet()){
            if (minSteps < entry.getValue()){
                cnt1++;}
        }
        for (Map.Entry<Integer, Integer> entry : o2.add2.entrySet()){
            if (minSteps < entry.getValue()){
                 cnt2++;}
        }

        if (cnt1>cnt2) {return 1;}
        else if (cnt2>cnt1){return -1;}
        else {return 0;
        }

    }
}

