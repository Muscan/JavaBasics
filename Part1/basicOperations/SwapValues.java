package basicOperations;

import java.util.Scanner;

//todo insert two values from the keyboard. Swap the values
public class SwapValues {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("x= ");
        int x=input.nextInt();
        System.out.print("y= ");
        int y=input.nextInt();
        System.out.println("before swap");
        System.out.println("x= "+x);
        System.out.println("y= "+y);
        //todo:swap with aux
        System.out.println("With aux ");
        int aux;

        aux=x;
        System.out.println("Aux becomes "+ x);
        x=y;
        System.out.println("x becomes" + x);
        System.out.println("y becomes " + y);
        y=aux;
        System.out.println("y becomes " + y);

        //todo:swap without aux

        x=x+y;
        y=x-y;
        x=x-y;

        System.out.println("After swap ");
        System.out.println("x= "+x);
        System.out.println("y= "+y);
    }
}
