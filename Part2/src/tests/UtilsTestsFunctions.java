package tests;

import org.junit.*;
//import utils.Functions;
import utils.*;


public class UtilsTestsFunctions {

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
        assert (f.oddDigit(13579)==3);
    }
}
