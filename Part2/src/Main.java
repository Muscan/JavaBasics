import utils.Functions;

import java.util.Scanner;

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


    public static void main(String[] args) {
        callNrDigits();
        callMinNumber();
        callEvenDigits();
    }
}
