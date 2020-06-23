package ca.bcit.comp1451.a00898485;

import java.util.HashMap;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;

/**
 * Class Country: All the provinces of Canada
 *
 * @author Xin Zhao (A00898485) with Pallveen Kaur
 * @version 1.0
 */

public class Country
{
    // Instance Variables:
    private String[][] provinces = new String[10][2];
    private HashMap<String, String> provincesOfCanada;

    public Country()
    {
        // A two-dimensional array:
        provinces[0][0] = "ab";
        provinces[1][0] = "bc";
        provinces[2][0] = "mb";
        provinces[3][0] = "nb";
        provinces[4][0] = "nl";
        provinces[5][0] = "ns";
        provinces[6][0] = "on";
        provinces[7][0] = "pe";
        provinces[8][0] = "qc";
        provinces[9][0] = "sk";

        provinces[0][1] = "alberta";
        provinces[1][1] = "british columbia";
        provinces[2][1] = "manitoba";
        provinces[3][1] = "new brunswick";
        provinces[4][1] = "newfoundland";
        provinces[5][1] = "nova scotia";
        provinces[6][1] = "ontario";
        provinces[7][1] = "prince edward island";
        provinces[8][1] = "quebec";
        provinces[9][1] = "saskatchewan";
    }

    /**
     * Loops through the provinces array and creates a HashMap whose keys are the province abbreviations and whose values
     * are the province names.
     */
    public void createHashMap()
    {
        provincesOfCanada = new HashMap<String, String>();
        if(provincesOfCanada != null)
        {
            for(int i=0; i<10; i++)
            {
                provincesOfCanada.put(provinces[i][0], provinces[i][1]);
            }
            System.out.println("The True North, strong and free.");
        }
        else
        {
            System.out.println("HashMap is failed to create.");
        }
    }

    /**
     * Uses an EntrySet Map to display all of the keys and values in the following format:
     * "The abbreviation ab is for the province of Alberta" (note: your method must upper case the first letter and lower case
     * the rest of the province name).
     */
    public void showAllMappings()
    {
        if(provincesOfCanada != null)
        {
            Set<Map.Entry<String, String>> set = provincesOfCanada.entrySet();
            for(Map.Entry<String, String> sl : set)
            {
                System.out.println("The abbreviation "+sl.getKey()+" is for the province of "+formatName(sl.getValue()));
            }
        }
        else
        {
            System.out.println("ERROR: The HashMap can not be null.");
        }
    }

    /**
     * Uses a Set and an Iterator to display all of the keys and values in the following format: "The province Alberta has
     * an abbreviation of ab" (note: your method must upper case the first letter and lower case the rest of the province name).
     */
    public void showAllMappings2()
    {
        if(provincesOfCanada != null)
        {
            Set<String> keys = provincesOfCanada.keySet();
            Iterator<String> it = keys.iterator();
            while(it.hasNext())
            {
                String abbreviation = it.next();
                String province = formatName(provincesOfCanada.get(abbreviation));
                System.out.println("The province " + province + " has an abbreviation of " + abbreviation);
            }
        }
        else
        {
            System.out.println("ERROR: The HashMap can not be null.");
        }
    }

    /**
     * @param substring
     * @return true if and only if any province contains the substring.
     */
    public boolean doesAnyProvinceContain(String substring)
    {
        if(provincesOfCanada != null)
        {
            if(substring != null)
            {
                Set<Map.Entry<String, String>> set = provincesOfCanada.entrySet();
                for(Map.Entry<String, String> sl : set)
                {
                    if(sl.getValue().contains(substring))
                    {
                        System.out.println("The provinces contain the substring.");
                        return true;
                    }
                }
                System.out.println("The provinces do not contain the substring.");
                return false;
            }
            else
            {
                System.out.println("ERROR: Invalid Input.");
                return false;
            }
        }
        else
        {
            System.out.println("ERROR: The HashMap can not be null.");
            return false;
        }
    }

    /**
     * Return the properly-formatted name. The names will be formatted with the first letter in upper case and the
     * rest in lower case.
     * @param name The name in String to be formatted.
     * @return A formatted name in String.
     */
    private String formatName(String name)
    {
        name = name.trim();
        String first = "";
        String rest = "";
        if(name != null && name.length() > 0)
        {
            first = name.substring(0,1).toUpperCase(); // get first letter
            if(name.length() > 1)
            {
                rest = name.substring(1).toLowerCase(); // get the rest
            }
        }
        return first + rest;
    }
}