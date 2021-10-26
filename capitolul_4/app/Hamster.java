package capitolul_4.app;

public class Hamster {
    private String color;
    private int weight;
    public Hamster(int weight) { // first constructor
        this.weight = weight;
        color = "brown";
    }
    public Hamster(int weight, String color) { // second constructor
        this.weight = weight;
        this.color = color;
    }

    public static void main(String[] args) {
        Hamster hamster = new Hamster(100, "red");
        System.out.println(hamster.toString());
    }
}
