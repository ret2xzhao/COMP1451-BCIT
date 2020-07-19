package nine;

public class IllegalFoodOrderException extends RuntimeException {
    public IllegalFoodOrderException(String m) {
        super(m);
    }
}