package search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SearchAny extends Search{

    public SearchAny() {
    }

    @Override
    public void search(String[] toSearch, ArrayList<String> words) {
        for (String word : words) {
            boolean any = false;
            Set<String> row = new HashSet<>(Arrays.asList(word.toLowerCase().split(" ")));

            for (String search : toSearch) {
                if (row.contains(search.toLowerCase())) {
                    any = true;
                }
            }

            if (any) System.out.println(word);
        }
    }
}
