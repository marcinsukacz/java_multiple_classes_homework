import java.util.ArrayList;

public class Library {
    private int capacity;
    private ArrayList<Book> collection;

    public Library(){
        this.capacity = 3;
        this.collection = new ArrayList<Book>();
    }

    public int collectionCount() {
        return this.collection.size();
    }

    public void addBook(Book book) {
        if(this.collection.size() < this.capacity) {
            this.collection.add(book);
        }
    }

    public Book removeBook(){
        return this.collection.remove(0);
    }
}


//   Create your own library class with an internal collection of books.
//    Books should have title, author and genre.
//        Write a method to count the number of books in the library.
//        Write a method to add a book to the library stock.
//        Add a capacity to the library and write a method to check if stock is full before adding a book.
