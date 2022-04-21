import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class TestControl {
    @ParameterizedTest
    @CsvFileSource( resources = {"testStepsDay.csv"})
    public void testStepsDay (int day, int steps, int expected) {
        PedometrManager pM = new PedometrManager();
        int actual = pM.add(day, steps);
        Assertions.assertEquals(actual, expected);
    }
    @ParameterizedTest
    @CsvFileSource( resources = {"testStepsDay1.csv"})
    public void testStepsDay1 (int day, int steps, int expected) {
        PedometrManager pM = new PedometrManager();
        pM.add(1,10);
        pM.add(2,30);
        int actual = pM.add(day,steps);
        Assertions.assertEquals(actual, expected);
    }
}
