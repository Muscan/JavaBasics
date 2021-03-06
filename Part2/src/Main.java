//import utils.Functions;
import utils.*;

import java.util.Scanner;
import java.util.function.Function;

public class Main {

    public static void callMinNumber(){
        Functions f = new Functions();
        //Scanner reader = new Scanner(System.in);
        //System.out.println("Enter a number, ex 1029    ");
        //int number = reader.nextInt();
        System.out.println("Min digit of 1029 =  " + f.minNumber(1029));
    }

    public static void callNrDigits(){
        Functions f = new Functions();
        System.out.println("Nr of digits of 12345 =  " + f.numberOfDigits(12345));
    }

    public static void callEvenDigits(){
        Functions f = new Functions();
        System.out.println("Nr of even digits of 36841 =  " + f.evenDigits(36841));
    }

    public static void callMaxDigit(){
        Functions f = new Functions();
        System.out.println("Max digit of number 456789 =  " + f.maxDigit(456789));
    }

    public static void callOddDigits(){
        Functions f = new Functions();
        System.out.println(("Total number of odd digits from a number is ")
                   + (f.oddDigit(123456)));
    }

    public static void callSameDigits(){
        Functions f = new Functions();
        System.out.println("Are 777 the same numbers? " + f.sameDigits(777));
    }

    public static void callSmallestEven(){
        Functions f = new Functions();
        System.out.println("Smallest even digit for 123456789 is:  " + f.smallestEven(123456789));
    }

    public static void callReversedNumber(){
        Functions f = new Functions();
        System.out.println("Reversed number 789 is: " + f.reverseNr(789));

    }
    public static void main(String[] args) {
        callNrDigits();
        callMinNumber();
        callEvenDigits();
        callMaxDigit();
        callOddDigits();
        callSameDigits();
        callSmallestEven();
        callReversedNumber();

    }
}
