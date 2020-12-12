import java.util.Scanner;

public class Cclass {
    Scanner input = new Scanner(System.in);
    protected int a = input.nextInt();
    protected int b = input.nextInt();
    protected int c = input.nextInt();

    public int last1() {
        int bolo = a % 10;
        System.out.println("a-s bolo cifria: " + bolo);
        return bolo;
    }
    public int first1() {
        while (b >= 10)
            b /= 10;
        System.out.println("b-s pirveli cifria: " + b);
        return b;
    }
    void  sum1() {
        int jami = 0;
        while (c > 0){
            jami = jami + c%10;
            c = c / 10;
        }
        System.out.println( "c-s cifrta jamia: " + jami);
    }
}