package a00898485_lab2b;

import java.util.HashMap;

/**
 * EmailInfo: Store your friends' email addresses. Assume for now that each friend has only one email address and
 * that you don't have friends with identical names.
 * 
 * @author Xin Zhao (A00898485)
 * @version 04/23/2020
 */
public class EmailInfo {
    // Instance Variable:
    private HashMap<String, String> addressBook;

    /**
     * Constructor for objects of class EmailInfo.
     */
    public EmailInfo(){
        addressBook = new HashMap<String, String>();
    }

    /**
     * Return the properly-formatted name. The names will be formatted with the first letter in upper case and the 
     * rest in lower case.
     * @param name The name in String to be formatted.
     * @return A formatted name in String.
     */
    private String formatName(String name) {
        name = name.trim();
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

    /**
     * Add a friend to the address book. The friend's name must be formatted before being stored.
     * @param name The friend's name in String to be added.
     * @param email The friend's email address in String to be added.
     */
    public void addFriend(String name, String email) {
        if(email != null && !email.isEmpty()) {
            if(name != null && !name.isEmpty()) {
                email = email.trim();
                boolean ifContain = addressBook.containsKey(formatName(name));
                if(ifContain) {
                    System.out.println("Already has this name.");
                }
                else {
                    addressBook.put(formatName(name), email.toLowerCase());
                    System.out.println(formatName(name) + " added.");
                }
            }
            else {
                System.out.println("ERROR: invalid name.");
            }
        }
        else {
            System.out.println("ERROR: invalid email address.");
        }
    }

    /**
     * Remove a friend from the address book. The name passed in can be in upper case, lower case, or mixed.
     * The friend and his/her email will be removed from the address book.
     * @param name The friend's name in String to be removed.
     */
    public void removeFriend(String name) {
        if(name != null && !name.isEmpty()) {
            boolean ifContain = addressBook.containsKey(formatName(name));
            if(ifContain) {
                addressBook.remove(formatName(name));
                System.out.println(formatName(name) + " is removed.");
            }
            else {
                System.out.println("No matching name.");
            }
        }
        else {
            System.out.println("ERROR: invalid name.");
        }
    }

    /**
     * Return an email address based on friend's name. The name passed in can be in upper case, lower case, or mixed.
     * The friend's email address will be returned.
     * @param name The friend's name in String.
     * @return An email address in String of this friend.
     */
    public String getAddress(String name) {
        String address;
        if(name != null && !name.isEmpty()) {
            boolean ifContain = addressBook.containsKey(formatName(name));
            if(ifContain) {
                address = addressBook.get(formatName(name));
                System.out.println("Email address is: " + address);
                return address;
            }
            else {
                System.out.println("No matching name.");
                return null;
            }
        }
        else {
            System.out.println("ERROR: invalid name.");
            return null;
        }
    }

    /**
     * Find and display friends based on their email address. There might be more than one friend using the same email.
     * @param email The friends' email address in String to be searched.
     */
    public void findFriends(String email) {
        if(email != null && !email.isEmpty()) {
            email = email.trim();
            boolean ifContain = addressBook.containsValue(email.toLowerCase());
            if(ifContain) {
                System.out.println("Email address matched, the name(s) using this email address:");
                for(String name: addressBook.keySet()) {
                    if(addressBook.get(name).equals(email.toLowerCase())) {
                        System.out.print(name + "   ");
                    }
                }
                System.out.println();
            }
            else {
                System.out.println("No matching email address.");
            }
        }
        else {
            System.out.println("ERROR: invalid email address.");
        }
    }

    /**
     * List all friends and their email addresses.
     */
    public void listAll() {
        if(addressBook != null){
            System.out.println("There are " + addressBook.size() + " friends in the address book.");
            System.out.println("All friends and their email addresses in the address book:");
            for(String name : addressBook.keySet()){
                System.out.println("Name: " + name);
                System.out.println("Email Address: " + this.addressBook.get(name));
            }
            System.out.println();
        }
        else {
            System.out.println("No information to display.");
        }
    }
}