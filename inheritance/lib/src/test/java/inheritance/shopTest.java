package inheritance;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class shopTest {


//
// @Test void test(){
//     Shop ahmad = new  Shop("ahmad","hello",12);
//     assertEquals("ahmad",ahmad.getName());
//
// }

  @Test  void ConstructorParameterValidation_ReturnTrueOnEachProperty() {
        Shop ahmad = new  Shop("ahmad","hello",12);

        Review rev = new Review(5, "Mohammad", "High Rate Food", ahmad);
        assertEquals(5, rev.getStars());
        assertEquals("Mohammad", rev.getAuthor());
        assertEquals("High Rate Food", rev.getBody());
    }




  @Test void theater (){
    Theater oxi = new Theater("oxi");
    TReview rev1 = new TReview("it's nise","ahmad",3,"harry potter",oxi);
    TReview rev2 = new TReview("it's nise","ahmad",5,"harry potter",oxi);
      assertEquals(3, rev1.getStars());
      assertEquals("ahmad", rev1.getAuthor());
      assertEquals("harry potter", rev2.getmovie());


  }





}
