package eight;

public interface Flyable {
    // data is automatically public, static, and final
    // whether or not it is labeled as such
    public static final int MAX_SPD_KM_PER_SEC = 300000;
    public static final int a = 1;
    static final int  b = 2;
    public final int  c = 3;
    public static int d = 4;
    int e = 5;

    public abstract void fly();
    void land(); // still public and abstract

    default public void concrete() {
        System.out.println("this is a concrete method");
    }
}