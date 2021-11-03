package inheritance;

import java.util.ArrayList;

public class Shop extends Points{


    private  String name;
    public  int stars;
    private String description;
    private int sign;

    private ArrayList<Review> reviews;

    public Shop(String name, String description, int sign) {
        this.name = name;
        this.description = description;
        this.sign = sign;
        this.reviews = new ArrayList<Review>();
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getSign() {
        return sign;
    }

    public void setSign(int sign) {
        this.sign = sign;
    }
//
//    public ArrayList<Review> getReview() {
//        return reviews;
//    }
//
//    public void setReview(ArrayList<Review> review) {
//        this.reviews = review;
//    }


    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", stars=" + stars +
                ", description='" + description + '\'' +
                ", sign=" + sign +
                ", review=" + reviews +
                '}';
    }


    public  void addReview( Review Review) {
        if (! reviews.contains(Review)){
            reviews.add(Review);
        }
        int sum = 0;
        for (Review review1 : reviews) {
            sum = sum + review1.stars;
        }
        stars = sum / reviews.size();
    }
}
