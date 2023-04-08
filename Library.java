import java.util.*;
class Book{
  private String title;
  private String publisher;
  private int booknumber;

Book(String title,String publisher,int booknumber){
  setTitle(title);
  setPublisher(publisher);
  setBooknumber(booknumber);
}
  void setTitle(String title){
    this.title=title;
  }
  void setPublisher(String publisher){
    this.publisher=publisher;
  }
  void setBooknumber(int booknumber){
    this.booknumber=booknumber;
  }
 String getTitle(){
   return title;
 }
  String getPublisher(){
   return publisher;
 }
  int getBooknumber(){
   return booknumber;
}
}
  public class Library{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      ArrayList<Book> books=new ArrayList<Book>();
      for(int i=0;i<3;i++){
        books.add(new Book(sc.next(),sc.next(),sc.nextInt()));
      }
      for(Book book:books){
        System.out.println(book.getTitle()+""+book.getPublisher()+""+book.getBooknumber());
      }
    }
  }

