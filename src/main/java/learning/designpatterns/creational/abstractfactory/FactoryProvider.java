package learning.designpatterns.creational.abstractfactory;

import static java.lang.String.format;

class FactoryProvider {

    private static final String INVALID_CHOICE_MSG = "Invalid Choice %s";

    static AbstractFactory getFactory(String choice) {
        switch (choice) {
            case "Shape":
                return new ShapeFactory();
            case "Color":
                return new ColorFactory();
            default:
                throw new IllegalArgumentException(format(INVALID_CHOICE_MSG, choice));
        }
    }
}
