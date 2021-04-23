package postPreOperators;

public class PostInc {
    public static void main(String[] args) {

        int x=12,y=14,z=23;
        x++;//x becomes 13
        ++y;//y becomes 15

        System.out.println(x);// 13
        System.out.println(y);// 15

        x=y++;//x becomes 15  y becomes 16
        System.out.println("Value of x is " + x);

        z+=9;//z(23) 9 is added  => 32  z becomes 32
        System.out.println("Value of z is " + z);
        x+=z--;//x(15) to x is added value of z minus 1=> x becomes 47 then z becomes 31
        System.out.println("Value of x is " + x);
        x=z++;//x (47) takes values of z(31) s1 is added=> x becomes 31, z becomes 32
        System.out.println("Value of x is " + z);
        y=--z;//y (16) takes the value of z (31)=> z becomes 31  then y becomes  31
        System.out.println("Value of y is " + y);
        y-=x++;//y(31) subtract z(31)=> y becomes 0, x becomes 32
        System.out.println("Value of y is " + y);


        System.out.println("Final value of x is " + x);// 32
        System.out.println("Final value of y is " + y);///0
        System.out.println("Final value of z is " + z);// 31
    }
}
