package ca.bcit.comp1451.a00898485;

/**
 * class MainTest
 *
 * @author Xin Zhao (A00898485) with Man Lee
 * @version 1.0
 */

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    public void testFirstName(){
        try{
            Name name = new Name(" ", "SEDGEWICK");
            fail("First name should not be empty.");
        }catch(InvalidArgumentException e){
            assertEquals("Error: Invalid Name::firstName.", e.getMessage());
        }

        try{
            Name name = new Name(null, "SEDGEWICK");
            fail("First name should not be null.");
        }catch(InvalidArgumentException e){
            assertEquals("Error: Invalid Name::firstName.", e.getMessage());
        }
    }

    @Test
    public void testLastName(){
        try{
            Name name = new Name("robert", " ");
            fail("Last name should not be empty.");
        }catch(InvalidArgumentException e){
            assertEquals("Error: Invalid Name::lastName.", e.getMessage());
        }

        try{
            Name name = new Name("robert", null);
            fail("Last name should not be null.");
        }catch(InvalidArgumentException e){
            assertEquals("Error: Invalid Name::lastName.", e.getMessage());
        }
    }

    @Test
    public void testBookAuthorName(){
        try{
            Book book = new Book(null, "Algorithms", 2012);
            fail("Author's name can not be null.");
        }catch(InvalidArgumentException | InvalidBookDateException e){
            assertEquals("Error: Invalid Book::authorName.", e.getMessage());
        }
    }

    @Test
    public void testBookTitle(){
        try{
            Book book = new Book(new Name("robert", "SEDGEWICK"), " ", 2016);
            fail("Title should not be empty.");
        }catch(InvalidArgumentException | InvalidBookDateException e){
            assertEquals("Error: Invalid Book::title.", e.getMessage());
        }

        try{
            Book book = new Book(new Name("robert", "SEDGEWICK"), null, 2016);
            fail("Title should not be null.");
        }catch(InvalidArgumentException | InvalidBookDateException e){
            assertEquals("Error: Invalid Book::title.", e.getMessage());
        }
    }

    @Test
    public void testBookYearPublished(){
        try{
            Book book = new Book(new Name("robert", "SEDGEWICK"), "Algorithms", 2017);
            fail("Year published can not greater than 2016.");
        }catch(InvalidArgumentException | InvalidBookDateException e){
            assertEquals("Error: Invalid Book::yearPublished.", e.getMessage());
        }

        try{
            Book book = new Book(new Name("robert", "SEDGEWICK"), "Algorithms", -1);
            fail("Year published can not less than 0.");
        }catch(InvalidArgumentException | InvalidBookDateException e){
            assertEquals("Error: Invalid Book::yearPublished.", e.getMessage());
        }
    }

    @Test
    public void testBiographySubject(){
        try{
            Biography bio = new Biography(new Name("Ron", "Chernow"), "Alexander Hamilton", 2005, null);
            fail("The subject of biography can not be null.");
        }catch(InvalidArgumentException | InvalidBookDateException e){
            assertEquals("Error: Invalid Biography::subject.", e.getMessage());
        }
    }
}