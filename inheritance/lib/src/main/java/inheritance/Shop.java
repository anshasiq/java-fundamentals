package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Shop {

    String name;
    String description;
    int numberofdollar;
    private List<Review> reviews;
    public Shop(String name, String description, int numberofdollar) {
        this.name = name;
        this.description = description;
        this.numberofdollar = numberofdollar;
        this.reviews = new ArrayList<>();
    }


  public String getName(){
        return  name;
 }

    public void addReview(Review review) {
        if (!reviews.contains(review)) {
            reviews.add(review);
//            updateAverageStars();
        }
    }
    public List<Review> getReviews() {
        return this.reviews;
    }
    @Override
    public String toString() {
        return "Shop{" +  "name='" + name + '\'' +  ", description='" + description + '\'' +", numberofdollar=" + numberofdollar + '}';
    }
}


