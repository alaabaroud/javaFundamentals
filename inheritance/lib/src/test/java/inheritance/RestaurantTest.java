package inheritance;

import org.junit.jupiter.api.Test;

import java.security.interfaces.RSAKey;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RestaurantTest {
    @Test
    public void RestaurantTest(){
        Restaurant restaurantTest = new Restaurant("Test", 5, 4);
        assertEquals("Test", "Test", restaurantTest.getName());
    }

    @Test
    public void starsTest (){
        Restaurant starsTest = new Restaurant("starstest", 5, 1);
        assertEquals(5, 5, starsTest.getStars());
    }
    @Test
    public  void categoryTest(){
        Restaurant categoryTest = new Restaurant("Test", 1, 6666);
        assertEquals(6666, 6666, categoryTest.getPriceCategory());
    }
}
