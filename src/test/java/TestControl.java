import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.Map;


public class TestControl {

    @ParameterizedTest
    @CsvFileSource(resources = {"testPrintAllDaysByCriteria.csv"})
        public void printAllDaysByCriteria (int day1, int steps1, int day2, int steps2, int day3, int steps3, int limit, int expected){
            PedometrManager pM2 = new PedometrManager();
            pM2.add1(day1,steps1);
            pM2.add1(day2,steps2);
            pM2.add1(day3,steps3);
            pM2.setLimit(limit);
            int actual = pM2.printAllDaysByCriteria(entry ->  entry.getValue()> pM2.getLimit());
            Assertions.assertEquals(actual,expected);
        }
    }



