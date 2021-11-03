package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Theater {
    private String name;
    private int stars;
    private ArrayList<Review> review = new ArrayList<>();
    public List<String> movies= new ArrayList<>();

    public Theater(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public ArrayList<Review> getReview() {
        return review;
    }

    public void setReview(ArrayList<Review> review) {
        this.review = review;
    }

    public List<String> getMovies() {
        return movies;
    }

    public void setMovies(List<String> movies) {
        this.movies = movies;
    }

    @Override
    public String toString() {
        return " movies : {"  + "name='" + name + '\'' + ", reviews=" + review + ", movies=" + movies +"}";
    }
    public void addMovie(String movieName) {
        this.movies.add(movieName);
    }

    public void removeMovie(String movieName) {
        this.movies.remove(movieName);
    }


    public void addReview(Review Review) {
        if (!review.contains(Review)) {
            review.add(Review);
        }
            int sum = 0;
            for (Review reviewNum : review) {
                sum += reviewNum.stars;
            }
            stars = sum / review.size();
        }
    }

