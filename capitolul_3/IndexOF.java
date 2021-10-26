package capitolul_3;

public class IndexOF {
    public static void main(String[] args) {
        String cuvant = "andreea";
        System.out.println(cuvant.indexOf('a')); // 0
        System.out.println(cuvant.indexOf("dr")); // 2
        System.out.println(cuvant.indexOf("a", 5)); // 6
        System.out.println(cuvant.indexOf('e', 4)); // 4
    }
}
