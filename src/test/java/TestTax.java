import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.api.Assertions;

public class TestTax {
    @ParameterizedTest
    @CsvFileSource( resources = {"testTax.csv"})
    public void testTax (int profit, int expected) {
    Login login = new Login();
    login.changeIncome(profit);

    int actual = login.tax(login.income);
    Assertions.assertEquals( actual,expected);
    }
    @ParameterizedTest
    @CsvFileSource( resources = {"testTax1.csv"})
     public void testTax1 (int profit, int loss, int expected) {
     Login login = new Login();
     login.changeIncome(profit);
     login.changeConsumption(loss);

     int actual = login.tax1(login.income, login.consumption);
     Assertions.assertEquals( actual,expected);
    }

    @ParameterizedTest
    @CsvFileSource( resources = {"testIncome.csv"})
    public void testIncome (int profit, int expected) {
        Login login = new Login();
        int actual = login.changeIncome(profit);
        Assertions.assertEquals(actual,expected);
    }
    @ParameterizedTest
    @CsvFileSource( resources = {"testConsumption.csv"})
    public void testConsumption (int loss, int expected) {
        Login login = new Login();
        int actual = login.changeConsumption(loss);
        Assertions.assertEquals(actual,expected);
    }

}
