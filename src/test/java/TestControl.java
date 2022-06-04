import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestControl {

    @ParameterizedTest
    @CsvFileSource(resources = {"testPrintAllDaysByCriteria.csv"})
    public void printAllDaysByCriteria (int day1, int steps1, int day2, int steps2, int day3, int steps3, int limit, int expected){
        PedometrManager pM3 = new PedometrManager();
        pM3.add1(day1,steps1);
        pM3.add1(day2,steps2);
        pM3.add1(day3,steps3);
        pM3.setLimit(limit);
        int actual = pM3.printAllDaysByCriteria(entry ->  entry.getValue()> pM3.getLimit());
        assertEquals(actual,expected);
    }

    @ParameterizedTest
    @CsvFileSource(resources = {"testExceptionDays.csv"})
    public void ExceptionDaysAndSteps ( int day1, int steps1, int day2, int steps2 ){
        PedometrManager pM1 = new PedometrManager();
        pM1.add1(day1,steps1);
        pM1.add1(day2,steps2);
        Assertions.assertThrows(IllegalDayException.class,()->{pM1.checkingDaysAndStepsOfTheYear();});
        }
    @ParameterizedTest
    @CsvFileSource(resources = {"testExceptionSteps.csv"})
    public void ExceptionSteps ( int day1, int steps1, int day2, int steps2 ){
         PedometrManager pM2 = new PedometrManager();
         pM2.add1(day1,steps1);
         pM2.add1(day2,steps2);
         Assertions.assertThrows(IllegalStepsException.class,()->{pM2.checkingDaysAndStepsOfTheYear();});
    }
   @Test
    public void TestGetAdd (){
    PedometrManager pM4 = new PedometrManager();
    pM4.add1(1,1000);
    Map<Integer, Integer> actual = pM4.checkingDaysAndStepsOfTheYear();
    Map<Integer, Integer> expected = new HashMap<>();
    expected.put(1,1000);
    assertEquals(actual, expected);
    }
}