package capitolul_1;

public class Scope {
    public static void main(String[] args) {
        String one, two;
        one = new String("a");
        two = new String("b");
        one = two;
        String three = one;
        one = null;
        System.out.println("Litera pentru one este: " + one); // null
        System.out.println("Litera pentru two este: " + two); // b
        System.out.println("Litera pentru three este: " + three); // b
    }
}
