package capitolul_3;

public class Substring {
    public static void main(String[] args) {
        String cuvant = "andreea";
        System.out.println(cuvant.substring(4)); //eea
        System.out.println(cuvant.substring(cuvant.indexOf('d'))); //dreea
        System.out.println(cuvant.substring(3,4)); // r
        System.out.println(cuvant.substring(3,6)); // ree

    }
}
