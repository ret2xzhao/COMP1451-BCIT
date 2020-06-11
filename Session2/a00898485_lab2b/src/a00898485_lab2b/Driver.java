package a00898485_lab2b;

/**
 * 
 * @author Xin Zhao (A00898485)
 * @version 04/23/2020
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
     * Creates EmailInfo and add friends' names and email addresses to the addressBook for testing.
     */
    public void test(){
        // Initializing an EmailInfo:
        EmailInfo emailInfo = new EmailInfo();
        emailInfo.listAll();

        // Adding some names and email addresses to the addressBook:
        emailInfo.addFriend("", "aaa@gmail.com");
        emailInfo.addFriend(null, "bbb@gmail.com");
        emailInfo.addFriend("aaa", "");
        emailInfo.addFriend("bbb", null);
        System.out.println();

        emailInfo.addFriend("bILL GATES", "Billgates@gmail.com");
        emailInfo.addFriend("BILL GATES", "Billgates2@gmail.com");
        emailInfo.addFriend("BERNARD ARNAULT", "bernardARNAULT@gmail.com");
        emailInfo.addFriend(" WARREN BUFFETT", "     warrenbuffett@gmail.com ");
        emailInfo.addFriend("LARRY ELLISON", "larryellison@gmail.com");
        emailInfo.addFriend("AMANCIO ORTEGA", "amancioortega@gmail.com");
        emailInfo.addFriend("MARK ZUCKERBERG", "markzuckerberg@gmail.com");
        emailInfo.addFriend("JIM WALTON", "waltons@gmail.com");
        emailInfo.addFriend("ALICE WALTON", "waltons@gmail.com");
        emailInfo.addFriend("ROB WALTON", "waltons@gmail.com");
        emailInfo.listAll();

        // Removing some names from the addressBook:
        emailInfo.removeFriend("");
        emailInfo.removeFriend(null);
        System.out.println();
        emailInfo.removeFriend("bILLGATES");
        emailInfo.removeFriend("bill GATES");
        emailInfo.removeFriend("BILl GATES");
        System.out.println();

        // Getting the email address of a friend:
        emailInfo.getAddress("");
        emailInfo.getAddress(null);
        System.out.println();
        emailInfo.getAddress("BERNARD ARNAULT");
        emailInfo.getAddress("ERNARD ARNAULT");
        System.out.println();

        // Finding the friends by the email address:
        emailInfo.findFriends("");
        emailInfo.findFriends(null);
        System.out.println();
        emailInfo.findFriends("mancioortega@gmail.com");
        emailInfo.findFriends("waltons@gmail.com");
        System.out.println();

        // List all friends and their email addresses:
        emailInfo.listAll();
    }
}