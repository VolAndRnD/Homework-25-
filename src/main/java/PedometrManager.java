import java.util.HashMap;
import java.util.Map;

    class PedometrManager implements Comparable< PedometrManager> {
        public Map<Integer, Integer> add1 = new HashMap<Integer, Integer>();
        private int sum;

        public Map<Integer, Integer> add2 = new HashMap<Integer, Integer>();
        private int sum2;


        public void add1(int day, int step) {
            if (add1.containsKey(day)) {
                add1.put(day, add1.get(day) + step);
            } else {
                add1.put(day, step);
            }
        }

        public void add2(int day, int step) {
            if (add2.containsKey(day)) {
                add2.put(day, add2.get(day) + step);
            } else {
                add2.put(day, step);
            }
        }

        public int getSum() {
            for (int steps : add1.values()) {
                sum = sum + steps;
            }
            return sum;
        }

        public int getSum2() {
            for (int steps : add2.values()) {
                sum2 = sum2 + steps;
            }
            return sum2;        }



        @Override
        public int compareTo(PedometrManager pM) {
            if (pM.getSum() > pM.getSum2()) {
                return 1;
            } else if (pM.getSum() < pM.getSum2()) {
                return -1;
            } else {
                return 0;
            }
        }
    }
