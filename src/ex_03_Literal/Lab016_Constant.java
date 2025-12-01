package ex_03_Literal;

public class Lab016_Constant {
    static void main(String[] args) {
        int a =10;
        a =20;
        System.out.println(a);
// but if we use final then value cannot be change
        final int b=99;
       // b=100;
        System.out.println(b); // we cannot assign a value to final variable b
        // final is not datatype its a keyword
    }
}
