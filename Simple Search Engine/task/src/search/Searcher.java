package search;

import java.util.ArrayList;
import java.util.Scanner;

public class Searcher {
    Scanner scanner;
    private String method;
    Search search;

    public Searcher(Scanner scanner) {
        this.scanner = scanner;
    }

    public void search(ArrayList<String> words) {
        switch (method) {
            case "ANY":
                search = new SearchAny();
                break;
            case "ALL":
                search = new SearchAll();
                break;
            case "NONE":
                search = new SearchNone();
                break;
            default:
                break;
        }
        String[] toSearch = scanner.nextLine().split(" ");
        search.search(toSearch, words);
    }


    public void setMethod(String method) {
        this.method = method;
    }

    /*
    @Deprecated
    public void search(ArrayList<String> words) {
        System.out.println("\nEnter a name or email to search all suitable people.");
        String searchedWord = scanner.nextLine();
        int length = searchedWord.length();
        for (String word : words) {
            boolean found = false;
            if (word.length() >= length) {
                for (int i = 0; i < word.length() - length + 1; i++) {
                    if (word.substring(i, i + length).equalsIgnoreCase(searchedWord)) {
                        found = true;
                    }
                }
            }
            if (found) {
                System.out.println(word);
            }
        }
    }

    */


}
