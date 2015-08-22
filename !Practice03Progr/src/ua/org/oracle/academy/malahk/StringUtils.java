package ua.org.oracle.academy.malahk;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Admin on 15.06.2015.
 */
public class StringUtils {

    public static final String REGEX = " ";

    public static Map<String, Integer> wordCount(String s) {
        Map<String, Integer> map = new HashMap<>();
        String[] temp = s.split(REGEX);
        for (String string : temp) {
            map.put(string, (map.containsKey(string)) ? map.get(string) + 1 : 1);

        }
        return map;
    }

}
