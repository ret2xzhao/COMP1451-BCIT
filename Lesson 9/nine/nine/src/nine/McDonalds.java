package nine;

class McDonalds {
    /**
     * @param order the food to be microwaved and delivered
     * @throws IllegalFoodOrderException if steak is ordered
     */
    McDonalds(String order) throws IllegalFoodOrderException {
        if(order.toLowerCase().contains("steak")) {
            throw new IllegalFoodOrderException("we don't have steak");
        }
        System.out.println("thank you for your order");
    }
}