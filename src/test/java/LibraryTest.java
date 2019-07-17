import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book;


    @Before
    public void before(){
        library = new Library();
        book = new Book("Witcher", "Zbigniew Sapkowski", "Fantasy");
    }

    @Test
    public void collectionStartsEmpty(){
        assertEquals(0, library.collectionCount());
    }

    @Test
    public void canAddBookWhenSpace(){
        this.library.addBook(this.book);
        assertEquals(1, library.collectionCount());
    }
    @Test
    public void canRemoveBook(){
        this.library.addBook(this.book);
        this.library.removeBook();
        assertEquals(0, library.collectionCount());
    }

    @Test
    public void cannotAddBookWhenNoSpace(){
        this.library.addBook(this.book);
        this.library.addBook(this.book);
        this.library.addBook(this.book);
        this.library.addBook(this.book);
        assertEquals(3, library.collectionCount());
    }
}

// Create your own library class with an internal collection of books.
//    Books should have title, author and genre.
//        Write a method to count the number of books in the library.
//        Write a method to add a book to the library stock.
//        Add a capacity to the library and write a method to check if stock is full before adding a book.