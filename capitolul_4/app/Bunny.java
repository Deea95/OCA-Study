package capitolul_4.app;

// Exemple neoisnuite cu CONSTRUCTORI, dar care pot aparea la examen

public class Bunny {

 private String color;
private int height;
private int length;
 public Bunny(int length, int theHeight) {
             length = this.length; // backwards – no good! - ESTE INCORECTA!!!! - valoarea initiala este 0
     height = theHeight; // fine because a different name
           this.color = "white"; // fine, but redundant
            }
 public static void main(String[] args) {
            Bunny b = new Bunny(1, 2);
            System.out.println(b.length + " " + b.height + " " + b.color); // 0 2 white
             } }

