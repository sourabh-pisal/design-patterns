package learning.designpatterns.creational.abstractfactory;

import static java.lang.String.format;

public class ShapeFactory implements AbstractFactory {

    private static final String INVALID_SHAPE_MSG = "Invalid Shape %s";

    @Override
    public Shape getShape(String shape) {
        switch (shape) {
            case "Rectangle":
                new Rectangle();
            case "Circle":
                new Circle();
            case "Triangle":
                new Triangle();
            default:
                throw new IllegalArgumentException(format(INVALID_SHAPE_MSG, shape));
        }
    }
}
