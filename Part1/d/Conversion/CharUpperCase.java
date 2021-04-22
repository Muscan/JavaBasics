package d.Conversion;

import java.util.Scanner;

public class CharUpperCase {
    public static void main(String[] args) {
        //todo convert an lowercase to an uppercase: Ex. c -> C

        Scanner read = new Scanner(System.in);
        System.out.println("Insert an alphanumeric character to convert and press enter key: ");

         char character = read.nextLine().charAt(0);
         character = (char)((int)character-32);

         System.out.println(character);
    }
}
