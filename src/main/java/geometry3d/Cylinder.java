package geometry3d;

import Exceptions.AreaException;
import Exceptions.NegativeValueException;
import geometry2d.Circle;
import geometry2d.Figure;

public class Cylinder {
    static Figure base;
    static double height;

    public Cylinder(double radius, double height){

        if (radius < 0 || height < 0) {
            throw new NegativeValueException("Радиус введен некоректно");
        }

        base = new Circle(radius);

    }

    public double volume(){
        double result = base.area() * height;

        if (result <= 0) {
            throw new AreaException("Площадь меньше или равна нулю");
        }

        return result;
    }
}
