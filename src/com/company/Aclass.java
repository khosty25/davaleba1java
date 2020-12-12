import java.util.Scanner;

public class Aclass {
    int x;
    String Hello;

    public Aclass(String printed) {
        this.Hello = printed;
    }

    public void first2() {
        Scanner input = new Scanner(System.in);
        System.out.println("print x :");
        this.x = input.nextInt();
    }

    public void second2() {
        System.out.println("x+12 =" + (this.x + 12));
    }

    public void third2() {
        if (this.x % 2 == 0) {
            System.out.println("x luwia");
        } else {
            System.out.println("x kentia");
        }

    }
}
