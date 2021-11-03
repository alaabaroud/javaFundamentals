package inheritance;

import java.util.LinkedList;

public class Restaurant extends Points{
    private  String name;
    private  int stars;
    private int   priceCategory;
    public LinkedList<Review> review = new LinkedList<Review>();

    public Restaurant(String name, int stars, int priceCategory) {
        this.name = name;
        this.stars = stars;
        this.priceCategory = priceCategory;

    }

    //////Setters and getters///////


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

    public int getPriceCategory() {
        return priceCategory;
    }

    public void setPriceCategory(int priceCategory) {
        this.priceCategory = priceCategory;
    }

    public  void addReview(Review Review) {
        if (!review.contains(Review)) {
            stars = stars+ Review.stars;
            review.add(Review);
        }
    }

    @Override
    public String toString() {
        String dollar = "";
        for (int i = 0; i <priceCategory ; i++) {
            dollar = dollar + "$";
        }
        return "Restaurant{" +
                "name='"
                + name +
                '\'' +
                ", stars=" +
                stars +
                ", priceCategory=" +
                dollar +
                ", " +
                "reviews=" +
                review + '}';
    }
}
