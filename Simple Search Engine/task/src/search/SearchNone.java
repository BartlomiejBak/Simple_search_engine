package search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SearchNone extends Search{

    public SearchNone() {
    }

    @Override
    public void search(String[] toSearch, ArrayList<String> words) {
        for (String word : words) {
            boolean none = true;
            Set<String> row = new HashSet<>(Arrays.asList(word.toLowerCase().split(" ")));

            for (String search : toSearch) {
                if (row.contains(search.toLowerCase())) {
                    none = false;
                }
            }

            if (none) System.out.println(word);
        }
    }
}
