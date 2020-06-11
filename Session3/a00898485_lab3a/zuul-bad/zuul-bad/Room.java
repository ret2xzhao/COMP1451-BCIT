/**
 * Class Room - a room in an adventure game.
 *
 * This class is part of the "World of Zuul" application.
 * "World of Zuul" is a very simple, text based adventure game.
 *
 * A "Room" represents one location in the scenery of the game.  It is
 * connected to other rooms via exits. The exits are labeled north,
 * east, south, west. For each direction, the room stores a reference
 * to the neighboring room, or null if there is no exit in that direction.
 *
 * @author  Michael Kolling and David J. Barnes
 */
import java.util.HashMap;
import java.util.Set;

public class Room
{
    private String description;
    private HashMap<String, Room> exits;

    /**
     * Create a room described "description". Initially, it has
     * no exits. "description" is something like "a kitchen" or
     * "an open court yard".
     * @param description The room's description.
     */
    public Room(String description)
    {
        this.description = description;
        exits = new HashMap<String, Room>();
    }

    /**
     * Define the exits of this room.  Every direction either leads
     * to another room or is null (no exit there).
     * @param direction A string to set the direction.
     * @param Room The room on that direction.
     */
    public void setExits(String direction, Room adjacentRoom)
    {
        exits.put(direction, adjacentRoom);
    }

    /**
     * @return The description of the room in String.
     */
    public String getDescription()
    {
        return description;
    }

    /**
     * Display all the choices of exits to leave the indicated room.
     * @param Room The indicated room.
     */
    public void getChoices(Room room)
    {
        String choices = "Exits: ";
        Set<String> directions = exits.keySet();
        for(String oneDirection : directions) {
            choices = choices + oneDirection + " ";
        }
        System.out.println("You are " + room.getDescription());
        System.out.println(choices);
    }

    /**
     * Following the indicated direction, if there is an adjacent room,
     * return the room. If not, return null.
     * @param direction A string to indicate the direction.
     * @return The room in the given direction of the current room.
     */
    public Room getRoom(String direction) {
        if(direction != null && !direction.isEmpty()) {
            boolean ifContain = exits.containsKey(direction);
            if(ifContain) {
                return exits.get(direction);
            }
            else {
                return null;
            }
        }
        else {
            return null;
        }
    }
}