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
            number = number / 10;
            if (number % 2 == 0 && number != 0) {
                count++;
            }
        }
        return count;
    }
}