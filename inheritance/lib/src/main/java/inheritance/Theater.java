package inheritance;

import java.util.ArrayList;
import java.util.List;
public class Theater {
        private String name;
        private List<String> movies;
        private List<TReview> reviews;

        public Theater(String name) {
            this.name = name;
            this.movies = new ArrayList<>();
            this.reviews = new ArrayList<>();
        }

        public String addMovie(String movie) {
            if (!movies.contains(movie)) {
                movies.add(movie);
                return movie + " has been added to " + name + "'s movie lineup.";
            } else {
                return movie + " is already showing at " + name + ".";
            }
        }

        public String removeMovie(String movie) {
            if (movies.contains(movie)) {
                movies.remove(movie);
                return movie + " has been removed from " + name + "'s movie lineup.";
            } else {
                return movie + " is not currently showing at " + name + ".";
            }}


    public void addReview(TReview review) {
        if (!reviews.contains(review)) {
            reviews.add(review); }}


}
