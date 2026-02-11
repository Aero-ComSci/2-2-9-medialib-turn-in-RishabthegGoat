public class Movie
{
  private String title;
  private double duration;
  private int rating;

  public Movie(String t, double d)
  {
    title = t;
    duration = d;
    rating = 0;
  }

  public void setRating(int r)
  {
    rating = r;
  }

  public String toString()
  {
    return title + " (" + duration + " hrs), rating: " + rating;
  }
}
