public class PedometrManager {
    public int[] stepDay = new int[1];
    int maxStep;

    public int add(int day, int step) {
        int[] tmp = new int[day+1];

        for (int i = 0; i < day; i++) {
            tmp[i] = stepDay[i];}

            tmp[day - 1] = tmp[day - 1] + step;
            stepDay = tmp;

        for (int i = 0; i < day; i++) {
            if (maxStep < tmp[i]) {
                maxStep = tmp[i] + 1;
            }
        }
        return maxStep;
    }
}

