package inheritance;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class RestaurantTest {
    @Test
    void ValidConstructorParameters_ReturnTrueOnEachProperty() {
        Restaurant res = new Restaurant("99Grill", 4, 25);
        assertEquals("99Grill", res.getName());
        assertEquals(4, res.getRate());
        assertEquals(25, res.getPrice());
    }



    @Test
    void Restaurant_toString_ReturnString_With_TheSpecifiedFormat() {
        Restaurant res = new Restaurant("99Grill", 4, 25);
        assertEquals("Restaurant\nName : 99Grill\nprice : 25\nRate : 4.0\nReviews : []", res.toString());
    }
    @Test
    void Restaurant_toString_ReturnString_With_TheSpecifiedFormat_AlongWith_A_Review() {
        Restaurant res = new Restaurant("99Grill", 4, 25);
        Review rev = new Review(10, "Mohammad", "This Is a Great Food", res);
        assertEquals("Restaurant\nName : 99Grill\nprice : 25\nRate : 5.0\nReviews : [Review\nAuthor : Mohammad\nbody : This Is a Great Food\nStars : 5\n]", res.toString());
    }

    @Test
    void Restaurant_HighRateValue_MustNotOverComeFive_ReturnTrue() {
        Restaurant res = new Restaurant("99Grill", 10, 25);
        assertEquals(5, res.getRate());
    }

    @Test
    void Restaurant_HighRateValue_OnMultipleReview_MustNotOverComeFive_ReturnTrue() {
        Restaurant res = new Restaurant("99Grill", 10, 25);
        Review rev = new Review(10, "Mohammad", "This Is a Great Food", res);
        Review rev2 = new Review(25, "Ahmad", "not good enough", res);
        Review rev3 = new Review(40, "ASAC", "Amazing Food", res);
        assertEquals(5, res.getRate());
    }

    @Test
    void Restaurant_LowRateValue_OnNegativeNumber_HasToBeZero_ReturnTrue(){
        Restaurant res = new Restaurant("99Grill", -5, 25);
        assertEquals(0,res.getRate());
    }
    @Test void Restaurant_LowRateValue_OnMultipleReviews_HasToBeZero_ReturnTrue(){
        Restaurant res = new Restaurant("99Grill", 5, 25);
        Review rev = new Review(-25, "Mohammad", "This Is a Great Food", res);
        Review rev2 = new Review(-15, "Ahmad", "not good enough", res);
        Review rev3 = new Review(-2, "ASAC", "Amazing Food", res);
        assertEquals(0,res.getRate());
    }
    @Test
    void updateRating_BasedOn_MultipleReviews_ReturnUpdatedRateValue() {
        Restaurant res = new Restaurant("99Grill", 4, 25);
        Review rev = new Review(4, "Mohammad", "This Is a Great Food", res);
        Review rev2 = new Review(2, "Ahmad", "not good enough", res);
        Review rev3 = new Review(5, "ASAC", "Amazing Food", res);
        assertEquals(3.7, res.getRate());
    }
    @Test
    void  test(){
        Restaurant res = new Restaurant("99Grill", 4, 25);
        Review rev = new Review(5, "Mohammad", "High Rate Food", res);
        Review rev1 = new Review(5, "Mohammad", "High Rate Food", res);

        assertEquals( "sdasd",res.getReviews());
    }


}