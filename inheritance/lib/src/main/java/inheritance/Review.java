package inheritance;

public class Review {
    String body;
    int stars;
    String author;

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Review(String body, int stars, String author){
        this.body = body;
        this.stars=stars;
        this.author = author;

    }
}
