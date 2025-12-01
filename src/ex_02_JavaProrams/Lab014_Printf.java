package ex_02_JavaProrams;

public class Lab014_Printf {
    static void main(String[] args) {
        int a = 10;
        int b =20;
        System.out.println(a);
        System.out.println(b);

        System.out.print(a);
        System.out.print(b);

        System.out.printf("value of a = %d", a);
        System.out.println();
        System.out.printf("value of b = %d", b);

        // %d works for int,byte,short, long - data type
        // %s = string
        // %f - float, double
        // %b - boolean

    }
}
