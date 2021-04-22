package f.LogicalOperators;
//Which of the following expressions return value 1?
public class LogicalOperations2 {
    public static void main(String[] args) {
        int a=31;
        int b=24;

        boolean ex1=a%2==0&&b%2==1;//false

        boolean ex2= !(!(a%2==1) || b%2==1);//true

        boolean ex3= (a+b+1)%2==4;//false

        boolean ex4=!(a%2==1) || b%2==0;//true

        System.out.println("Ex 1" + ex1);
        System.out.println("Ex2 "+ ex2);
        System.out.println("ex3 "+ ex3);
        System.out.println("ex4 " + ex4);
    }
}
