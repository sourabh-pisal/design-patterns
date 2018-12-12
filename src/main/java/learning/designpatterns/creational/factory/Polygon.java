package learning.designpatterns.creational.factory;

interface Polygon {
    String getType();
}

class Triangle implements Polygon {

    private static final String TYPE = "Triangle";

    @Override
    public String getType() {
        return TYPE;
    }
}

class Rectangle implements Polygon {

    private static final String TYPE = "Rectangle";

    @Override
    public String getType() {
        return TYPE;
    }
}

class Pentagon implements Polygon {

    private static final String TYPE = "Pentagon";

    @Override
    public String getType() {
        return TYPE;
    }
}