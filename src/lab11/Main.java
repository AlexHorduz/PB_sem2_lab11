package lab11;

import lab11.interfaces.Calculator;
import lab11.models.Rectangle;

import java.util.ArrayList;
import java.util.Arrays;

import static  java.lang.Math.*;

public class Main {

    public static void main(String[] args) {
        Calculator calcEquation3 = (a, b, c, d) -> pow(2 * sin(a) + cos(abs(b * sqrt(c))), d);
        task1(calcEquation3, 1, 2, 3, 4);
        System.out.println("\n");


        Rectangle r1 = new Rectangle(3, 5);
        Rectangle r2 = new Rectangle(6, 22);
        Rectangle r3 = new Rectangle(8, 1);
        Iterable<Rectangle> list = new ArrayList<>(Arrays.asList(r1, r2, r3));
        list.forEach(rect -> System.out.println(rect));
    }

    public static void task1(Calculator calc, double a, double b, double c, double d) {
        System.out.println(a + " " + b + " " + c + " " + d);
        System.out.println(calc.calculate(a, b, c, d));
    }
}
