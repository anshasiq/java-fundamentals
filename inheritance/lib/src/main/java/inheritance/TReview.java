package inheritance;

import java.util.List;

public class TReview {
    private String body;
    private String author;
    private int stars;
    private String movie;
    private Theater T;



    public TReview(String body, String author, int stars, String movie,Theater t) {
        this.body = body;
        this.author = author;
        this.stars = stars;
        this.movie=movie;
        this.T = t;
        T.addReview(this);
    }



    public String getBody(){
        return this.body;
    }
    public String getAuthor(){
        return this.author;
    }
    public int getStars(){
        return this.stars;
    }
    public String getmovie(){
        return this.movie;
    }

    @Override
    public String toString() {
        return "TReview{" +
                "body='" + body + '\'' +
                ", author='" + author + '\'' +
                ", stars=" + stars +
                ", movie='" + movie + '\'' +
                ", T=" + T +
                '}';
    }
}
