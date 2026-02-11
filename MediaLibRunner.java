/*
 * Activity 2.2.7
 * 
 * The runner for the MediaLib program
 */
public class MediaLibRunner
{
  public static void main(String[] args)
  {
    System.out.println("Welcome to your Media Library");
    MediaLib myLib = new MediaLib();
    String title = "Martian";// title name
    Book myBook = new Book(title, "Andy Weir");
    System.out.println(myBook);
    title = "The Chronicles of Baez";
    String temp = "My book is better than yours";
    temp += myBook;
    int rating = 10;
    //object state changed
    myBook.setRating(rating);
    rating = 100;
    myLib.addBook(myBook);
    System.out.println(myLib);

    MediaLib mylib2 = new MediaLib();
    Book myBook2 = new Book("Pancho Viola", "unknown");
    mylib2.addBook(myBook2);
    myBook2.setTitle("Mr. Baez");//singularis
    mylib2.addBook(new Book("Myself", "Muself Yav"));
    System.out.println(mylib2);

  }
}
