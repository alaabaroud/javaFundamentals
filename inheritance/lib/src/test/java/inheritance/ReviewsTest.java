package inheritance;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReviewsTest {


    @Test
    public void bodyTest() {
        Review Review = new Review("bad", "helllo", 4);
        assertEquals("bad", "bad", Review.getBody());
    }

    @Test
    public void StarsTest () {
        Review Review = new Review("bad", "helllo", 4);

        
        assertEquals(4, 4, Review.getStars());
    }

    @Test
    public void AuthorTest () {
        Review Review = new Review("bad", "helllo", 4);
        assertEquals("helllo", "helllo", Review.getAuthor());
    }
    @Test
    public void toStringTest () {
        Review Review = new Review("bad", "helllo", 4);
String output = "Review {author='helllo', body='bad', stars=4}";
        assertEquals(output,Review.toString(),"Review {author='helllo', body='bad', stars=4}");
    }
}


