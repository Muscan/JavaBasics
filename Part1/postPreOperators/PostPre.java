package postPreOperators;

public class PostPre {
    public static void main(String[] args) {
        int a=90,b=12,c=89;
        int r=-10 ,t=78,k=2;
        --a;//a becomes 89
        System.out.println("Value of --a is " + a);
        b++;//b becomes 13
        System.out.println("Value of b++ is " + b);
        a=b--;//a(89) takes the value of  b(13)=> a becomes 13, b becomes 12
        System.out.println("Value of a is " + a);
        c=a++;//c(89) takes the value of a(13)=> c becomes 13, a becomes 14
        System.out.println("Value of c is " + c);
        b=++a;//b (12)takes the values of a(14)=> a becomes 15 then  b becomes 15,
        System.out.println("Value of b is " + b);
        System.out.println(a++);//print 15  then becomes 16
        System.out.println(++c);//c becomes 14, print 14
        b+=a;//b takes the value of  a+b (16+15)  => b becomes 30
        System.out.println("Value of b+ is " + b);
        a=++c;//a(16) takes the values of c(14) incremented with 1 =>  c becomes 15  then a becomes 15,
        System.out.println("Value of a is " + a);
        System.out.println("Final " + a);// 15
        System.out.println("Final " + b);// 31
        System.out.println("Final " + c);// 15


        r+=t++;//r(10) takes the values of  r+t(78)=> r becomes 88, t becomes 79
        k-=r++;//k(2) takes the value of k-r(-86)=> c becomes -86,  r becomes 89
        System.out.println("Value of --t is " + --t);//decrement 1 from 79 => 78, printed will be 78
        System.out.println("Value of t++ is " + t++);//printed is  78, incremented with 1, t becomes 79
        System.out.println("Value of t is " + t);// 79 is printed
        k-=r--;//c(-86) takes the value of r(c-r), -86 -89=> k becomes 3, r becomes 88
        System.out.println("Value of k- is " + k);
        t=++k;
        System.out.println("Value of t is " + t);
        r=--k;
        System.out.println("Value of r is " + r);
        k=r++;
        System.out.println("Value of k is " + k);

    }
}
