public class MediaLib
{
  private Book book;
  private static String owner = "Mr Baez";
  public static String getOwner() {
    return owner;
  }
  private Movie movie;

  private static int numberOfitems;

  public static int getNumberOfItems() {
    return numberOfitems;
  } 

  public void addBook(Book b)
  {
    book = b;
    numberOfitems++;
  }

  public void addMovie(Movie m)
  {
    movie = m;
  }

  public String toString() 
  {

    String info = "This book has been added: " + book;
    info += "\nThis movie has been added: " + movie;
    info += "\nNumber of items in library: " + numberOfitems;
  
    
    return info;
  }

  public Book getBook() {
    return book;
  }
  public void testBook(Book tester) {
    tester.setTitle("A new Title");
    System.out.println("The new title of the book is: " + tester.getTitle());
  }

}
