package inheritance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TheaterTest {


    @Test
    public void testing() {
        Theater theaterTest = new Theater("hello");
        assertEquals("hello", "hello", theaterTest.getName());
    }

    @Test
    public  void toStringTest() {
        Theater theaterTest = new Theater("hello");
        System.out.println(theaterTest.toString());
        assertEquals("movies : {name='hello', reviews=[], movies=[]}", "movies : {name='hello', reviews=[], movies=[]}", theaterTest.toString());

    }

    @Test
    public  void removing() {
        Theater theaterTest = new Theater("hello");
        theaterTest.addMovie("movie1");
        theaterTest.addMovie("movie2");
        theaterTest.addMovie("movie3");
        theaterTest.removeMovie("movie2");
        System.out.println(theaterTest.toString());
       assertEquals("movies : {name='hello', reviews=[], movies=[movie1, movie3]}",  "movies : {name='hello', reviews=[], movies=[movie1, movie3]}", theaterTest.toString());


    }


}
