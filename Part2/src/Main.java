import utils.Functions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Functions f = new Functions();
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number, ex 1029    ");
        int number = reader.nextInt();
        System.out.println("Min. digit is " + f.minNumber(number));
    }
}
