package utils;

public class Functions {
    // todo:add a function for the min

    public int minNumber(int number) {
        int min = number % 10;
        while (number != 0) {
            int digit = number % 10;
            if (digit < min) {
                min = digit;
            }
            number = number / 10;
        }
        return min;
    }

    //todo: add a function for counting the number of digits

    public int numberOfDigits(int number) {
        int digitNumber = 0;
        int count = 0;
        while (number != 0) {
            count++;
            number = number / 10;
        }
        return count;
    }

    //todo: add a function for counting the even digits of a number

    public  int evenDigits(int number) {
        int count = 0;
        if(number == 0)
            return 1;
        while (number != 0) {

            if (number % 2 == 0 && number != 0) {
                count++;
            }
            number = number / 10;
        }
        return count;
    }

    //todo: add a function for the max digit

    public int maxDigit(int number){
        int maxim = number % 10;
        while (number != 0) {
            int digit = number % 10;

            if (digit > maxim) {
                maxim = digit;
            }
            number = number / 10;
        }

        return maxim;
    }

    public int oddDigit(int number){
        return (numberOfDigits(number) - evenDigits(number));
    }

    public boolean sameDigits(int number){
        int lastDigit = number % 10;
        while (number != 0) {
            int digit = number % 10;
            if (digit != lastDigit) {
                return false;
            }

            number = number / 10;
        }

        return true;
    }
//check the greatest and smallest even digit of a number
   public int smallestEven(int number) {

    int smallestDigit = 10;
    while (number != 0) {
        int digit = number % 10;
        if (digit < smallestDigit && digit % 2 == 0) {
            smallestDigit = digit;
        }
        number = number / 10;

        }

        return smallestDigit;
    }

    public  int reverseNr(int number){
        int reversedNumber = 0;
        int digit = 0;
        while (number !=0) {
            digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number = number / 10;
        }
        return reversedNumber;
    }

}
