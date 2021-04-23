package conditionalIf;

import java.util.Scanner;

public class MaxIf {
    public static void main(String[] args) {

        //todo:Add 2 numbers.Print the max
        Scanner readScanner = new Scanner(System.in);
        System.out.println("Insert first nr.");
        int x = readScanner.nextInt();
        System.out.println("Insert second nr.");
        int y = readScanner.nextInt();
        //todo:if
//        if (x > y){
//
//            System.out.println("Max is "+x);
//        }
//        if (x < y){
//            System.out.println("MMax is" + y);
//        }
//        if (x==y){
//            System.out.println("Numbers are equal");
//        }

        //todo:if ele
/*
       if(x > y){
           System.out.println("Max is  " + x);
           } else {
           System.out.println("Max is " + y);
       }*/
        //todo: if else var 2.

        if (x > y){
            System.out.println("Max is " + x);
        } else if (x < y){
            System.out.println("Max is  " + y);
        } else if (x == y){
            System.out.println("Numbers are equal");
        } else if (x != 0){
            System.out.println("Inserted number " +  x + "is != 0");
        }
        else if (y ==0){
            System.out.println("Inserted number " +  y + " is != 0");
        }
    }

}
