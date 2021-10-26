package capitolul_2;

public class ForExemplu3 {
    public static void main(String[] args) {
     //   int x = 0;
        for(long y = 0, x = 4; x < 5 && y < 10; x++, y++) { // DOES NOT COMPILE
            System.out.print(x + " "); // s ar afisa val 4 daca nu este declarat sus, altfel eroare de compilare
        }
    }
}
