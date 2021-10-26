package capitolul_3;

import java.util.concurrent.ExecutorService;

public class EqualsString {
    String name;

    public static void main(String[] args) {
        EqualsString es1 = new EqualsString();
        EqualsString es2 = new EqualsString();
        EqualsString es3 = es1;
        System.out.println(es1 == es1); // true
        System.out.println(es1 == es2); // false
        System.out.println(es1.equals(es2)); // false
    }
}
