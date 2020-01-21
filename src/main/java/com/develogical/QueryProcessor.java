package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("John")) {
            return "For testing purposes only " +
                    "" +
                    "";
        }
        return "";
    }
}
