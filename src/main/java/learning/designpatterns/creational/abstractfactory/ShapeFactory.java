package learning.designpatterns.creational.abstractfactory;

import static java.lang.String.format;

public class ShapeFactory implements AbstractFactory {

    private static final String INVALID_SHAPE_MSG = "Invalid Shape %s";

    @Override
    public Shape getShape(String shape) {
        switch (shape) {
            case "Rectangle":
                return new Rectangle();
            case "Circle":
                return new Circle();
            case "Triangle":
                return new Triangle();
            default:
                throw new IllegalArgumentException(format(INVALID_SHAPE_MSG, shape));
        }
    }
}
