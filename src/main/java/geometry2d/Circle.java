package geometry2d;

import Exceptions.AreaException;
import Exceptions.NegativeValueException;

public class Circle implements Figure {
    static double radius;

    public Circle(double R) {
        if (R < 0) {
            throw new NegativeValueException("Радиус введен некорректно");
        }
        radius = R;
    }

    public double area() {
        double result = Math.PI * radius * radius;

        if (result <= 0) {
            throw new AreaException("Площадь меньше или равна нулю");
        }

        return result;
    }

    public String toString() {
        return String.valueOf(radius);
    }
}