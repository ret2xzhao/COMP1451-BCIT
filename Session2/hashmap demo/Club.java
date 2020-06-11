import java.util.HashMap;

/**
 * Store details of club memberships.
 * 
 * @author Bullwinkle Moose
 */
public class Club{
    private HashMap<String, Member> members;

    /**
     * Constructor for objects of class Club
     */
    public Club(){
        members = new HashMap<String, Member>(); 
    }

    /**
     * Add a new member to the club's list of members.
     * Members are stored with the last name as key.
     * @param member The member object to be added.
     */
    public void join(Member member){
        if(member != null){
            String name = member.getLastName();
            name = formatName(name);
            members.put(name, member);
        }
    }

    /**
     * Displays details of all members.
     */
    public void showMembers(){
        if(members != null){
            System.out.println("Members in the club.");
            for(String name : members.keySet()){
                Member thisOne = members.get(name);
                System.out.println(thisOne.getMemberInfo());
            }
        }
        else {
            System.out.println("No members to display.");
        }
    }
    
    /**
     * Retrieves the member whose last name this is
     * @param lastName 
     */
    public Member getMemberByName(String lastName){
        if(lastName != null){
            return members.get(formatName(lastName));
        }
        return null;
    }

    /**
     * Formats name so first letter is upper case and rest lower case
     * @param name name to format
     * @return formatted name
     */
    private String formatName(String name){
        String first = "";
        String rest = "";
        if(name != null && name.length() > 0) {
            first = name.substring(0,1).toUpperCase(); // get first letter
            if(name.length() > 1) {
                rest = name.substring(1).toLowerCase(); // get the rest
            }
        } 
        return first + rest;
    }
}