package inheritance;

import java.util.ArrayList;
import java.util.Iterator;

public class Points {
    public int stars;
    private ArrayList<Review> review = new ArrayList<>();

    public Points() {

    }


    public void addReview(Review review) {
        if (!this.review.contains(review)) {
            this.review.add(review);
        }
        int sum = 0;

        Review review1;
        for (Iterator iterator = this.review.iterator();
             iterator.hasNext();
             sum = (int) ((int) sum + review1.stars)) {
            review1 = (Review) iterator.next();
        }
        this.stars = (int) (sum / this.review.size());
    }
    }

