package capitolul_1;

import java.util.ArrayList;
import java.util.List;

public class Finalizer {
    protected void finalize(){
        objects.add(this); // nu faceti asta
        System.out.println("Calling finalize!");
    }
    private static List objects = new ArrayList();

    public static void main(String[] args) {
        Finalizer f = new Finalizer();
    }
}