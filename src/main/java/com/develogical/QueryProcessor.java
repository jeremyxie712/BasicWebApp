package com.develogical;
import java.util.Collections;
import java.util.regex.*;
import java.util.ArrayList;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }

        if (query.toLowerCase().contains("largest")){
            String new_query = query.toLowerCase();
            ArrayList<Integer> allMatches = new ArrayList<Integer>();
            Matcher m = Pattern.compile("[0-9]+")
                    .matcher(new_query);
            while (m.find()) {
                allMatches.add(Integer.valueOf(m.group()));
            }
         return String.valueOf(Collections.max(allMatches));
        }

        else if (query.toLowerCase().contains("plus")){
            String new_query = query.toLowerCase();
            System.out.println(new_query);
            ArrayList<Integer> allMatches = new ArrayList<Integer>();
            Matcher m = Pattern.compile("[0-9]+")
                    .matcher(new_query);
            while (m.find()) {
                allMatches.add(Integer.valueOf(m.group()));
            }

            Integer result = 0;
            for (Integer temp : allMatches) {
                System.out.println(temp);
                result += temp;
            }
            return String.valueOf(result);
        }

        return "";
    }
}
