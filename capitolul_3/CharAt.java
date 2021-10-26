package capitolul_3;

public class CharAt {
    public static void main(String[] args) {
        String cuvant = "animale";
        System.out.println(cuvant.charAt(0)); // a
        System.out.println(cuvant.charAt(6)); // e
        System.out.println(cuvant.charAt(7)); //  java.lang.StringIndexOutOfBoundsException
    }
}
