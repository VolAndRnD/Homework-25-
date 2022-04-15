public class Main {
    public static void main(String[] args) {
        PedometrManager pM = new PedometrManager();
        DayComparator dC = new DayComparator(50);

        pM.add1(1,10);
        pM.add1(2,25);
        pM.add1(3,20);
        pM.add1(4,35);
        pM.add1(5,30);

        pM.add2(1,40);
        pM.add2(2,70);
        pM.add2(3,90);
        pM.add2(4,100);
        pM.add2(5,150);

        System.out.println("Cравнение шагов " + pM.compareTo(pM) );
        System.out.println("Cравнение количества дней,в которых шагов больше минимума " + dC.compare(pM, pM) );


    }
}
