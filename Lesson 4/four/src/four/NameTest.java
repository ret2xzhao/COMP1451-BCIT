package four;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class NameTest
{
    private Name name;

    @BeforeEach
    public void setUp()
    {
        System.out.println("setting up");
        name = new Name("tiGEr", "wooDS");
    }

    @AfterEach
    public void tearDown()
    {
        System.out.println("tearing down");
    }

    @Test
    public void testGetFirst()
    {
        assertEquals("tiGEr", name.getFirst());
        name = new Name("chArliE", "shEEn");
        assertEquals("chArliE", name.getFirst());
    }

    @Test
    public void testGetLast1()
    {
        assertEquals("wooDS", name.getLast());
    }

    @Test
    public void testGetLast2()
    {
        name = new Name("chArliE", "shEEn");
        assertEquals("shEEn", name.getLast());
    }

    @Test
    public void testGetFullName1()
    {
        assertEquals("Tiger Woods", name.getFullName());
    }

    @Test
    public void testGetFullName2()
    {
        name = new Name("chArliE", "shEEn");
        assertEquals("Charlie Sheen", name.getFullName());
    }

    @Test
    public void testSetFirst()
    {
        name.setFirst("toNy");
        assertEquals("toNy", name.getFirst());
    }

    @Test
    public void testSetLast()
    {
        name.setLast("smITH");
        assertEquals("smITH", name.getLast());
    }

    @Test
    public void testGetInitials1()
    {
        assertEquals("T.W.", name.getInitials());
    }

    @Test
    public void testGetInitials2()
    {
        name = new Name("chArliE", "shEEn");
        assertEquals("C.S.", name.getInitials());
    }

    @Test
    public void testGetLastFirst1()
    {
        assertEquals("Woods, Tiger", name.getLastFirst());
    }

    @Test
    public void testGetLastFirst2()
    {
        name = new Name("chArliE", "shEEn");
        assertEquals("Sheen, Charlie", name.getLastFirst());
    }
}