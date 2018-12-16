package learning.designpatterns.creational.abstractfactory;

interface AbstractFactory {

    String ERROR_MSG = "This Operation Is Not Supported";

    default Shape getShape(String shape) {
        throw new UnsupportedOperationException(ERROR_MSG);
    }

    default Color getColor(String color) {
        throw new UnsupportedOperationException(ERROR_MSG);
    }
}
