public class Main {
    public static void main(String[] args) {
        PedometrManager pM = new PedometrManager();


        pM.add1(1, 10);
        pM.add1(2, 25);
        pM.add1(3, 20);
        pM.add1(4, 35);
        pM.add1(5, 30);
        pM.add1(100, 12470);
        pM.add1(150, 19490);
        pM.add1(200, 27060);
        pM.add1(250, 34650);
        pM.add1(300, 40180);
        pM.add1(350, 53840);
        pM.add1(370, -60000);
        pM.add1(365, -12000);
        pM.add1(370, 60000);


        pM.setLimit(10000);
        pM.printAllDaysByCriteria(entry -> entry.getValue() > pM.getLimit());

        try {
            System.out.println(pM.checkingDaysAndStepsOfTheYear());
        } catch (IllegalDayException e) {
            e.printStackTrace();
        } catch (IllegalStepsException e) {
            e.printStackTrace();
        } finally
            {System.out.println("The end.");
        }

    }
}
