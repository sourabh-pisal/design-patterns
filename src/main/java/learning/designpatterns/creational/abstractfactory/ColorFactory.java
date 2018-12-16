package learning.designpatterns.creational.abstractfactory;

import static java.lang.String.format;

public class ColorFactory implements AbstractFactory {

    private static final String INVALID_COLOR_MSG = "Invalid Color %s";

    @Override
    public Color getColor(String color) {
        switch (color) {
            case "Red":
                return new Red();
            case "Green":
                return new Green();
            case "Blue":
                return new Blue();
            default:
                throw new IllegalArgumentException(format(INVALID_COLOR_MSG, color));
        }
    }
}
