package learning.designpatterns.creational.abstractfactory;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static learning.designpatterns.creational.abstractfactory.FactoryProvider.getFactory;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsNull.notNullValue;

public class AbstractFactoryTest {

    private static final String COLOR = "Color";
    private static final String SHAPE = "Shape";

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void givenRedColorStringWhenFactoryMethodCalledShouldReturnRedColor() {
        //Given
        String color = "Red";
        //When
        Color red = getFactory(COLOR).getColor(color);

        //Then
        assertThat(red, is(notNullValue()));
        assertThat(red.getColor(), is(color));
    }

    @Test
    public void givenBlueColorStringWhenFactoryMethodCalledShouldReturnBlueColor() {
        //Given
        String color = "Blue";
        //When
        Color blue = getFactory(COLOR).getColor(color);

        //Then
        assertThat(blue, is(notNullValue()));
        assertThat(blue.getColor(), is(color));
    }

    @Test
    public void givenGreenColorStringWhenFactoryMethodCalledShouldReturnGreenColor() {
        //Given
        String color = "Green";
        //When
        Color green = getFactory(COLOR).getColor(color);

        //Then
        assertThat(green, is(notNullValue()));
        assertThat(green.getColor(), is(color));
    }

    @Test
    public void givenColorWhenTriedToCallShapeShouldThrowUnsupportedOperationException() {
        //Then
        thrown.expect(UnsupportedOperationException.class);

        //When
        getFactory(COLOR).getShape("");
    }

    @Test
    public void givenRectangleShapeStringWhenFactoryMethodCalledShouldReturnRectangleShape() {
        //Given
        String shape = "Rectangle";
        //When
        Shape rectangle = getFactory(SHAPE).getShape(shape);

        //Then
        assertThat(rectangle, is(notNullValue()));
        assertThat(rectangle.getShape(), is(shape));
    }

    @Test
    public void givenCircleShapeStringWhenFactoryMethodCalledShouldReturnCircleShape() {
        //Given
        String shape = "Circle";
        //When
        Shape circle = getFactory(SHAPE).getShape(shape);

        //Then
        assertThat(circle, is(notNullValue()));
        assertThat(circle.getShape(), is(shape));
    }

    @Test
    public void givenTriangleShapeStringWhenFactoryMethodCalledShouldReturnTriangleShape() {
        //Given
        String shape = "Triangle";
        //When
        Shape triangle = getFactory(SHAPE).getShape(shape);

        //Then
        assertThat(triangle, is(notNullValue()));
        assertThat(triangle.getShape(), is(shape));
    }

    @Test
    public void givenShapeWhenTriedToCallColorShouldThrowUnsupportedOperationException() {
        //Then
        thrown.expect(UnsupportedOperationException.class);

        //When
        getFactory(SHAPE).getColor("");
    }

    @Test
    public void givenInvalidShapeShouldThrowIllegalArgumentException() {
        //Then
        thrown.expect(IllegalArgumentException.class);

        //When
        getFactory(SHAPE).getShape("");
    }

    @Test
    public void givenInvalidColorShouldThrowIllegalArgumentException() {
        //Then
        thrown.expect(IllegalArgumentException.class);

        //When
        getFactory(COLOR).getColor("");
    }

    @Test
    public void givenInvalidFactoryParameterShouldThrowIllegalArgumentException() {
        //Then
        thrown.expect(IllegalArgumentException.class);

        //When
        getFactory("");
    }
}
