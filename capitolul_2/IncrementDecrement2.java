package capitolul_2;

public class IncrementDecrement2 {
    public static void main(String[] args) {
        int x = 3;
        int y = ++x * 5 / x-- + --x; // 20/ 4+ 2 = 7
        System.out.println("X este: "+ x); // 1
        System.out.println("Y este: "+ y); // 7
    }
}
