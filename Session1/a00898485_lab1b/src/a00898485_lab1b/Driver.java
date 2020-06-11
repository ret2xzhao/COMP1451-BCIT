package a00898485_lab1b;

/**
 * 
 * @author Xin Zhao (A00898485)
 * @version 04/16/2020
 * 
 */
public class Driver{
    /**
     * @param args
     */
    public static void main(String[] args){
        new Driver().test();
    }
	
    /**
     * Creates members and add them to the club for testing
     */
    public void test(){
        // Initializing a Member[] Array of size 10:
        Club club = new Club(10);

        // Adding 8 new members to our club:
        club.join(new Member("JEFF", "BEZOS", 1, 2015));
        club.join(new Member("BILL", "GATES", 5, 2013));
        club.join(new Member("BERNARD", "ARNAULT", 7, 2018));
        club.join(new Member("WARREN", "BUFFETT", 9, 2012));
        // First name is null:
        // ("LARRY","ELLISON")
        club.join(new Member(null, "ELLISON", 1, 2014));
        // Last name is empty:
        // ("AMANCIO","ORTEGA")
        club.join(new Member("AMANCIO", "", 13, 2015));
        // Both the month and the year are out of range:
        club.join(new Member("MARK", "ZUCKERBERG", -1, 2020));
        club.join(new Member("JIM", "WALTON", 8, 2013));

        // Showing all members of our club:
        System.out.println("There are " + club.numberOfMembers() +  " members currently in our club:");
        club.showMembers();
		
        // Showing all members joined in 2013: 
        System.out.println("Show all members joined in 2013:");
        club.showMembersByYear(2013);
		
        // After removing all members joined in 2015:
        // Showing all members of our club:
        club.removeMembersByYear(2015);
        System.out.println("After removing all members joined in 2015:");
        System.out.println("There are " + club.numberOfMembers() +  " members currently in our club:");
        club.showMembers();
		
        // Adding 2 new members to our club:
        club.join(new Member("ALICE", "WALTON", 4, 2017));
        club.join(new Member("ROB", "WALTON", 11, 2010));

        // Showing all members of our club:
        System.out.println("After adding 2 new members to our club:");
        System.out.println("There are " + club.numberOfMembers() +  " members currently in our club:");
        club.showMembers();
    }
}