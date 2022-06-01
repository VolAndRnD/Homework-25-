
public class Main {
    public static void main(String[] args) {
        PedometrManager pM = new PedometrManager();



        pM.add1(1,10);
        pM.add1(2,25);
        pM.add1(3,20);
        pM.add1(4,35);
        pM.add1(5,30);

        pM.add1(100, 1000);
        pM.add1(150, 10000);
        pM.add1(200, 20000);
        pM.add1(250, 100000);
        pM.add1(300, 200000);
        pM.setLimit(10000);
        pM.printAllDaysByCriteria(entry ->  entry.getValue()> pM.getLimit());




    }
}


