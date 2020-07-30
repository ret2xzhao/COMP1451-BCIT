package ca.bcit.comp1451.finalexam;

import static org.junit.Assert.*;
import org.junit.Test;

public class XTest {
    private X x;

    public XTest(){
        x = new X();
    }

    @Test
    public void C1(){
        try{
            x.setC("aaaaaaaaaa");
            fail();
        }catch(TooLongException e){
            assertEquals("aaaaaaaaaa is more than five characters so it is too long!", e.getMessage());
        }catch(Exception e){
            fail();
        }
    }

    @Test
    public void C2(){
        try{
            x.setC("......");
            fail();
        }catch(TooLongException e){
            assertEquals("...... is more than five characters so it is too long!", e.getMessage());
        }catch(Exception e){
            fail();
        }
    }

    @Test
    public void C3(){
        try{
            x.setC(null);
            fail();
        }catch(TooShortException e){
            assertEquals("null is not allowed; it is fewer than five characters so it is too short!", e.getMessage());
        }catch(Exception e){
            fail();
        }
    }

    @Test
    public void C4(){
        try{
            x.setC("");
            fail();
        }catch(TooShortException e){
            assertEquals("empty string is fewer than five characters so it is too short!", e.getMessage());
        }catch(Exception e){
            fail();
        }
    }

    @Test
    public void C5(){
        try{
            x.setC("hi");
            fail();
        }catch(TooShortException e){
            assertEquals("hi is fewer than five characters so it is too short!", e.getMessage());
        }catch(Exception e){
            fail();
        }
    }

    @Test
    public void C6(){
        try{
            x.setC("99887");
            assertEquals("99887", x.getC());
        }catch(Exception e){
            fail();
        }
    }

    @Test
    public void C7(){
        assertTrue(x instanceof W);
    }
}