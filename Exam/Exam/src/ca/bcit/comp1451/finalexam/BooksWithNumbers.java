package ca.bcit.comp1451.finalexam;

import java.util.HashMap;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;

public class BooksWithNumbers {
    private HashMap<Integer, String> booktitles = new HashMap<Integer, String>();

    public BooksWithNumbers() {
        if(booktitles != null) {
            booktitles.put(1984, "nineteen eighty four");
            booktitles.put(2001, "2001: a space odyssey");
            booktitles.put(22,   "catch 22");
            booktitles.put(451,  "farenheit: 451");
        }
        Set<Integer> keys = booktitles.keySet();
        Iterator<Integer> it = keys.iterator();
        while(it.hasNext()) {
            String title = booktitles.get(it.next());
            System.out.println(title);
        }
    }

    public String getTitle(int key) {
        Set<Map.Entry<Integer, String>> set = booktitles.entrySet();
        for(Map.Entry<Integer, String> s1 : set) {
            if(key == s1.getKey().intValue()) {
                return booktitles.get(s1.getKey().intValue());
            }
        }
        return null;
    }

    public int getNumberOfBooks() {
        return booktitles.size();
    }

    public void addTitle(int number, String title) {
        if(booktitles != null) {
            if(title != null && !title.isEmpty()) {
                booktitles.put(number, title.toLowerCase());
            }
        }
    }

    public String getTitles() {
        String result = "";
        Set<Integer> keys = booktitles.keySet();
        Iterator<Integer> it = keys.iterator();
        while(it.hasNext()) {
            result = result + booktitles.get(it.next());
        }
        return result;
    }

    public int getKeyFor(String title) throws NoSuchTitleException {
        int result = 0;
        boolean flag = false;
        if(title != null) {
            Set<Map.Entry<Integer, String>> set = booktitles.entrySet();
            for(Map.Entry<Integer, String> s1 : set) {
                if(title.toLowerCase().equals(s1.getValue())) {
                    flag = true;
                    result = s1.getKey().intValue();
                    return result;
                }
            }
            if(flag == false) {
                throw new NoSuchTitleException("No such book title: " + title);
            }
        }
        return result;
    }
}