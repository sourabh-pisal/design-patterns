package learning.designpatterns.creational.factory;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static learning.designpatterns.creational.factory.PolygonFactory.getPolygon;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

public class PolygonFactoryTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();
    private int numberOfSides;
    private String expectedPolygon;

    @Test
    public void givenThreeSidesThenShouldReturnTriangle() {
        //Given
        numberOfSides = 3;
        expectedPolygon = "Triangle";

        //When
        Polygon triangle = getPolygon(numberOfSides);

        //Then
        assertThat(triangle, is(notNullValue()));
        assertThat(triangle.getType(), is(expectedPolygon));
    }

    @Test
    public void givenFourSidesThenShouldReturnRectangle() {
        //Given
        numberOfSides = 4;
        expectedPolygon = "Rectangle";

        //When
        Polygon triangle = getPolygon(numberOfSides);

        //Then
        assertThat(triangle, is(notNullValue()));
        assertThat(triangle.getType(), is(expectedPolygon));
    }

    @Test
    public void givenFiveSidesThenShouldReturnPentagon() {
        //Given
        numberOfSides = 5;
        expectedPolygon = "Pentagon";

        //When
        Polygon triangle = getPolygon(numberOfSides);

        //Then
        assertThat(triangle, is(notNullValue()));
        assertThat(triangle.getType(), is(expectedPolygon));
    }

    @Test
    public void givenInvalidSidesThenShouldThrowIllegalArgumentException() {
        //Given
        numberOfSides = 10;
        String expectedExceptionMessage = "Invalid Number Of Sides " + numberOfSides;

        //Then
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage(expectedExceptionMessage);

        //When
        getPolygon(numberOfSides);
    }
}
