package three;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class NHL
{
    public static void main(String[] args)
    {
        HashMap<Integer, String> scoringLeaders;
        scoringLeaders = new HashMap<>();
        scoringLeaders.put(2015, "benn");
        scoringLeaders.put(2016, "kane");
        scoringLeaders.put(2017, "mcdavid");
        scoringLeaders.put(2018, "mcdavid");
        scoringLeaders.put(2019, "kucherov");

        // get a Set of keys and iterator through it
        Set<Integer> yearKeys = scoringLeaders.keySet();
        Iterator<Integer> it = yearKeys.iterator();

        while(it.hasNext())
        {
            int year = it.next();
            String leaderLastName = scoringLeaders.get(year);
            System.out.println("The leader in year " + year + " was " + leaderLastName);
        }
        // ------------------------------------------------------------------

        Set<Map.Entry<Integer, String>> set = scoringLeaders.entrySet();
        for(Map.Entry<Integer, String> sl : set)
        {
            System.out.println(sl.getKey() + " was won by " + sl.getValue());
        }

        // Java has autoboxed the int 2019 to be new Integer(2019)
        // 2019 has been wrapped in an Integer object
        // 2019 has been promoted to an Integer object

        System.out.println(scoringLeaders);

        Integer x = 2020;
        Integer y = new Integer(2020);

        int z = y; // unboxing; just 2020, nothing else

        System.out.println(x.doubleValue());
        System.out.println(z);

        // double Double, char Character, int Integer, boolean Boolean
    }
}