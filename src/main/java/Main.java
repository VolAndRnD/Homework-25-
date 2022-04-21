public class Main {
    public static void main(String[] args) {
        Login login = new Login();

        login.changeIncome( 49000);
        login.changeConsumption(14000);

        System.out.println( "Налог по ставке в 6% составляет - " + login.tax(login.income) );
        System.out.println( "Налог по ставке в 15% составляет - " + login.tax1(login.income, login.consumption) );
    }
}