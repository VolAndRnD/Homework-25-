import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


    public class TestControl {
        @ParameterizedTest
        @CsvFileSource(resources = {"testStepsDayComparable.csv"})
        public void Comparable(int day1, int steps1, int day2, int steps2, int expected) {
            PedometrManager pM1 = new PedometrManager();
            pM1.add1(day1, steps1);
            pM1.add2(day2, steps2);
            int actual = pM1.compareTo(pM1);
            Assertions.assertEquals(actual, expected);
        }
        @ParameterizedTest
        @CsvFileSource(resources = {"testStepsDayComparator.csv"})
        public void Comparator(int day1, int steps1, int day2, int steps2, int day3, int steps3, int day4, int steps4, int expected) {
            PedometrManager pM1 = new PedometrManager();
            DayComparator dC1 = new DayComparator(10);
            pM1.add1(day1, steps1);
            pM1.add1(day2,steps2);
            pM1.add2(day3,steps3);
            pM1.add2(day4, steps4);
            int actual = dC1.compare(pM1,pM1);
            Assertions.assertEquals(actual, expected);
        }

    }

