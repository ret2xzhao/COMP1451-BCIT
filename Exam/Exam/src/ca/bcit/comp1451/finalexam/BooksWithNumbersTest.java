package ca.bcit.comp1451.finalexam;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BooksWithNumbersTest{
    private BooksWithNumbers b;

    @Before
    public void setUp() throws Exception {
        b = new BooksWithNumbers();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test1() {
        assertEquals(4, b.getNumberOfBooks());
        assertEquals("nineteen eighty four", b.getTitle(1984));
        assertEquals("2001: a space odyssey", b.getTitle(2001));
        assertEquals("catch 22", b.getTitle(22));
        assertEquals("farenheit: 451", b.getTitle(451));
    }

    @Test
    public void test2(){
        b.addTitle(100, "one hundred years of solitude");
        assertEquals(5, b.getNumberOfBooks());
        assertEquals("one hundred years of solitude", b.getTitle(100));
    }

    @Test
    public void test3(){
        assertTrue(b.getTitles().contains("nineteen eighty four"));
        assertTrue(b.getTitles().contains("farenheit: 451"));
        assertTrue(b.getTitles().contains("2001: a space odyssey"));
        assertTrue(b.getTitles().contains("catch 22"));

        b.addTitle(100, "one hundred years of solitude");
        assertTrue(b.getTitles().contains("one hundred years of solitude"));
        assertTrue(b.getTitles().contains("nineteen eighty four"));
        assertTrue(b.getTitles().contains("farenheit: 451"));
        assertTrue(b.getTitles().contains("2001: a space odyssey"));
        assertTrue(b.getTitles().contains("catch 22"));

        b.addTitle(2,  "a tale of two cities");
        assertTrue(b.getTitles().contains("a tale of two cities"));
        assertTrue(b.getTitles().contains("one hundred years of solitude"));
        assertTrue(b.getTitles().contains("nineteen eighty four"));
        assertTrue(b.getTitles().contains("farenheit: 451"));
        assertTrue(b.getTitles().contains("2001: a space odyssey"));
        assertTrue(b.getTitles().contains("catch 22"));	
    }

    @Test
    public void test4(){
        System.out.println(b.getTitles());
    }

    @Test
    public void test5() throws NoSuchTitleException{
        b.addTitle(100, "one hundred years of solitude");
        int x = b.getKeyFor("ONE HunDReD YeaRS of SOLITUde");
        assertEquals(100, x);
    }

    @Test
    public void test6() throws NoSuchTitleException{
        b.addTitle(100, "one hundred years of solitude");
        int x = b.getKeyFor("one hundred YEARS of SOLITUDE");
        assertEquals(100, x);
    }

    @Test
    public void test7() throws NoSuchTitleException{
        int x = b.getKeyFor("catcH 22");
        assertEquals(22, x);
    }

    @Test
    public void test8() throws NoSuchTitleException{
        int x = b.getKeyFor("CATch 22");
        assertEquals(22, x);
    }

    @Test
    public void test9(){
        try{
            int x = b.getKeyFor("this book is not in our collection");
            fail();
        }catch(NoSuchTitleException e){
            assertEquals("No such book title: this book is not in our collection", e.getMessage());
        }catch(Exception e){
            fail();
        }
    }

    @Test
    public void test10(){
        try{
            int x = b.getKeyFor("nope");
            fail();
        }catch(NoSuchTitleException e){
            assertEquals("No such book title: nope", e.getMessage());
        }catch(Exception e){
            fail();
        }
    }
}