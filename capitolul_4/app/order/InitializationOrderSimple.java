package capitolul_4.app.order;

public class InitializationOrderSimple {
    private String name = "Torchie";
{ System.out.println(name); } // Torchie
 private static int COUNT = 0;
 static { System.out.println(COUNT); } // 0
 static { COUNT += 10; System.out.println(COUNT); } // 10
 public InitializationOrderSimple() {
         System.out.println("constructor"); // constructor
       }
}
