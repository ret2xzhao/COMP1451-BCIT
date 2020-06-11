package a00898485_lab1b;

/**
 * Club: A club can hold a fixed number of members stored in an Member[ ] Array.
 * 
 * @author Xin Zhao (A00898485)
 * @version 04/16/2020
 */

public class Club{
    // Symbolic Constants:
    public static final int CURRENT_YEAR = 2018;

    // Instance Variable:
    private Member[] members;
    private int size;
    
    /**
     * Constructor for objects of class Club
     * @param size An int to initialize the Member[] Array.
     */
    public Club(int size){
    	setSize(size);
    	members = new Member[size];
    }
    
    /**
     * Sets the size of Member[] Array.
     * @param size An int to set the size of Member[] Array.
     */
    public void setSize(int size){
        if(size > 0){
            this.size = size;
        }
        else{
            throw new IllegalArgumentException("Invalid input size.");
        }
    }
    
    /**
     * Gets the size of Member[] Array.
     */
    public int getSize(){
        return size;
    }
    
    // Methods:
    /**
     * Adds a member to the club. New Members will be added to the first null index in the Array.
     * @param member A member to add to the club.
     */
    public void join(Member member){
        boolean ifJoined = false;
        if(member != null){
            for(int i=0; i<size; i++){
                if(members[i] == null && ifJoined == false){
                	members[i] = member; 
                    ifJoined = true;
                }
            }
        }
    }
    
    /**
     * Returns the count of members.
     */
    public int numberOfMembers(){
        int count = 0;
    	for(int i=0; i<size; i++){
            if(members[i] != null){
                count = count + 1;
            }
        }
    	return count;
    }
    
    /**
     * Displays the details of all members in the club.
     */
    public void showMembers(){
    	System.out.println("The details of all members:");
    	for(Member oneMember:members){
    	    if(oneMember != null){
                System.out.println("Name: " + oneMember.getFirstName() + " " + oneMember.getLastName());
    	        System.out.println("Month Joined: " + oneMember.getMonthOfJoin());
    	        System.out.println("Year Joined: " + oneMember.getYearOfJoin() + "\n");
    	    }
    	}
    }
    
    /**
     * Displays the details of only those members who joined in the specified year.
     * @param year A year in int that those members who joined in the club.
     */
    void showMembersByYear(int year){
    	if(year < 0 || year > CURRENT_YEAR){
    	    throw new IllegalArgumentException("YEAR INPUT ERROR: invalid input.");
    	}
    	else{
    	    System.out.println("The details of all members who joined in " + year +":");
    	    for(int i=0; i<size; i++){
    	        if(members[i] != null && members[i].getYearOfJoin() == year){
                    System.out.println("Name: " + members[i].getFirstName() + " " + members[i].getLastName());
                    System.out.println("Month Joined: " + members[i].getMonthOfJoin());
                    System.out.println("Year Joined: " + members[i].getYearOfJoin() + "\n");
                }
            }
        }
    }
    
    /**
     * Removes all members who joined in the specified year.
     * @param year A year in int that those members who joined in the club.
     */
    void removeMembersByYear(int year){
    	if(year < 0 || year > CURRENT_YEAR){
    	    throw new IllegalArgumentException("YEAR INPUT ERROR: invalid input.");
    	}
    	else{
    	    for(int i=0; i<size; i++){
                if(members[i] != null && members[i].getYearOfJoin() == year){
                	members[i] = null;
                }
            }
        }
    }
}