package f.LogicalOperators;
//Which of the expressions have value 1 only if a and b have the same sign and are odd
public class LogicalOperations {
    public static void main(String[] args) {
        int a=23 ,b=17;
        boolean ex1= a+b>0 && a%2!=0  && b%2!=0;
        boolean ex2 = !(a%2==0 || b%2 == 0) && (a*b<0);
        boolean ex3 = a%2+b%2==2&&a*b>0;
        boolean ex4 = (a%2>0 && b%2>0) || !(a%2+b%2<2);
        /*a%2 => T
         * si
         * b%2 => T
         * T&&T=> T
         * or negative
         * a%2(1) + b%2(1) < 2? => !F => T
         * T || T => T
         * */
        System.out.println(ex1);//true
        System.out.println(ex2);//false
        System.out.println(ex3);//True
        System.out.println(ex4);//true

    }
}
