package inheritance;

public class Review {
  private   String body;
   public int stars;
  public   String author;


    public Review (String body, String author, int stars){
        this.body= body;
        this.author = author;
        this.stars=stars;
    }

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

    @Override
    public String toString() {
        return "Review {" + "author='" + author + '\'' + ", body='" + body + '\'' + ", stars=" + stars + '}';

    }
}


