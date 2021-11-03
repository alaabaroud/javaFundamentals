package inheritance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ShopTest {


    @Test
    public void shopTest() {
        Shop shop1 = new Shop("shop1", "store", 4);
   assertEquals("shop1", "shop1", shop1.toString());

    }
@Test
    public void sign() {
        Shop shop1 = new Shop("shop1", "store", 4);
        assertEquals("4", "4", shop1.toString());

    }

@Test
    public void toStringTest() {
        Shop shop1 = new Shop("shop1", "store", 4);
        assertEquals("Shop{name='shop1', stars=0, description='store', sign=4, review=[]}", "Shop{name='shop1', stars=0, description='store', sign=4, review=[]}", shop1.toString());
        System.out.println(shop1.toString());

    }




}
