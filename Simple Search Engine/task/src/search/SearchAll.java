package search;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SearchAll extends Search{

    public SearchAll() {
    }

    @Override
    public void search(String[] toSearch, ArrayList<String> words) {
        for (String word : words) {
            boolean all = true;
            Set<String> row = new HashSet<>(Arrays.asList(word.toLowerCase().split(" ")));

            for (String search : toSearch) {
                if (!row.contains(search.toLowerCase())) {
                    all = false;
                }
            }

            if (all) System.out.println(word);
        }
    }
}
