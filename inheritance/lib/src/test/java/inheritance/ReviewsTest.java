package inheritance;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReviewsTest {


    @Test
    public void bodyTest() {
        Review review = new Review("bad", "helllo", 4);
        assertEquals("bad", "bad", review.getBody());
    }

    @Test
    public void StarsTest () {
        Review review = new Review("bad", "helllo", 4);
        assertEquals(4, 4, review.getStars());
    }

    @Test
    public void AuthorTest () {
        Review review = new Review("bad", "helllo", 4);
        assertEquals("helllo", "helllo", review.getAuthor());
    }
    @Test
    public void toStringTest () {
        Review review = new Review("bad", "helllo", 4);
String output = "Review {author='helllo', body='bad', stars=4}";
        assertEquals(output,review.toString(),"Review {author='helllo', body='bad', stars=4}");
    }
}


