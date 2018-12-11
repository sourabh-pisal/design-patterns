package learning.designpatterns.creational;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class SingletonTest {

    @Test
    public void testSingletonObject() {
        Singleton singletonObject1 = Singleton.getInstance();
        Singleton singletonObject2 = Singleton.getInstance();

        assertThat(singletonObject1, is(notNullValue()));
        assertThat(singletonObject2, is(notNullValue()));

        assertThat(singletonObject1, equalTo(singletonObject2));
    }
}