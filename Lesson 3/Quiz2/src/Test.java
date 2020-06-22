public class Test{
    public static void main(String[] args){
    	new Test().test_q1();
    	new Test().test_q2();
    	new Test().test_q4();
    }

    // Test for Q1:
    public void test_q1() {
    	for(int i=0; i<100; i++)
    	{
    		Q1 q1 = new Q1();
    	}
    }
    
    // Test for Q2:
    public void test_q2() {
    	Q2 q2 = new Q2();
    	System.out.println(q2.getUserInputInt());
    }

    // Test for Q4:
    public void test_q4() {
    	Q4 q4 = new Q4();
    	q4.getTItleWith(1984);
    	q4.getTItleWith(5);
    	q4.getTItleWith(2);
    	q4.getTItleWith(-1); //null
    	q4.getTItleWith(0); //null
    	System.out.println("------------------------------");
    	q4.displayAllKeysAndValues();
    }
}