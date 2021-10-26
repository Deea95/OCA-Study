package capitolul_2;

public class ForExemplu2 {
    public static void main(String[] args) {
        int x = 0;
        for(long y = 0, z = 4; x < 5 && y < 10; x++, y++) {
            System.out.println(y + "  "); // 0 1 2 3 4
        }
        System.out.println("X este: " +x); // 5
    }
}
