import java.util.Arrays;
import java.util.Scanner;

public class Dclass {
    public static void main(String[] args){
        int[] lists = new int[40];
        Scanner input = new Scanner(System.in);
        System.out.println("print a: ");
        int a = input.nextInt();
        System.out.println("print b: ");
        int b = input.nextInt();

        if(a>b){
            int shecvla = a;
            a = b;
            b = shecvla;
        }

        for (int i=0; i<40; i++) {
            int randoms = (int) (Math.random()*(b-a+1+a));
            lists[i] = randoms;
        }
        System.out.println("shemtxveviti 40 ricxvi:" + Arrays.toString(lists));
        int luwi=0, kenti=0, luwisjami=0, kentisjami=0;

        for (int i : lists){
            if (i%2==0){
                luwi++;
                luwisjami +=i;
            }
            else{
                kenti++;
                kentisjami +=i;
            }
        }
        System.out.println("luwia: " + luwi + " | luwebis jamia " + luwisjami + "\nkentia: " + kenti + " | kentebis jamia " + kentisjami );
    }

}