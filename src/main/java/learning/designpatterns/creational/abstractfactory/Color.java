package learning.designpatterns.creational.abstractfactory;

interface Color {
    String getColor();
}

class Red implements Color {

    private static final String COLOR = "Red";

    @Override
    public String getColor() {
        return COLOR;
    }
}

class Green implements Color {

    private static final String COLOR = "Green";

    @Override
    public String getColor() {
        return COLOR;
    }
}

class Blue implements Color {

    private static final String COLOR = "Blue";

    @Override
    public String getColor() {
        return COLOR;
    }
}
