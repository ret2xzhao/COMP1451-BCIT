package nine;

class Customer {
    public static void main(String[] args) {
        try {
            McDonalds m = new McDonalds("new YORK  steak");
            System.out.println("yay! my order worked");
        }
        catch(IllegalFoodOrderException e) {
            System.out.println("it didn't work");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        finally {
            System.out.println("ALWAYS EXECUTED");
        }
    }
}