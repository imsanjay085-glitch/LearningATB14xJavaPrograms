package ex_02_JavaProrams;
// task print table of nine using printf command
public class Lab015_printf {
    static void main(String[] args) {
        int n =9;
        System.out.printf("%d*1 =%d\n" , n,n*1);
        System.out.printf("%d*2 =%d\n" , n,n*2);
        System.out.printf("%d*3 =%d\n" , n,n*3);
        System.out.printf("%d*4 =%d\n" , n,n*4);
        System.out.printf("%d*5=%d\n" , n,n*5);
        System.out.printf("%d*6 =%d\n" , n,n*6);
        System.out.printf("%d*7 =%d\n" , n,n*7);
        System.out.printf("%d*8 =%d\n" , n,n*8);
        System.out.printf("%d*9 =%d\n" , n,n*9);

        //( trick is we use %d*1 = %d where %d*1 (%d) is store in n and after = %d  value is store in n*1)


    }
}
