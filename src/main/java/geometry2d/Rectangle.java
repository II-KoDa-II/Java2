package geometry2d;

import Exceptions.AreaException;
import Exceptions.NegativeValueException;

public class Rectangle implements Figure {

    static double length;
    static double height;

    public Rectangle(double length, double height) {
        if (length < 0 || height < 0) {
            throw new NegativeValueException("Стороны введены некорректно");
        }
    }

    public double area() {
        double result = length * height;

        if (result <= 0) {
            throw new AreaException("Площадь меньше или равна нулю");
        }

        return result;
    }

    public String toString() {
        return String.valueOf((length + height) * 2);
    }
}
