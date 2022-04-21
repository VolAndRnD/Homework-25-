import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.api.Assertions;

public class TestTax {
    @ParameterizedTest
    @CsvFileSource( resources = {"testTax.csv"})
    public void testTax (double profit, double expected) {
    Login login = new Login();
    login.changeIncome(profit);

        double actual = login.tax(login.income);
    Assertions.assertEquals( actual,expected);
    }
    @ParameterizedTest
    @CsvFileSource( resources = {"testTax1.csv"})
     public void testTax1 (double profit, double loss, double expected) {
     Login login = new Login();
     login.changeIncome(profit);
     login.changeConsumption(loss);

        double actual = login.tax1(login.income, login.consumption);
     Assertions.assertEquals( actual,expected);
    }

    @ParameterizedTest
    @CsvFileSource( resources = {"testIncome.csv"})
    public void testIncome (double profit, double expected) {
        Login login = new Login();
        double actual = login.changeIncome(profit);
        Assertions.assertEquals(actual,expected);
    }
    @ParameterizedTest
    @CsvFileSource( resources = {"testConsumption.csv"})
    public void testConsumption (double loss, double expected) {
        Login login = new Login();
        double actual = login.changeConsumption(loss);
        Assertions.assertEquals(actual,expected);
    }

}
