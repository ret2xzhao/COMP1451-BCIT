package ca.bcit.comp1451.finalexam;

public class X extends W{
    private String c;
    public static final int LENGTH = 5;
    public X() {
    }

    public void setC(String c) throws TooShortException, TooLongException {
        if(c == null) {
            throw new TooShortException("null is not allowed; it is fewer than five characters so it is too short!");
        }
        else if(c.isEmpty()) {
            throw new TooShortException("empty string is fewer than five characters so it is too short!");
        }
        else if(c.length() > LENGTH) {
            throw new TooLongException(c + " is more than five characters so it is too long!");
        }
        else if(c.length() < LENGTH){
            throw new TooShortException(c + " is fewer than five characters so it is too short!");
        }
        else {
            this.c = c;
        }
    }

    public String getC() {
        return this.c;
    }
}