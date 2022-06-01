import java.util.HashMap;
import java.util.Map;

class PedometrManager  {
    private int limit;
    public static Map<Integer, Integer> add1 = new HashMap<Integer, Integer>();

    private int sum;

    public Map<Integer, Integer> add2 = new HashMap<Integer, Integer>();


    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getLimit() {
        return limit;
    }

    public void add1(int day, int step) {
        if (add1.containsKey(day)) {
            add1.put(day, add1.get(day) + step);
        } else {
            add1.put(day, step);
        }
    }




    public int printAllDaysByCriteria (ForPredicat bla){
        int cnt = 0;
        for(Map.Entry<Integer, Integer> entry : add1.entrySet()) {
            if (bla.forThousandsSteps(entry)) {
                System.out.println("День " + entry.getKey() + " шагов " + entry.getValue());
                add2.put(entry.getKey(),entry.getValue());
            }
        cnt = add2.size();
        }

        return cnt;
    }
}







