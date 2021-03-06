package tests;

import org.junit.*;
//import utils.Functions;
import utils.*;


public class UnitTestsFunctions {

    @Test
    public void MinNumber_NumberIsZero_True(){
        Functions f = new Functions();
        assert(f.minNumber(1230456) == 0);
    }

    @Test
    public void MinNumber_NumberIsNotZero_True(){
        Functions f = new Functions();
        assert(f.minNumber(123456) != 0);
    }

    @Test
    public void MinNumber_NumberIsNotInt_ExceptionIsThrown(){
        Functions f = new Functions();
        try{
            var res = f.minNumber(Integer.parseInt("Abc?"));
        }catch(Exception e){
            assert(e.getMessage().equals("For input string: \"Abc?\""));
        }

    }
    @Test
    public void numberOfDigits_LengthIsFine_True(){
        Functions f = new Functions();
        assert(f.numberOfDigits(12345) == 5);
    }
    @Test
    public void numberOfDigits_LengthIsNotFine_True(){
        Functions f = new Functions();
        assert (f.numberOfDigits(12) !=5);
    }
    @Test
    public void evenDigits_NoEvenDigits_True(){
        Functions f = new Functions();
        assert(f.evenDigits(13579) == 0);
    }

    @Test
    public void evenDigits_ThreeEvenDigits_True(){
        Functions f = new Functions();
        assert (f.evenDigits(36841) == 3);
    }

    @Test
    public void maxDigit_AllEquals_True(){
        Functions f = new Functions();
        assert (f.maxDigit(777) == 7);
    }

    @Test
    public void maxDigit_Max_True(){
        Functions f = new Functions();
        assert (f.maxDigit(467382) == 8);
    }

    @Test
    public void oddDigit_5Odd_Digits_True(){
        Functions f = new Functions();
        assert (f.oddDigit(12345679) == 5);
    }

    @Test
    public void oddDigit_allEven_True(){
        Functions f = new Functions();
        assert(f.oddDigit(2468)==0);
    }

    @Test
    public void sameDigits_AllEqual_True(){
        Functions f = new Functions();
        assert (f.sameDigits(5555) == true);
    }

    @Test
    public void sameDigits_1Differs_True(){
        Functions f = new Functions();
        assert (f.sameDigits(2221) != true);
    }

    @Test
    public void smallestEven_3EvenDigits_True(){
        Functions f = new Functions();
        assert (f.smallestEven(246) == 2);
    }

    @Test
    public void smallestEven_allOdd_True(){
        Functions f = new Functions();
        assert (f.smallestEven(1379) == 10);
    }

    @Test
    public void reversedNumber_allEqual_True(){
        Functions f = new Functions();
        assert (f.reverseNr(777) == 777);
    }
    @Test
    public void reversedNumber_noneEqual_True(){
        Functions f = new Functions();
        assert (f.reverseNr(789) == 987);
    }

}
