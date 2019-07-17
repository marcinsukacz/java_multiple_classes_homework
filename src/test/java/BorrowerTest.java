import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Book book;
    Library library;

    @Before
    public void setup(){
        borrower = new Borrower("Marcin");
        book = new Book("Witcher", "Zbigniew Sapkowski", "Fantasy");
        library = new Library();
        library.addBook(book);
    }

    @Test
    public void borrowerHasName(){
        assertEquals("Marcin", borrower.getName());
    }

    @Test
    public void borrowerHasZeroBooksAtStart(){
        assertEquals(0, borrower.countBooks());
    }

    @Test
    public void borrowerCanBorrowBookFromLibrary(){
        assertEquals(1, library.collectionCount());
        this.borrower.borrowBookFromLibrary(library);
        assertEquals(1, borrower.countBooks());
        assertEquals(0, library.collectionCount());
    }



}
