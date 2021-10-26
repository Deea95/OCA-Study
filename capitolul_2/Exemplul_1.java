package capitolul_2;

public class Exemplul_1 {
    public static void main(String[] args) {
        int y = 4;
        int a = --y; // 3
        int b = ++y; // 4
        int c = y--; // 4
        int d = y++; // 3
        System.out.println("Rezultatul lui a este: " + a);
        System.out.println("Rezultatul lui b este: " + b);
        System.out.println("Rezultatul lui c este: " + c);
        System.out.println("Rezultatul lui d este: " + d);
        double x = 3 + 2 * --y;
        System.out.println("Rezultatul lui x este: " + x);
    }

    /*
             -----   TABLE 2.1 Order of operator precedence  -------
Operator Symbols    :                 examples :

Post-unary operators                 expression++, expression--
Pre-unary operators                  ++expression, --expression
Other unary operators                +, -, !
Multiplication/Division/Modulus      *, /, %
Addition/Subtraction                 +, -
Shift operators                      <<, >>, >>>
Relational operators                 <, >, <=, >=, instanceof
Equal to/not equal to                ==, !=
Logical operators                    &, ^, |
Short-circuit logical operators      &&, ||
Ternary operators                    boolean expression ? expression1 : expression2
Assignment operators                 =, +=, -=, *=, /=, %=, &=, ^=, !=, <<=, >>=, >>>=
     */
}
