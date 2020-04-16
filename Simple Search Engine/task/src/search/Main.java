package search;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);

        File file = new File(args[1]);
        Scanner scanFile = new Scanner(file);
        FileRead readerFile = new FileRead(scanFile);
        ArrayList<String> words = readerFile.read();

        Searcher searcher = new Searcher(scanner);

        int menu;

        do {
            System.out.println("\n=== Menu ===");
            System.out.println("1. Find a person");
            System.out.println("2. Print all people");
            System.out.println("0. Exit");
            menu = Integer.parseInt(scanner.nextLine());

            switch (menu) {
                case 1:
                    System.out.println("Select a matching strategy: ALL, ANY, NONE");
                    searcher.setMethod(scanner.nextLine());
                    searcher.search(words);
                    break;
                case 2:
                    System.out.println("\n=== List of people ===");
                    for (String word : words) {
                        System.out.println(word);
                    }
                    break;
                case 0:
                    System.out.println("\nBye");
                    break;
                default:
                    System.out.println("Incorrect option! Try again.");
                    break;
            }
        } while (menu != 0);
    }
}
