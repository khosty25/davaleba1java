public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Cclass p1 = new Cclass();
        p1.last1();
        p1.first1();
        p1.sum1();
        int mult1 = p1.last1() * p1.b;
        System.out.println("meore da mesames namravlia: " + mult1);
        int sum2 = p1.b + mult1;
        System.out.println("mesames da mexutes jamia: " + sum2);
        Aclass p2 = new Aclass("Hello");
        System.out.println(p2.Hello);
        p2.first2();
        p2.second2();
        p2.third2();
        Bclass p3 = new Bclass();
        p3.first3();
        System.out.println(p3.second3());
    }
}