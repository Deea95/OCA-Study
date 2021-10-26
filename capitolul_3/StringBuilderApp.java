package capitolul_3;

public class StringBuilderApp {
    public static void main(String[] args) {
        StringBuilder alpha = new StringBuilder();
        for(char current = 'a'; current <= 'z'; current++)
         alpha.append(current);
        System.out.println(alpha);
    }
}
