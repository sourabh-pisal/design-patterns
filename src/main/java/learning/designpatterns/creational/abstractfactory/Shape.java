package learning.designpatterns.creational.abstractfactory;

interface Shape {
    String getShape();
}

class Rectangle implements Shape {

    private static final String SHAPE = "Rectangle";

    @Override
    public String getShape() {
        return SHAPE;
    }
}

class Circle implements Shape {

    private static final String SHAPE = "Circle";

    @Override
    public String getShape() {
        return SHAPE;
    }
}

class Triangle implements Shape {

    private static final String SHAPE = "Triangle";

    @Override
    public String getShape() {
        return SHAPE;
    }
}