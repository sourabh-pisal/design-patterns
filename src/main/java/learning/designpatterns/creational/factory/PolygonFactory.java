package learning.designpatterns.creational.factory;

import static java.lang.String.format;

class PolygonFactory {

    private static final String INVALID_NUMBER_ERR_MSG = "Invalid Number Of Sides %d";

    static Polygon getPolygon(int numberOfSides) {

        switch (numberOfSides) {
            case 3:
                return new Triangle();
            case 4:
                return new Rectangle();
            case 5:
                return new Pentagon();
            default:
                throw new IllegalArgumentException(format(INVALID_NUMBER_ERR_MSG, numberOfSides));
        }
    }
}
