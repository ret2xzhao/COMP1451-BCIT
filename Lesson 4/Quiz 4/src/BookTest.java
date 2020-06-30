import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BookTest{
    private Book book1;
    private Book book2;

    @Before
    public void setUp(){
        book1 = new Book(1986, "dracULA", "brAm", "sTOKER");
        book2 = new Book(2003, "perSUaSiON", "jaNE", "austen");
    }

    @After
    public void tearDown(){
        book1 = null;
        book2 = null;
    }

    @Test
    public void test1(){
        assertEquals("B.S.", book1.getAuthorInitials());
        assertEquals("J.A.", book2.getAuthorInitials());
    }

    @Test
    public void test2(){
        assertEquals("Dracula", book1.getTitle());
        assertEquals("Persuasion", book2.getTitle());
    }

    @Test
    public void test3(){
        assertEquals(book1.getYearPublished(), 1986);
        assertEquals(book2.getYearPublished(), 2003);
    }

    @Test
    public void test4(){
        assertEquals("Jane", book2.getAuthorFirstName());
        assertEquals("Bram", book1.getAuthorFirstName());
    }

    @Test
    public void test5(){
        assertEquals("austeN", book2.getAuthorLastName());
        assertEquals("stokeR", book1.getAuthorLastName());
    }

    @Test
    public void test6(){
        assertEquals("Reading", Book.getActivity());
    }

    @Test
    public void test7(){
        assertEquals("DRACULA WAS PUBLISHED BY BRAM STOKER IN 1986!", book1.getDetails());
        assertEquals("PERSUASION WAS PUBLISHED BY JANE AUSTEN IN 2003!", book2.getDetails());
    }

    @Test
    public void test8(){
        assertEquals("1455", Book.FIRST_BOOK_PUBLISHED_YEAR);
    }
}